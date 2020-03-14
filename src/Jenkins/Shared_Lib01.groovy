package jenkins_Sharedlib

class Shared_Lib01 {


def Code_Checkout()
{
	chckout scm
}
def Cleanup(String Dir)
{
	sh 'rm -r Dir'
}

def Build()
{
	sh 'mvn clean install'
}

}
