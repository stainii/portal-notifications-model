pipeline {
  agent {
    docker {
      image 'stainii/portal-web-app-base'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B clean install'
      }
    }
  }
}