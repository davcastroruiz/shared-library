import hudson.FilePath
import hudson.model.Node
import hudson.model.Slave
import jenkins.model.Jenkins
import groovy.time.*

@NonCPS
def call(jenkinsNodes){
    println jenkinsNodes
    println "can take jobs !!!"
    for (Node node in jenkinsNodes) 
        {
            println node.nodeName
        }
}