class Baloon {
    String color;
    String shape;
    String material;
    int size;
    double price;
    boolean isHeliumFilled;
  
    Baloon() {
        this("Red");
    }
 
    Baloon(String color) {
        this(color, "Round");
       
    }
 
    Baloon(String color, String shape) {
        this(color, shape, "Rubber");
       
    }

    Baloon(String color, String shape, String material) {
        this(color, shape, material, 10);
    
    }

    Baloon(String color, String shape, String material, int size) {
        this(color, shape, material, size, 5.0);

    }

    Baloon(String color, String shape, String material, int size, double price) {
        this(color, shape, material, size, price, true);

    }
  
    Baloon(String color, String shape, String material, int size, double price, boolean isHeliumFilled) {
        this.color = color;
        this.shape = shape;
        this.material = material;
        this.size = size;
        this.price = price;
        this.isHeliumFilled = isHeliumFilled;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Helium Filled: " + isHeliumFilled);
        
    }
}
