def call(string dockerHubUser , string imageName , string imageTag){
      withCredentials([usernamePassword(
                credentialsId: "dockerHubCred",
                usernameVariable: "dockerhubuser",
                passwordVariable: "dockerhubpass"
            )]) {
            sh "docker login -u $dockerhubuser -p $dockerhubpass"
            sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
