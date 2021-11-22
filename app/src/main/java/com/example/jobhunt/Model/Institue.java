package com.example.jobhunt.Model;

public class Institue {
    String institueName,address;

    public Institue(String institueName, String address) {
        this.institueName = institueName;
        this.address = address;
    }

    public String getInstitueName() {
        return institueName;
    }

    public void setInstitueName(String institueName) {
        this.institueName = institueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
