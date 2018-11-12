package com.example.teacher.recyclerview;

public class writer {
    private String name;
    private String DateOfBirth;
    private int position;

    public writer(String name, String dateOfBirth, int position) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
