def call(string DockerHubUser , string ImageName , string ImageTag){
  sh "docker build -t "${DockerHubUser}"/"${ImageName}":"${ImageTag}" ."
  
}
