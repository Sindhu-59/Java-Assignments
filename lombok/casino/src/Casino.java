public class Casino {

        String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        String location;
        public String getLocation(){
            return location;
        }
        public void setLocation(String location){
            this.location=location;
        }
        boolean isOpen24Hours;
        public boolean getIsOpen24Hours(){
        return isOpen24Hours;
        }
        public void setIsOpen24Hours(boolean isOpen24Hours){
        this.isOpen24Hours=isOpen24Hours;
        }
        int numberOfGames;
        public int getNumberOfGames(){
            return numberOfGames;
        }
        public void setNumberOfGames(int numberOfGames){
            this.numberOfGames=numberOfGames;
        }
        boolean hasHotel;
    public boolean getHasHotel(){
        return hasHotel;
    }
    public void setHasHotel(boolean hasHotel){
        this.hasHotel=hasHotel;
    }
        double entryFee;
    public double getEntryFee(){
        return entryFee;
    }
    public void setEntryFee(double entryFee){
        this.entryFee=entryFee;
    }

        public void getCasinoInfo(){
            System.out.println("name: " + name);
            System.out.println("location: " + location);
            System.out.println("isOpen24Hours: " + isOpen24Hours);
            System.out.println("numberOfGames: " + numberOfGames);
            System.out.println("hasHotel: " + hasHotel);
            System.out.println("entryFee: " + entryFee);
        }
    }

