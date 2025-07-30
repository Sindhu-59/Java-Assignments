class BlazzerRunner {
    public static void main(String args[]) {

        Blazzer b1 = new Blazzer("Louis Philippe","M","Black");
			System.out.println("The brand of the Blazzer "+b1.brand);
			System.out.println("The size of the Blazzer "+b1.size);
			System.out.println("The color of the Blazzer "+b1.color);

        Blazzer b2 = new Blazzer(3799.0);
			System.out.println("The price "+b2.price);
  
        Blazzer b3 = new Blazzer(true);
			System.out.println("The Blazzer type is Formal "+b3.isFormal);
 
    }
}
