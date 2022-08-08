def call(codeNumber) {
    script {
        while (true) {
          withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'commerceCloudCredentials', usernameVariable: 'subscriptionId', passwordVariable: 'token']]) {
              result = bat (script: "curl --location --request GET 'https://portalrotapi.hana.ondemand.com/v2/subscriptions/${subscriptionId}/builds/$codeNumber' --header 'Authorization: Bearer ${token}'",returnStdout:true)
          }
          echo "$result"
          statusResult = readJSON text: "$result"

          if("SUCCESS".equals(statusResult["status"])) {
            break;
          }

          if("FAIL".equals(statusResult["status"])) {
            error("Build was not completed successfully on SAP Commerce Cloud")
          }

          sleep(10)

        }

        echo "Commerce Cloud Build Complete"
    }
}  
