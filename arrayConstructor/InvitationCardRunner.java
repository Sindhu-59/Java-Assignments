class InvitationCardRunner {
    public static void main(String[] args) {

        InvitationCard c1 = new InvitationCard("Wedding Bells","Golden","Wedding","A5");
       
        System.out.println("Title: " + c1.title);
        System.out.println("Color: " + c1.color);
        System.out.println("Occasion: " + c1.occasion);
        System.out.println("Size: " + c1.size);
				
        InvitationCard c2 = new InvitationCard(10.0);
        System.out.println("Price: " + c2.price);
		
        InvitationCard c3 = new InvitationCard(false);
        System.out.println("Printed: " + c3.isPrinted);
        
 }
}
