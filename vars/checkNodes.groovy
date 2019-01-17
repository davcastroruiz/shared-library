import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*


def call(){
    Jenkins jenkins = Jenkins.instance
    def jenkinsNodes =jenkins.nodes
    def results = ''
    while(1)
    {
        for (Node node in jenkinsNodes) 
        {
            sleep(1)
            echo "$node"
            // Make sure slave is online
            if (!node.getComputer().isOffline()) 
            {           
                //Make sure that the slave busy executor number is 0.
                if(node.getComputer().countBusy()==0)
                {
                    echo "'$node.nodeName' can take jobs !!!"
                }
                else
                {
                    echo "'$node.nodeName' is busy !!!"
                }
            }
            else
            {
                echo "'$node.nodeName' is offline !!!" 
            }
        }
        sleep(1)
        return 0
    }
}