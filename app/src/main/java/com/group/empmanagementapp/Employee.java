package com.group.empmanagementapp;
public class Employee {
    private String name;
    private String position;
    private String acceptanceDate;

    public Employee() {
        // Required empty constructor for Firebase database operations
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.acceptanceDate = acceptanceDate;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    // Setter methods are necessary if you plan to use Firebase Realtime Database
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }



    @Override
    public String toString() {
        return name + " \n " + position ;
    }
}
