package jenkins.sharedlib

class Shared_Lib01 {

def Cleanup(String dir)
{
	steps.sh 'rm -r dir'

	}

def Build()
{
	steps.sh "mvn clean install"

	}

}
