import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*


Jenkins jenkins = Jenkins.instance
def jenkinsNodes =jenkins.nodes
    
def call(){
    while(1)
    {
        for (Node x in jenkinsNodes)
        {
            sleep(1)
            // Make sure slave is online
            if (!x.getComputer().isOffline())
            {
                if(x.getComputer().countBusy()==0)
                {
                    println "'$x.nodeName' can take jobs !!!"
                }
                else
                {
                    println "$x.nodeName' is busy !!!"
                }
            }
            else
            {
                println "'$x.nodeName' is offline !!!" 
            }
        }
        sleep(1)
        return 0
    }
}