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
                sh './test/java/org.example/AppTest()'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}