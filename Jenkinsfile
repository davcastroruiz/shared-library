pipeline {
  agent any
  stages {
    stage('Stage Print') {
      steps {
        echo '"ipconfig".execute().text'
        sh 'pip install python-pptx'
      }
    }
  }
}