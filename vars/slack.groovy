

def slack_username(name){
    slackSend: message "UserName: ${name}"
}

def success_color(){
    return '#AAFF00'
}

def failure_color(){
    return 'FF0000'
}

def success_build(){
   slackSend(
        color: success_color(),
        message: "Build Successful - Job Name:${env.JOB_NAME}  Build Number:${env.BUILD_NUMBER}  Build URL:(<${env.BUILD_URL}|Open>)"
   )
}

def build_failure(){
   slackSend(
        color: failure_color(),
        message: "Build failed - Job Name:${env.JOB_NAME}  Build Number:${env.BUILD_NUMBER}  Build URL:(<${env.BUILD_URL}|Open>)"
   )
}


