package org.example.models;

public class User {
    String name;
    int yearsOld;
    public User(String name, int yearsOld){
        this.name = name;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return name;
    }

    public int getYearsOld() {
        return yearsOld;
    }
}
