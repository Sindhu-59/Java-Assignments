class ChatsShop{
	public static void main(String chat[]){
		String Panipuri = "panipuri";
		String Golgappa ="golgappa";
		String Masalapoori ="masalapoori";
		String tikkiPoori ="TikkiPoori";
		String KharaMasala="kharaMasala";
		String nipatMasala="NipatMasala";
		String bhelPoori="BhelPoori";
		String PotatoTwister="potatoTwister";
		String Gobi="gobi";
		String dahiPoori="DahiPoori";
		
	String chats[]={Panipuri,Golgappa,Masalapoori,Tikki Poori,Khara Mandakki,Nipat Masala,Bhel Poori,Potato Twister,Gobi,dahi Poori};
	
	System.out.println("The number of chats "+chats.length);
	//System.out.println(chats[0]+" "+chats[1]+" "+chats[2]+" "+chats[3]+" "+chats[4]+" "+chats[5]+" "+chats[6]+" "+chats[7]+" "+chats[8]+" "+chats[9]);
	for(String chat:chats){
			System.out.println(chat);
		}
	}
}