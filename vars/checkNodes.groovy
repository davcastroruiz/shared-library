import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*


def call(jenkinsNodes){
    for (Node node in ${jenkinsNodes})
        {
            if (!node.getComputer().isOffline()) 
            {
                if(node.getComputer().countBusy()==0)
                {
                    println "'$node.nodeName' can take jobs !!!"
                }
                else
                {
                    println "'$node.nodeName' is busy !!!"
                }
            }
             else
            {
                println "'$node.nodeName' is offline !!!"
            }
        }
}