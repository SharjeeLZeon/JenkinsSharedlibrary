def call(int options){
    switch(options){
        case 1:
            return "terraform init";
                
        case 2:
            return "terraform plan";
                
        case 3:
            return "terraform apply --auto-approve";
                
        case 4:
            return "terraform destroy --auto-approve";
                
        default:
            return "invalid choice";
                
        }
}