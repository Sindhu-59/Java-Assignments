class Bank{
	static String balance="1000";
	public static void credit(String amount){
		System.out.println("main started");
			balance=balance + amount;
			System.out.println(balance);
			System.out.println("main ended");
		}
		}