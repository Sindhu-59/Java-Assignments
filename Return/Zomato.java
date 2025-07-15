class Zomato {
    public static void vegAndNonVeg(String menu) {
	String price=null;	
        if (menu=="Thali")
			price="180";
			return price;
		
        else if (menu=="Fried Chicken")
			price="220";
		return price;
		
        else if (menu=="Grilled Sandwich")
			price="90";
		return price;
		
        else if (menu=="Veg Thali")
			price="150";
		return price;
		
        else if (menu=="Non-Veg Thali")
			price="200";
		return price;
		
        else if (menu=="Paneer Butter Masala")
			price="160";
	    return price;
		
        else if (menu=="Veg Pulao")
			price="100";
		return price;
		
        else if (menu=="Chicken Curry")
			price="170";
		return price;
		
        else if (menu=="Fish Fry")
			price="190";
		return price;
		
        else if (menu=="Egg Curry")
			price="130";
		return price;
		
        else if (menu=="Mutton Biryani")
			price="250";
		return price;
		
        else if (menu=="Plain Rice")
			price="50";
		return price;
		
        else if (menu=="Curd Rice")
			price="70";
		return price;
		
        else if (menu=="Jeera Rice")
			price="80";
		return price;
		
        else if (menu=="Noodles")
			price="90";
		return price;
		
        else if (menu=="Veg Burger")
			price="100";
		return price;
		
        else if (menu=="Chicken Burger")
			price="130";
		return price;
		
        else if (menu=="Tandoori Chicken")
			price="240";
		return price;
		
        else if (menu=="Rasgulla")
			price="40";
		return price;
		
        else if (menu=="Gulab Jamun")
			price="30";
		return price;
		
        else if (menu=="Ice Cream Sundae")
			price="110";
		return price;
		
        else if (menu=="Lassi")
			price="60";
		return price;
		
        else if (menu=="Mango Shake")
			price="70";
		return price;
		
        else if (menu=="Coffee")
			price="50";
		return price;
		
        else if (menu=="Tea")
			price="30";
		return price;
		
        else if (menu=="Soup")
			price="90";
		return price;
		
        else if (menu=="Pasta")
			price="140";
		return price;
		
        else if (menu=="Garlic Bread")
			price="80";
		return price;
		
        else if (menu=="Milkshake")
			price="90";
		return price;
		
        else System.out.println("Item not available");
		
		System.out.println("Order":+menu);
    }
}
