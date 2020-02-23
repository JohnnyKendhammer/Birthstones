package com.example.birthstones;

public class Birthstone {

    private String birthStoneName;
    private String description;
    private int imageResourceID;

    public Birthstone( int imageResourceID, String birthStoneName, String description) {
        this.birthStoneName = birthStoneName;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public Birthstone(int imageResourceID, String birthStoneName){
        this.birthStoneName = birthStoneName;
        this.imageResourceID = imageResourceID;
    }

    public String getBirthStoneName() {
        return birthStoneName;
    }

    public void setBirthStoneName(String birthStoneName) {
        this.birthStoneName = birthStoneName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
