def call(String url, String branch){
  echo "this is cloning the code"
  git url: "$(url)", branch: "${branch}
  echo "Code Clonning successful"
}
