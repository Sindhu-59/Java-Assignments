class InstagramRunner{

	public static void main(String[] args){
	
		String userName="Baba59";
		String email="Baba123@gmail.com";
		long phno=8754834622l;
		String password="djsjhg23";
		
		Instagram.logIn(userName,email,password);
		Instagram.logIn(phno,password);
		
		System.out.println("The username is "+userName);
		System.out.println("The email is "+email);
		System.out.println("The phno is "+phno);
		System.out.println("The password is "+password);
		
		}
		}