class PassportSeva{

	static String givenName;
	static String surName;
	static String password;
	static String confirmPassword;
	
	public static boolean registerUser(String gName, String sName, String pwd, String cPwd){
	
		boolean isgName = false;
		boolean issName = false;
		boolean ispwd = false;
		boolean iscPwd = false;
		
		boolean isUserRegistered = false;
		
		boolean userValidated =PassportUserValidator.validateUserPassport(gName,sName,pwd,cPwd);
		if(userValidated == true)
			isUserRegistered = true;
		else
			System.out.println("User is not validated and registered success");
		
		return isUserRegistered;
		
		}
		
		public static void getUserInfo(){
			
			//givenName = PassportUserValidator.givenName;
			//surName = PassportUserValidator.surName;
			//password = PassportUserValidator.password;
			//confirmPassword = PassportUserValidator.confirmPassword;
		
		System.out.println("The given User Name is "+PassportUserValidator.givenName);
		System.out.println("The given User SurName is "+PassportUserValidator.surName);
		System.out.println("The given password is "+PassportUserValidator.password);
		System.out.println("The given confirm Password is "+PassportUserValidator.confirmPassword);
		
		}
}