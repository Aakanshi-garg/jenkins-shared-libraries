def call(String dockerHubUser , String imageName , String imageTag){
      withCredentials([usernamePassword(
                credentialsId: "dockerHubCred",
                usernameVariable: "dockerhubuser",
                passwordVariable: "dockerhubpass"
            )]) {
            sh "echo "$dockerhubpass" | docker login -u "$dockerhubuser" --password-stdin"
            sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
}
