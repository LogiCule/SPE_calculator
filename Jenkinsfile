pipeline {
    agent any

    environment {
        IMAGE_NAME = "scientific-calculator"
        CONTAINER_NAME = "scientific-calc"
        REGISTRY = "logicule"
        DOCKER_CREDENTIALS = "docker-hub-credentials"
        RECIPIENT_EMAIL = "rahul.dubey@iiitb.ac.in"
    }

    stages {

        stage("Cleanup Existing Containers") {
            steps {
                sh 'docker stop ${CONTAINER_NAME} || true'
                sh 'docker rm ${CONTAINER_NAME} || true'
            }
        }

        stage("Checkout Source Code") {
            steps {
                git branch: 'main', url: 'https://github.com/yourrepo.git'
            }
        }

        stage("Build Maven Project") {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage("Run Unit Tests") {
            steps {
                sh 'mvn test'
            }
        }

        stage("Package Application") {
            steps {
                sh 'mvn package'
            }
        }

        stage("Verify JAR File") {
            steps {
                sh 'ls -lh target/'
            }
        }

        stage("Build Docker Image") {
            steps {
                sh 'docker build -t ${IMAGE_NAME}:${BUILD_NUMBER} .'
            }
        }

        stage("Push Image to DockerHub") {
            steps {
                withCredentials([usernamePassword(
                        credentialsId: "${DOCKER_CREDENTIALS}",
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                )]) {

                    sh "echo ${DOCKER_PASS} | docker login -u ${DOCKER_USER} --password-stdin"
                    sh "docker tag ${IMAGE_NAME}:${BUILD_NUMBER} ${REGISTRY}/${IMAGE_NAME}:${BUILD_NUMBER}"
                    sh "docker push ${REGISTRY}/${IMAGE_NAME}:${BUILD_NUMBER}"
                }
            }
        }

        stage("Deploy using Ansible") {
            steps {
                sh 'ansible-playbook -i inventory deploy.yml'
            }
        }
    }

    post {
        success {
            mail to: "${RECIPIENT_EMAIL}",
                 subject: "Jenkins Pipeline Success: ${env.JOB_NAME}",
                 body: "Build completed successfully.\nCheck details: ${env.BUILD_URL}"
        }

        failure {
            mail to: "${RECIPIENT_EMAIL}",
                 subject: "Jenkins Pipeline Failed: ${env.JOB_NAME}",
                 body: "Pipeline failed.\nCheck logs: ${env.BUILD_URL}"
        }
    }
}