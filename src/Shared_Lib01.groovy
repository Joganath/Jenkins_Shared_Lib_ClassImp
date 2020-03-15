package jenkins.sharedlib
import 
class Shared_Lib01 {


def Code_Checkout()
{
	chckout scm
}
def Cleanup()
{
	sh "rm -r ${WORKSPACE}"
}

def Build()
{
	sh "mvn clean install"
}

}
