class Netflix{

	public static String logIn(String userName,String email, String password){
	
	boolean isuserName=false;
	boolean isemail=false;
	boolean ispassword=false;
	
	if(userName!=null && userName.length()>4 || email!=null && email.length()>3 ){ 
	
		isuserName=true;
		isemail=true;
		return email;
	}
	else{
		System.out.println("The username is invalid");
	}
	
	if(password!=null && password.length()==10 && !password.isEmpty()){
		ispassword=true;
	}
	else{
		System.out.println("The password is incorrect");
	
	}
	return password;
	}
	
	public static void logIn(long phno, String password){
	
	boolean isphno=false;
	boolean ispassword=false;
	
	if(phno !=0){
	
		isphno=true;
	}
		else{
	
				System.out.println("The phno is incorrect");
				
	if(password!=null && password.length()==10 && !password.isEmpty()){
	
		ispassword=true;
	}
	else{
		System.out.println("The password is incorrect");
	
	
	}
	}
	}
}