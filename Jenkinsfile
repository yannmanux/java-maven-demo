pipeline {

    agent any

    tools {
        maven 'maven-3.9.0'
    }

    stages {

        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    
    }
    

}