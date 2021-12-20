package com.tam.an.skyfly.model;

public class Place {
    int id;
    String place;
    int img;
    int cost;

    public Place(String place, int img, int cost) {
        this.place = place;
        this.img = img;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
