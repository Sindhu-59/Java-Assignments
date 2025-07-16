class Linkdin{

	public static void logIn(String Email,String password){

        boolean isEmail = false;
        boolean ispassword = false;
        if (Email != null && Email.length() >= 3) {
            isEmail = true;
        } 
		else {
            System.out.println("Email is invalid. Please provide a proper Email");
        }

        if (password != null && password.length() >=8 &&!password.isEmpty()) {
            ispassword = true;
        } 
		else {
            System.out.println("Password is invalid. It should be at least 8 characters long.");
        }
	}

	
	public static void logIn(long phno, String password){
	
        boolean isphno = false;
        boolean ispassword = false;
	
	if (phno != 0) {
            isphno = true;
        } 
        else {
            System.out.println("Phone number is invalid. Please provide a 10-digit phone number.");
        }
		if (password != null && password.length() >=8 &&!password.isEmpty()) {
            ispassword = true;
        } else {
            System.out.println("Password is invalid. It should be at least 8 characters long.");
        }
	
		
	}
	}