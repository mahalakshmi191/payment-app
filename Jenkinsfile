pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                deleteDir()
                git branch: 'main', url: 'https://github.com/mahalakshmi191/payment-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac PaymentApp.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java PaymentApp'
            }
        }
    }
}
