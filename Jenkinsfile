pipeline {
    agent any

    environment {
        FEATURE_PAYMENT_V2 = "false"   // default OFF
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/mahalakshmi191/payment-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac PaymentApp.java'
            }
        }

        stage('Run App') {
            steps {
                sh 'java PaymentApp'
            }
        }
    }
}
