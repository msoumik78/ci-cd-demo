pipeline {
    agent any

    stages {
        stage('Docker Build') {
            steps {
                echo 'Building..'
                sh "docker build -t soumik/java  -f Dockerfile1 ."

            }
        }
        stage('Dockerhub login') {
            steps {
                echo 'Login..'
                sh "docker login --username msoumik78@gmail.com --password JoyshreeMahakalbaba22$"
            }
        }
        stage('Dockerhub Tag') {
            steps {
                echo 'Tagging..'
                sh "docker tag soumik/java msoumik78/java"
            }
        }

        stage('Dockerhub Push') {
            steps {
                echo 'Pushing..'
                sh "docker push msoumik78/java"
            }
        }

    }
}
