public class Coins {

        String name;
        public String getName(){
            return name;
        }
        public void setName(String Name){
            this.name=name;
        }

        String country;
        public String getCountry(){
            return country;
    }
        public void setCountry(String country){
            this.country=country;
        }
        int year;
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            this.year=year;
        }
        String material;
        public String getMaterial(){
            return material;
        }
        public void setMaterial(String Material){
            this.material=material;
        }
        double weight;
        public double getWeight(){
            return weight;
    }
        public void setWeight(double weight){
            this.weight=weight;
        }
        double value;
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value=value;
    }

        public void getCoinsInfo(){
            System.out.println("the name is "+name);
            System.out.println("the country is "+country);
            System.out.println("the year is "+year);
            System.out.println("the material is "+material);
            System.out.println("the weight is "+weight);
            System.out.println("the value is "+value);


        }
    }
