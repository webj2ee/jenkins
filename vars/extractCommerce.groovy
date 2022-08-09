def call(commerceDir) {
    echo ##### your workspace directory where commerce zip file is palced #####
    def workspace = "C:/jenkins/workspace"
    echo "##### Extract commerce platform ##### -- ${commerceDir}"
    //bat "unzip -o ../CXCOM2005*.ZIP -d ${commerceDir}/core-customize"
    /** Uncomment if you will be using the Integration Extension Pack
    echo "##### Extract commerce integration pack #####"
    sh "unzip -o ../CXCOMINTPK2005*.ZIP -d ${commerceDir}/core-customize"
    **/
    bat "tar -xvf ${workspace}/CXCOM200500P_0-70004955.zip  -C ${commerceDir}"
}  
