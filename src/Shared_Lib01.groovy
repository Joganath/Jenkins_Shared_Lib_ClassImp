package jenkins.sharedlib
import org.apache.commons.lang3.SystemUtils

@Grab('org.apache.commons:commons-lang3:3.8.1')
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
