import com.rr.builds.Calculator



pipelien {
    agent any
    stages {
        stage ('addtionStage') {
            steps {
                script {
                    echo "printing sum of 2 numbers"
                    println calculator.add(3,4)
                }
            }
        }
    }
}