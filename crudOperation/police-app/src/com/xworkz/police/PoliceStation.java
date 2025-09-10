package com.xworkz.police;

import com.xworkz.police.entity.Police;
import com.xworkz.police.constants.PoliceRank;

public class PoliceStation {

    private Police[] officers;
    private int index;

    public PoliceStation(int size) {
        officers = new Police[size];
    }

    public boolean addPolice(Police police) {
        if (police != null && index < officers.length) {
            officers[index++] = police;
            return true;
        }
        return false;
    }

    public void getAllPolice() {
        for (Police police : officers) {
            if (police != null)
                System.out.println(police);
        }
    }

    public Police getPoliceByBadgeId(int id) {
        for (Police police : officers) {
            if (police != null && police.getBadgeId() == id)
                return police;
        }
        return null;
    }

    public void getPoliceByRank(PoliceRank rank) {
        for (Police police : officers) {
            if (police != null && police.getRank() == rank) {
                System.out.println(police.getName());
            }
        }
    }

    public boolean updateSalaryById(int id, double newSalary) {
        for (Police police : officers) {
            if (police != null && police.getBadgeId() == id) {
                police.setSalary(newSalary);
                return true;
            }
        }
        return false;
    }

    public boolean updateRankByName(String name, PoliceRank rank) {
        for (Police police : officers) {
            if (police != null && police.getName().equalsIgnoreCase(name)) {
                police.setRank(rank);
                return true;
            }
        }
        return false;
    }

    public boolean deleteById(int id) {
        for (int i = 0; i < officers.length; i++) {
            if (officers[i] != null && officers[i].getBadgeId() == id) {
                officers[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countOfficers() {
        int count = 0;
        for (Police police : officers)
            if (police!= null) count++;
        return count;
    }

    public boolean existsByName(String name) {
        for (Police police : officers) {
            if (police != null && police.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    public void getByStation(String station) {
        for (Police police : officers) {
            if (police != null && police.getStationName().equalsIgnoreCase(station)) {
                System.out.println(police);
            }
        }
    }

    public boolean updateStationById(int id, String newStation) {
        for (Police police : officers) {
            if (police != null && police.getBadgeId() == id) {
                police.setStationName(newStation);
                return true;
            }
        }
        return false;
    }


    public void printAllNames() {
        for (Police police : officers)
            if (police != null)
                System.out.println(police.getName());
    }


    public boolean promoteById(int id) {
        for (Police police : officers) {
            if (police != null && police.getBadgeId() == id) {
                police.setSalary(police.getSalary() * 1.1);
                return true;
            }
        }
        return false;
    }


    public boolean transferByName(String name, String newStation) {
        for (Police police : officers) {
            if (police != null && police.getName().equalsIgnoreCase(name)) {
                police.setStationName(newStation);
                return true;
            }
        }
        return false;
    }


}
