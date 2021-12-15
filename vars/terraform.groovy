def call(int options){
    switch(options){
        case 1:
            sh 'terraform init'
            break;  
        case 2:
            sh 'terraform plan'
            break; 
        case 3:
            sh 'terraform apply --auto-approve'
            break;
        case 4:
            sh 'terraform destroy --auto-approve'
            break;  
        default:
            sh "echo invalid choice"
            break;
        }
}
