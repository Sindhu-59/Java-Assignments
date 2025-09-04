public class Festival {

        String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        String country;
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

        String religion;
    public String getReligion(){
        return religion;
    }
    public void setReligion(String religion){
        this.religion=religion;
    }
        String season;
    public String getSeason(){
        return season;
    }
    public void setSeason(String season){
        this.season=season;
    }
        String mainDeityOrFigure;
    public String getMainDeityOrFigure(){
        return mainDeityOrFigure;
    }
    public void setMainDeityOrFigure(String mainDeityOrFigure){
        this.mainDeityOrFigure=mainDeityOrFigure;
    }
        boolean isNationalHoliday;
    public boolean getIsNationalHoliday(){
        return isNationalHoliday;
    }
        public void setIsNationalHoliday(boolean isNationalHoliday){
        this.isNationalHoliday=isNationalHoliday;
    }

        public void getFestivalInfo(){

            System.out.println("the festival name is "+name);
            System.out.println("the country is "+country);
            System.out.println("the religion name is "+religion);
            System.out.println("the season is "+season);
            System.out.println("the mainDeityOrFigure name is "+mainDeityOrFigure);
            System.out.println("the isNationalHoliday is "+isNationalHoliday);

        }
    }

