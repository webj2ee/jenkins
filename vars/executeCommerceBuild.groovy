def call(commerceDir) {
	echo "##### Execute install script ##### -- ${commerceDir}"
	//addProperty(commerceDir, "solrserver.instances.default.autostart=false")
	bat "cd ${commerceDir}/hybris/bin/platform && setantenv.bat && ant clean all"
	//bat "cd ${commerceDir}/hybris/bin/platform && setantenv.bat && hybrisserver.bat"
} 
   
