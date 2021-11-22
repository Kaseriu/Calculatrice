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
                sh 'Run Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}