pipeline {

    agent any


     environment {
    NEXUS_URL = 'http://45.79.210.176:8081/#browse/browse:maven-public'
    NEXUS_CREDENTIAL_ID = 'manunexus'
    MAVEN_SETTINGS_FILE = 'maven-settings.xml'
     }
  

    stages {

        stage('build artifact') {
            steps {
                sh 'mvnw clean install'
            }
        }
    
        }
    

}