package com.xworkz.loksabha.lok;

import com.xworkz.loksabha.constants.Party;
import com.xworkz.loksabha.politician.Politician;

public class Loksabha {

    Politician[] politicians;
    int index;

    public Loksabha(int size) {
        politicians = new Politician[size];
    }

    // --- 1. Add ---
    public boolean addPolitician(Politician politician) {
        boolean isAdded = false;
        if (politician != null) {
            politicians[index++] = politician;
            isAdded = true;
        }
        return isAdded;
    }

    // --- 2. Get all ---
    public void getAllPoliticianInfo() {
        for (Politician p : politicians) {
            if (p != null) {
                System.out.println("Id: " + p.getPoliticianId() + ", Name: " + p.getName() + ", Age: " + p.getAge() + ", Party: " + p.getParty());
            }
        }
    }

    // --- 6 Get methods ---
    public String getPartyByPoliticianName(String name) {
        String party = null;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    party = p.getParty().toString();
                }
            }
        }
        return party;
    }

    public int getAgeByPoliticianName(String name) {
        int age = -1;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    age = p.getAge();
                }
            }
        }
        return age;
    }

    public String getNameById(int id) {
        String name = null;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getPoliticianId() == id) {
                    name = p.getName();
                }
            }
        }
        return name;
    }

    public int getIdByName(String name) {
        int id = -1;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    id = p.getPoliticianId();
                }
            }
        }
        return id;
    }

    public String getPartyById(int id) {
        String party = null;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getPoliticianId() == id) {
                    party = p.getParty().toString();
                }
            }
        }
        return party;
    }

    public String getNameByParty(Party party) {
        String name = null;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getParty() == party) {
                    name = p.getName();
                }
            }
        }
        return name;
    }

    // --- 7 Update methods ---
    public boolean updateAgeById(int id, int newAge) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getPoliticianId() == id) {
                    p.setAge(newAge);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateNameById(int id, String newName) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getPoliticianId() == id) {
                    p.setName(newName);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updatePartyById(int id, Party newParty) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getPoliticianId() == id) {
                    p.setParty(newParty);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updatePartyByName(String name, Party newParty) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    p.setParty(newParty);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateAgeByName(String name, int newAge) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    p.setAge(newAge);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateNameByParty(Party party, String newName) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getParty() == party) {
                    p.setName(newName);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateIdByName(String name, int newId) {
        boolean isUpdated = false;
        for (Politician p : politicians) {
            if (p != null) {
                if (p.getName().equals(name)) {
                    p.setPoliticianId(newId);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }
}
