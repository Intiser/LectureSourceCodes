package com.example.teacher.recyclerview;

public class Item {
    String title;
    String description;

    public Item(String title, String description) {

        this.title = title;
        this.description = description;
    }

    public Item(){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
