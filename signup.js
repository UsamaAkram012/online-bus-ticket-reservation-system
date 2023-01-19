
function validate(){

    if(name_validate() && email_validate() 
	&& pass_validate() && match_pass()){ return true;}
    else return false;
}


function name_validate(){	

	if (document.signup.name.value == "" ){
			alert("Name cannot be empty!");
			return false;
	    }
        else
			return true;
}


function email_validate(){	
		var atSymbol =  document.signup.email.value.indexOf("@");
		var dot =  document.signup.email.value.indexOf(".");
		if (document.signup.email.value == "" ){
			alert("Email cannot be empty!");	
			return false;
	    }
		else if(atSymbol < 1) {
			alert("Invalid Email Address!");
			return false;
		}
		
		else if(dot <= atSymbol + 2){
			alert("Invalid Email Address!");				
			return false;
		}
		
		else if (dot === document.signup.email.value.length - 1) {
			alert("Invalid Email Address!");				
			return false;
		}

        else
			return true;
}

function pass_validate(){	
	if (document.signup.password.value == "" ){
			alert("Password can't be empty!");
			return false;
	   }	
    else
	    return true;

}

function match_pass(){
	if(document.signup.password.value != document.signup.cnfrmpassword.value){
		alert("Passward and Confirm Password do not match!");
		return false;
	}
	return true;
}