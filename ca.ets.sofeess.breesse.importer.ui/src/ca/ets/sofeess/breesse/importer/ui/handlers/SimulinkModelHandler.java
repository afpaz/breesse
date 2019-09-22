/*
 * Copyright (c) 2016-2019 ÉTS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

/**
 * @author: Andrés Paz
 */

package ca.ets.sofeess.breesse.importer.ui.handlers;

import java.io.File;
import java.io.IOException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.ets.sofeess.breesse.importer.api.BreesseImporter;
import ca.ets.sofeess.breesse.importer.ui.BreesseImporterUIPlugin;

public class SimulinkModelHandler extends AbstractHandler {

    private boolean importLibraryModel = true;
    
    public void setImportLibraryModel(boolean importLibraryModel) {
        this.importLibraryModel = importLibraryModel;
    }

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((IStructuredSelection) selection).toList()) {
				if (element instanceof IFile) {
					IFile file = (IFile) element;
					handleFile(file);
				}
			}
		}
		return null;
	}

	protected void handleFile(IFile file) {
		String simulinkModelName = file.getName().substring(0, file.getName().lastIndexOf("."));

		Job job = new Job("Importing " + simulinkModelName + " Simulink block diagram...") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				BreesseImporter simulinkImporter = new BreesseImporter();
				try {
					Object[] result = simulinkImporter.importModel(file.getLocation().toOSString());
					String libraryModelName = (String) result[1];
					boolean allReferencedModelsImported = ((Boolean) result[2]).booleanValue();
//					boolean allReferencedBlocksImported = ((Boolean) result[3]).booleanValue();
					if (libraryModelName != null) {
						Display.getDefault().syncExec(new Runnable() {
	                        @Override
	                        public void run() {
	                            setImportLibraryModel(MessageDialog.openQuestion(Display.getDefault().getActiveShell(), "Information",
	                                    "'" + simulinkModelName + "' references Simulink block diagram '" + libraryModelName + 
	                                    "'. Do you want to import the referenced block diagram?"));
	                        }
	                    });
						if (importLibraryModel) {
							File libraryFile = new File(file.getParent().getLocation().toOSString() + File.separator + libraryModelName + ".slx");
							if (libraryFile.exists()) {
								result = simulinkImporter.importLibraryIntoExistingEMFSimulinkModel((EObject) result[0], file.getParent().getLocation().toOSString() + File.separator + libraryModelName);
							} else {
								Display.getDefault().syncExec(new Runnable() {
			                        @Override
			                        public void run() {
										MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Information",
			                                    "The Simulink block diagram '" + libraryModelName + "' cannot be found in the project. "
			                                    		+ "Place the file in the project and try importing the original Simulink file again.");
			                        }
			                    });
							}
						}
					}
					if (!allReferencedModelsImported/* && !allReferencedBlocksImported*/) {
						Display.getDefault().syncExec(new Runnable() {
	                        @Override
	                        public void run() {
	                            MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Information",
	                                    "'" + simulinkModelName + "' references other Simulink models or libraries that were not imported because the files were not found.");
	                        }
	                    });
					}
					simulinkImporter.saveSimulinkModel((EObject) result[0]);
				} catch (IOException e) {
					Status status = new Status(Status.ERROR, BreesseImporterUIPlugin.PLUGIN_ID,
							"Error while importing/saving the Simulink block diagram.", e);
					BreesseImporterUIPlugin.getDefault().getLog().log(status);
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(Display.getDefault().getActiveShell(),
									"Error!",
									"Error while importing/saving the Simulink block diagram.");
						}
					});
				} finally {
					simulinkImporter.closeMatlabSession();
					
					for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
					    try {
							project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
	}

}
