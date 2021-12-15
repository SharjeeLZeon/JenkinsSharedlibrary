def slack_username(){
    return "sharjeel"
}

def success_color(){
    return '#AAFF00'
}

def failure_color(){
    return 'FF0000'
}

def success_build(job_name, build_num, url){
   message: "Build Successful - Job Name:${job_name}  Build Number:${build_num}  Build URL:(<${url}|Open>)"
}