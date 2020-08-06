pipeline {
   agent any
    stages {
        stage('Verify') {
            steps {
                withCredentials([file(credentialsId: 'settings_github', variable: 'settings_github')]) {
                   writeFile file: 'settings_github.xml', text: readFile(settings_github)
                   sh "ls -la"
                }
            }
        }
        stage('Compile') {
            tools {
                maven 'mvn'
            }
            steps {
                sh 'mvn compile'
            }
        }
        stage('TestUT') {
            steps {
                withMaven(maven: 'mvn') {
                    sh 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                withMaven(maven: 'mvn') {
                    sh 'mvn deploy -s settings_github.xml '
                }
            }
        }
    }
    post {
        always {
            cleanWs()
            cleanWs cleanWhenNotBuilt: true, cleanWhenAborted: true, cleanWhenFailure: true, deleteDirs:true, notFailBuild:true
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}