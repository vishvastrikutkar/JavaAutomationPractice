node {
    stage('Checkout Repo')
    {
        echo 'This Checkout is stage'
        git branch: 'main', credentialsId: 'dfa253d8-2963-4f95-899b-0f51260e3acd', url: 'https://git.epam.com/vishvas_trikutkar/automationpractice.git'
    }
        env.PATH = "C:\\apache-maven-3.9.7\\bin;C:\\Program Files\\Java\\jdk-21\\bin;c:\\windows\\system32"
    
    stage('Build')
    {
        echo 'This Build is stage'
        bat 'mvn clean package'
    }
    stage('Artifact')
    {
        echo 'This Artifact is stage'
        archiveArtifacts artifacts: 'target/surefire-reports/*.html', followSymlinks: false
    }
    emailext body: 'Automation Job Body', subject: 'This is automation Job', to: 'vishvas_Trikutkar@epam.com'
}

