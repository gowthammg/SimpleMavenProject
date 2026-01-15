pipeline {
    agent any
    stages {
        stage('Current Directory'){
            steps{
                //dir('C:\\Sprint\\Jenkins\\') {
                    bat 'Package.bat'
                    echo pwd()
                //}
            }
        }
        stage('Archive the Jars'){
            steps{
                dir('C:\\WINDOWS\\system32\\config\\systemprofile\\.m2\\repository\\gowtham\\simplemaven\\0.0.3') {
                    archiveArtifacts artifacts: 'simplemaven-0.0.3.jar', followSymlinks: false
                }
            }
        }
    }
    post{
        success{
            echo "Jar is built successfully........."
            build wait: false, job: 'Test Pipeline', waitForStart: true
        }
        always{
            dir('C:\\Users\\MG08\\eclipse-workspace\\simplemaven\\target\\surefire-reports'){
                testNG failedFails: 80, failedSkips: 0, unstableFails: 20, unstableSkips: 50
            }
        }
    }
}

