pipeline{
    agent any
stages{
    stage('unittests'){
        steps{
	    sh 'mvn test'
	}
    }
    stage('SonarQube analysis'){
	def scannerHome = tool 'SonarScanner 4.0';
    	withSonarQubeEnv(installationName: 'internshipJulian') { 
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
    }
    post{
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}}
}
