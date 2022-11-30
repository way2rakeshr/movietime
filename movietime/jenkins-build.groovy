#!groovy
pipeline{
    agent : none

    environment{
        JAVA_HOME ="/usr/lib/java-1.8.0"
        MVN_HOME ="/usr/share/apache-maven"
        PATH = "$JAVA_HOME:$MVN_HOME"
    }
    stages{
        stage('BUILD'){
            steps{
                script{

                    echo"inside build stage"
                    sh "./mvnw clean install"
                }

            }

        }
    }

}