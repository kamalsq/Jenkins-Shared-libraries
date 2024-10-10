def call(Srting ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
