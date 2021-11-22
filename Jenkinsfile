pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'java --version'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}