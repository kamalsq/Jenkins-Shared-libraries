def call(String url, String branch){
  echo "This is cloning the app"
  git url: "${url}", branch:"${branch}"
  echo "Code cloning successfull"
}
