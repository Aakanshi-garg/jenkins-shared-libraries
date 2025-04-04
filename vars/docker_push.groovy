def call(String dockerHubUser , String imageName , String imageTag){
      withCredentials([usernamePassword(
                credentialsId: "dockerHubCred",
                usernameVariable: "dockerhubuser",
                passwordVariable: "dockerhubpass"
            )]) {
            sh "docker login -u $dockerhubuser -p $dockerhubpass"
            sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
