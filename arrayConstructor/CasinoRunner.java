class CasinoRunner {
    public static void main(String[] args) {

        Casino c1 = new Casino("Royal Vegas","Las Vegas");
			System.out.println("The name of the casino is "+c1.name);
			System.out.println("The location of the casino is "+c1.location);

        Casino c2 = new Casino(false,true);
			System.out.println("The casino is open 24 hrs "+c2.isOpen24Hours);
			System.out.println("The casino has Hotel "+c2.hasHotel);

        Casino c3 = new Casino(300.0);
			System.out.println("The casino entryFee"+c3.entryFee);
			
        Casino c4 = new Casino(10);
			System.out.println("The casino has number Of Games"+c4.numberOfGames);
        
		
    }
}
