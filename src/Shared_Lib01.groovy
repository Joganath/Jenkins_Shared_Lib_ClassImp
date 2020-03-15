package jenkins.sharedlib

class Shared_Lib01 {


def Code_Checkout()
{
	chckout scm
}
def Cleanup(String dir)
{
	sh "rm -r dir"
}

def Build()
{
	sh "mvn clean install"
}

}
