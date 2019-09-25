pipeline {
  agent any
  stages {
    stage('ipconfig') {
      parallel {
        stage('ipconfig') {
          steps {
            bat(script: 'ipconfig', returnStatus: true, returnStdout: true)
          }
        }
        stage('dir') {
          steps {
            bat(script: 'dir', returnStatus: true, returnStdout: true)
          }
        }
      }
    }
  }
}