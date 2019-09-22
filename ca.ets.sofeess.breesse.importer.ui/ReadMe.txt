Set DYLD_LIBRARY_PATH environment variable in Eclipse:

1) Go to Run -> Run Configurations... and Select tab "Environment".
2) Create a new variable:

	Name: DYLD_LIBRARY_PATH
	Value: /Applications/MATLAB_R2017b.app/bin/maci64
	
Workaround to prevent crash on 'run as Eclipse Application' in macOS Mojave: 

1) Go to Run -> Run Configurations... and Select tab "Arguments".
2) To "Program arguments" add 

	-nosplash
