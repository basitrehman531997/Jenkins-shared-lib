def call(String imageName, String credentialsId) {
    withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh """
            docker login -u ${env.USERNAME} -p ${env.PASSWORD}
            docker image tag ${imageName} ${env.USERNAME}/${imageName}
            docker push ${env.USERNAME}/${imageName}
        """
    }
}
