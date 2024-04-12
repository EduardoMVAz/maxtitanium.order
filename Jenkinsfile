pipeline {
    agent any
    stages {
        stage('Jenkins Order') {
            steps {
                echo 'Order Interface'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}