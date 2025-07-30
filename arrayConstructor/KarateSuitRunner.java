class KarateSuitRunner {
    public static void main(String[] args) {

        KarateSuit k1 = new KarateSuit("Adidas","M","White","Cotton");
       
		System.out.println("brand: " +k1.brand);
		System.out.println("size: " + k1.size);
		System.out.println("color: " + k1.color);
		System.out.println("material: " + k1.material);
		
		KarateSuit k2 = new KarateSuit(true);
		System.out.println("isProfessional: " +k2.isProfessional);
				
		KarateSuit k3 = new KarateSuit(1999.99);
		System.out.println("price: " +k3.price);

    }
}
