pipeline {

    agent any

    tools {
        maven 'maven-3.6.3'
    }

    stages {

        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    
    }
    

}