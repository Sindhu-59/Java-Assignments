class CrackerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Cracker Data");

        Cracker cracker1 = new Cracker();
        cracker1.name = "Gold Sparklers (10cm)";
        cracker1.type = "Sparkler";
        cracker1.brand = "Standard Fireworks";
        cracker1.price = 120.00;
        cracker1.quantityPerPack = 10;
        cracker1.safetyStandard = "PESO Approved";
        cracker1.isSoundCracker = false;
        cracker1.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker1.name + ", Type: " + cracker1.type + ", Brand: " + cracker1.brand + ", Price: Rs." + cracker1.price + ", Qty/Pack: " + cracker1.quantityPerPack + ", Safety: " + cracker1.safetyStandard + ", Sound Cracker: " + cracker1.isSoundCracker + ", Location: " + cracker1.manufacturingLocation);
        System.out.println();

        Cracker cracker2 = new Cracker();
        cracker2.name = "Twinkling Star Anar";
        cracker2.type = "Flower Pot (Anar)";
        cracker2.brand = "Coronation Fireworks";
        cracker2.price = 250.00;
        cracker2.quantityPerPack = 1;
        cracker2.safetyStandard = "PESO Approved";
        cracker2.isSoundCracker = false;
        cracker2.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker2.name + ", Type: " + cracker2.type + ", Brand: " + cracker2.brand + ", Price: Rs." + cracker2.price + ", Qty/Pack: " + cracker2.quantityPerPack + ", Safety: " + cracker2.safetyStandard + ", Sound Cracker: " + cracker2.isSoundCracker + ", Location: " + cracker2.manufacturingLocation);
        System.out.println();

        Cracker cracker3 = new Cracker();
        cracker3.name = "Assorted Rocket Pack";
        cracker3.type = "Rocket";
        cracker3.brand = "Cock Brand Fireworks";
        cracker3.price = 480.00;
        cracker3.quantityPerPack = 5;
        cracker3.safetyStandard = "PESO Approved";
        cracker3.isSoundCracker = true;
        cracker3.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker3.name + ", Type: " + cracker3.type + ", Brand: " + cracker3.brand + ", Price: Rs." + cracker3.price + ", Qty/Pack: " + cracker3.quantityPerPack + ", Safety: " + cracker3.safetyStandard + ", Sound Cracker: " + cracker3.isSoundCracker + ", Location: " + cracker3.manufacturingLocation);
        System.out.println();

        Cracker cracker4 = new Cracker();
        cracker4.name = "7 Shots Multi-Colour";
        cracker4.type = "Aerial Shot";
        cracker4.brand = "Sony Fireworks";
        cracker4.price = 750.00;
        cracker4.quantityPerPack = 1;
        cracker4.safetyStandard = "Green Cracker";
        cracker4.isSoundCracker = false;
        cracker4.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker4.name + ", Type: " + cracker4.type + ", Brand: " + cracker4.brand + ", Price: " + cracker4.price + ", Qty/Pack: " + cracker4.quantityPerPack + ", Safety: " + cracker4.safetyStandard + ", Sound Cracker: " + cracker4.isSoundCracker + ", Location: " + cracker4.manufacturingLocation);
        System.out.println();

        Cracker cracker5 = new Cracker();
        cracker5.name = "Super Power Sutli Bomb";
        cracker5.type = "Bomb";
        cracker5.brand = "Lion Fireworks";
        cracker5.price = 300.00;
        cracker5.quantityPerPack = 10;
        cracker5.safetyStandard = "PESO Approved";
        cracker5.isSoundCracker = true;
        cracker5.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker5.name + ", Type: " + cracker5.type + ", Brand: " + cracker5.brand + ", Price: Rs." + cracker5.price + ", Qty/Pack: " + cracker5.quantityPerPack + ", Safety: " + cracker5.safetyStandard + ", Sound Cracker: " + cracker5.isSoundCracker + ", Location: " + cracker5.manufacturingLocation);
        System.out.println();

        Cracker cracker6 = new Cracker();
        cracker6.name = "Ground Chakkar (Large)";
        cracker6.type = "Ground Spinner (Chakri)";
        cracker6.brand = "Two Boys Fireworks";
        cracker6.price = 180.00;
        cracker6.quantityPerPack = 2;
        cracker6.safetyStandard = "PESO Approved";
        cracker6.isSoundCracker = false;
        cracker6.manufacturingLocation = "Sivakasi, Tamil Nadu";
        System.out.println("Name: " + cracker6.name + ", Type: " + cracker6.type + ", Brand: " + cracker6.brand + ", Price: Rs." + cracker6.price + ", Qty/Pack: " + cracker6.quantityPerPack + ", Safety: " + cracker6.safetyStandard + ", Sound Cracker: " + cracker6.isSoundCracker + ", Location: " + cracker6.manufacturingLocation);
        System.out.println();

        System.out.println("Main Ended - Cracker Data Display Complete");
    }
}
