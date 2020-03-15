package jenkins.sharedlib
import org.apache.commons.lang3.SystemUtils

@Grab('org.apache.commons:commons-lang3:3.8.1')
class Shared_Lib01 {
def steps
Shared_Lib01(steps)
{
this.steps=steps
}

def Cleanup(String dir)
{
    steps.sh 'rm -r dir'
    

    }

def Build()
{
    steps.sh "mvn clean install"

    }

}
