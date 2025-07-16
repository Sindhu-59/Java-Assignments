class FacebookRunner{

	public static void main(String args[]){
			
		String Email="Baba123@gmail.com";
		String password="45baba85";
		long phno=8798585553l;
		
		Facebook.logIn( Email,password);
		Facebook.logIn( phno,password);
		
		System.out.println("The email is "+Email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
		}