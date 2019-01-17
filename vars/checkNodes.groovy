import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*


def call(){
    Jenkins jenkins = Jenkins.instance
    def jenkinsNodes = jenkins.nodes
    while(1)
    {
        for (Node x in jenkinsNodes)
        {
            sleep(1)
            // Make sure slave is online
            println "some node can take jobs !!!"
        }
        sleep(1)
        return 0
    }
}