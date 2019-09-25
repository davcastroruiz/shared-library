pipeline {
  agent {
    node {
      label 'Windows'
    }

  }
  stages {
    stage('Stage Shell Script') {
      steps {
        sh 'ipconfig'
      }
    }
    stage('Stage Print') {
      steps {
        echo '"ipconfig".execute().text'
      }
    }
    stage('') {
      steps {
        powershell(script: 'Get-ComputerInfo', returnStdout: true)
      }
    }
  }
}