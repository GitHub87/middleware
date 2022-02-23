#!/usr/bin/env groovy
pipeline {
	agent any
	
	environment {
		registry = "GitHUb87/angel"
		registryCredential = 'DockerHub'
		dockerImage = ''
		DATE = new Date().format('yy.M')
		TAG = "${DATE}"
	}
	
	stages {
		stage('Maven Build') {
			steps {
				echo 'Building artifact...'
				bat 'mvn clean install package'
			}
		}
		stage('Containerization') {
			steps {
				echo 'Creating container...'
				script {
					dockerImage = docker.build("sujoyb/angel:${TAG}", "--build-arg JAR_FILE=target/middleware-0.0.1-SNAPSHOT.jar")
				}
			}
		}
		stage('Push to image repo') {
			steps {
				echo 'Pushing to image repo...'
				script {
					docker.withRegistry('https://registry.hub.docker.com', 'DockerHub'){
						docker.image("sujoyb/angel:${TAG}").push()
						docker.image("sujoyb/angel:${TAG}").push("latest")
					}
				}
			}
		}
		stage('Deploy in Kube') {
			steps {
				echo 'Deploying...'
			}
		}
	
	}
}
