package com.example.jobhunt.Model;

public class Home {
    String positionName;
    int count;

    public Home(String positionName, int count) {
        this.positionName = positionName;
        this.count = count;
    }

    public Home() {
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
