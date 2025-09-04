public class Army {

        String divisionName;
        int totalPersonnel;
        String commandCenter;
        Squad squad;

        Army(String divisionName, int totalPersonnel, String commandCenter, Squad squad) {
            this.divisionName = divisionName;
            this.totalPersonnel = totalPersonnel;
            this.commandCenter = commandCenter;
            this.squad = squad;
        }

        public void getArmyInfo() {
            System.out.println("Division: " + divisionName);
            System.out.println("Personnel: " + totalPersonnel);
            System.out.println("Command Center: " + commandCenter);
            squad.getSquadInfo();
        }
    }

