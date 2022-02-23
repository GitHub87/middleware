#!/usr/bin/env groovy
pipeline {
	agent any
	
	environment {
		registry = "GitHUb87/angel"
		registryCredential = dockerhub
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
					dockerImage = docker.build(registry:${TAG})
				}
			}
		}
		stage('Push to image repo') {
			steps {
				echo 'Pushing to image repo...'
				script {
					docker.withRegistry(registry, registryCredential){
						docker.image("registry:${TAG}").push()
						docker.image("registry:${TAG}").push("latest")
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
