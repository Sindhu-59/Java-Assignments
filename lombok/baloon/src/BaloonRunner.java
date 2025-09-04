public class BaloonRunner {


        public static void main(String[] args) {

            System.out.println("Main Started");

            Baloon b1 = new Baloon();
            b1.display();

            Baloon b2 = new Baloon("Blue");
            b2.display();

            Baloon b3 = new Baloon("Green", "Heart");
            b3.display();

            Baloon b4 = new Baloon("Yellow", "Oval", "Plastic");
            b4.display();

            Baloon b5 = new Baloon("Purple", "Round", "Latex", 12);
            b5.display();

            Baloon b6 = new Baloon("Orange", "Star", "Mylar", 15, 9.0);
            b6.display();

            Baloon b7 = new Baloon("Pink", "Square", "Foil", 10, 8.5, false);
            b7.display();

            System.out.println("Main Ended");
        }
    }


