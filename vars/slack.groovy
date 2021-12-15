

def slack_username(){
    return "sharjeel"
}

def success_color(){
    return '#AAFF00'
}

def failure_color(){
    return 'FF0000'
}

def success_build(){
   slackSend message: "Build Successful - Job Name:${env.JOB_NAME}  Build Number:${env.BUILD_NUMBER}  Build URL:(<${env.BUILD_URL}|Open>)"
}