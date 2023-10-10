pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building application'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the application'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application'
            }
        }
}
post {
        always {
           emailext body: '', subject: 'Pipeline status', to: 'jnknsccntuser@gmail.com'
        }
    }
}
