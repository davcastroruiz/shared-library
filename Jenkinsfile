pipeline {
  agent any
  stages {
    stage('Stage Print') {
      steps {
        echo '"ipconfig".execute().text'
        bat(script: 'pip install python-pptx', returnStdout: true)
      }
    }
    stage('Selenium Install') {
      steps {
        bat(script: 'pip install selenium', returnStdout: true)
      }
    }
  }
}