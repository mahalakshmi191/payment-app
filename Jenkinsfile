pipeline {
    agent any

    environment {
        FEATURE_PAYMENT_V2 = "true"   // 👈 ADD HERE
    }

    stages {
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
