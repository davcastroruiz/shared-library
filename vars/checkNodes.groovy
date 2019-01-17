import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*

def call(jenkinsNodes){
    while(1)
    {
        for (Node node in jenkinsNodes) 
        {
            sleep(10)
            // Make sure slave is online
            if (!node.getComputer().isOffline()) 
            {           
                //Make sure that the slave busy executor number is 0.
                if(node.getComputer().countBusy()==0)
                {
                    println "'$node.nodeName' can take jobs !!!"
                }
                else
                {
                    println "$node.nodeName' is busy !!!"
                }
            }
            else
            {
                println "'$node.nodeName' is offline !!!" 
            }
        }
        sleep(10)
        return 0
    }
}