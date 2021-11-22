package com.example.jobhunt.Model;

public class PositionPage {
    String jobTitle,vesselType,companyName;
    String date;

    public PositionPage(String jobTitle, String vesselType, String companyName, String date) {
        this.jobTitle = jobTitle;
        this.vesselType = vesselType;
        this.companyName = companyName;
        this.date = date;
    }

    public PositionPage() {
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
