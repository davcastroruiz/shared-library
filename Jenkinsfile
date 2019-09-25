pipeline {
  agent {
    node {
      label 'Windows'
    }

  }
  stages {
    stage('Stage Print') {
      steps {
        echo '"ipconfig".execute().text'
      }
    }
    stage('error') {
      steps {
        powershell(script: 'Get-ComputerInfo', returnStdout: true)
      }
    }
  }
}