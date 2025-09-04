public class Calendar {

        String calendarName;
        public String getCalendarName(){
            return calendarName;
        }
        public void setCalendarName(String calendarName){
            this.calendarName=calendarName;
        }
        String owner;
         public String getOwner(){
        return owner;
        }
        public void setOwner(String owner){
        this.owner=owner;
        }
        int year;
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }


        Calendar(String calendarName, String owner, int year) {
            this.calendarName = calendarName;
            this.owner = owner;
            this.year = year;

        }

        public void getCalendarInfo() {
            System.out.println("Calendar Name: " + calendarName);
            System.out.println("Owner: " + owner);
            System.out.println("Year: " + year);

        }
    }

