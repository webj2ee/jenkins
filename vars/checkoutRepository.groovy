def call(commerceDir, branch, projectRepository) {
    urlPrefix = "https://"
	repoDomainPart = projectRepository.substring(urlPrefix.size())
    repository = "https://$USERNAME:$PASSWORD@" + repoDomainPart
	echo "##### Checkout repository ${repository} #####"
    
    /**withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'githubCodeRepoCredentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {        
        repoDomainPart = projectRepository.substring(urlPrefix.size())
        repository = "https://$USERNAME:$PASSWORD@" + repoDomainPart
        echo "##### Checkout repository #####"
        bat """cd ${commerceDir} && git clone ${repository} . && git fetch --all && git checkout origin/${branch}"""
    }**/
}
