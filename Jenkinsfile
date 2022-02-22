#!/usr/bin/env groovy
pipeline {
	agent any
	
	stages {
		stage('Maven Build') {
			steps {
				echo 'Building...'
			}
		}
		stage('Containerization') {
			steps {
				echo 'Creating container...'
			}
		}
		stage('Push to image repo') {
			steps {
				echo 'Pushing to image repo...'
			}
		}
		stage('Deploy in Kube') {
			steps {
				echo 'Deploying...'
			}
		}
	
	}
}
