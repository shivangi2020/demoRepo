pipeline {
    agent any

     tools {
       
        // Install the Maven version configured as "M3" and add it to the path.
        maven "apache-maven-3.5.3"
    }
    
    stages {
        stage('Build Code') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/shivangi2020/My_project.git'           
            }          
        }
		stage('Build Code') {
            steps {
                // Get some code from a GitHub repository
                mvn "clean"          
            }          
        }
    }
}
