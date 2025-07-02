class SocialMedia{
	
	public static void main(String [] args){
		String twitter="Twitter";
		String insta="Insta";
		String fb="Fb";
		String youtube="Youtube";
		String kick="Kick";
		String threads="Threads";
		String tiktok="Tiktok";
		String Mozz="mozz";
		String Reddit="reddit";
		String Telegram="telegram";

		String socialMedia[]={twitter,insta,fb,youtube,kick,threads,tiktok,Mozz,Reddit,Telegram};

		System.out.println("The number of socialMedia are " +socialMedia.length);
		System.out.println(socialMedia[0]+ "" +socialMedia[1]+ "" +socialMedia[2]+ "" +socialMedia[3]+ "" +socialMedia[4]+ "" +socialMedia[5]+ "" +socialMedia[6]+ "" +socialMedia[7]+ "" +socialMedia[8]+ "" +socialMedia[9] );
		for(String Socialmedia:SocialMedia){
			System.out.println(Socialmedia);
		}
	}
}
	