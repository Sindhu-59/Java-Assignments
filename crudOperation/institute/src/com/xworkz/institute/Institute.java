package com.xworkz.institute;

import com.xworkz.institute.constants.Course;

public class Institute {
     Trainee[] trainees;
     int index;

    public Institute(int size) {
        trainees = new Trainee[size];
    }


    public boolean addTrainee(Trainee trainee) {
        boolean addTrainee=false;
        if (trainee != null ) {
            trainees[index++] = trainee;
            addTrainee=true;
            return true;
        }
        return addTrainee;
    }

    public void getAllTraineeDetails() {
        System.out.println("Enter the trainee details");
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                System.out.println("Id: " + trainee.getTraineeId());
                System.out.println(" Name: " + trainee.getName());
                System.out.println("Age: " + trainee.getAge());
                System.out.println(" Course: " + trainee.getCourse() );
                System.out.println(" Batch: " + trainee.getBatch());
            }
        }
    }

    public String getNameById(int traineeId) {
        String name=null;
        for (Trainee trainee : this.trainees) {
            System.out.println("The name of trainee is: "+trainee.getName());
            if (trainee.getTraineeId() == traineeId) {
                return trainee.getName();
            }
        }
        return null;
    }


    public Course getCourseByName(String traineeName) {
        Course course=null;
        for (Trainee trainee : trainees) {
            if (trainee.getName().equals(trainee.getName())) {
                course= trainee.getCourse();
            }
        }
        return null;
    }

    public boolean updateAgeByName(String traineeName, int newAge) {
        for (Trainee trainee : trainees) {
            if (trainee.getName().equals(traineeName)) {
                trainee.setAge(newAge);
                return true;
            }
        }
        return false;
    }


    public boolean updateCourseByName(String traineeName, Course course) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getName().equals(traineeName)) {
                trainee.setCourse(course);
                return true;
            }
        }
        return false;
    }


    public boolean deleteTraineeById(int traineeId) {
        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i] != null && trainees[i].getTraineeId() == traineeId) {
                trainees[i] = null;
                return true;
            }
        }
        return false;
    }


    public int countTrainees() {
        int count = 0;
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                count++;
            }
        }
        return count;
    }

       public boolean traineeExists(String traineeName) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getName().equals(traineeName)) {
                return true;
            }
        }
        return false;
    }

        public void getTraineesByCourse(Course course) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getCourse() == course) {
                System.out.println("Trainee: " + trainee.getName());
            }
        }
    }


    public int getAgeByName(String traineeName) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getName().equals(traineeName)) {
                return trainee.getAge();
            }
        }
        return -1;
    }


    public boolean updateNameById(int traineeId, String newName) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getTraineeId() == traineeId) {
                trainee.setName(newName);
                return true;
            }
        }
        return false;
    }


    public Trainee getTraineeByName(String traineeName) {
        for (Trainee trainee : trainees) {
            if (trainee != null && trainee.getName().equals(traineeName)) {
                return trainee;
            }
        }
        return null;
    }


    public boolean replaceTrainee(int index, Trainee newTrainee) {
        if (index >= 0 && index < trainees.length) {
            trainees[index] = newTrainee;
            return true;
        }
        return false;
    }

    public void clearAllTrainees() {
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = null;
        }
        index = 0;
        System.out.println("All trainees removed.");
    }
}
