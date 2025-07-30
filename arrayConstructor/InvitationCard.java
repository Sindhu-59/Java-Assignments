class InvitationCard {
    String title;
    String color;
    String occasion;
    String size;
    double price;
    boolean isPrinted;

    
    InvitationCard(String title, String color, String occasion, String size){
		this.title = title;
        this.color = color;
        this.occasion = occasion;
        this.size = size;
	}
	InvitationCard(double price){
		this.price = price;
	}
	InvitationCard(boolean isPrinted) {
       
        this.isPrinted = isPrinted;
    }

    }
