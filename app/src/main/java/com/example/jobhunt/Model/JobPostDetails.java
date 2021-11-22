package com.example.jobhunt.Model;

public class JobPostDetails {
    String jobpostingId,company,jobPostingStartDate,jobPostingEndDate;
    String department,rank,typeOfShip,nationality,noOfPosts,salary,otherBenefits;

    public JobPostDetails(String jobpostingId, String company, String jobPostingStartDate, String jobPostingEndDate, String department, String rank, String typeOfShip, String nationality, String noOfPosts, String salary, String otherBenefits) {
        this.jobpostingId = jobpostingId;
        this.company = company;
        this.jobPostingStartDate = jobPostingStartDate;
        this.jobPostingEndDate = jobPostingEndDate;
        this.department = department;
        this.rank = rank;
        this.typeOfShip = typeOfShip;
        this.nationality = nationality;
        this.noOfPosts = noOfPosts;
        this.salary = salary;
        this.otherBenefits = otherBenefits;
    }

    public String getJobpostingId() {
        return jobpostingId;
    }

    public void setJobpostingId(String jobpostingId) {
        this.jobpostingId = jobpostingId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPostingStartDate() {
        return jobPostingStartDate;
    }

    public void setJobPostingStartDate(String jobPostingStartDate) {
        this.jobPostingStartDate = jobPostingStartDate;
    }

    public String getJobPostingEndDate() {
        return jobPostingEndDate;
    }

    public void setJobPostingEndDate(String jobPostingEndDate) {
        this.jobPostingEndDate = jobPostingEndDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTypeOfShip() {
        return typeOfShip;
    }

    public void setTypeOfShip(String typeOfShip) {
        this.typeOfShip = typeOfShip;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNoOfPosts() {
        return noOfPosts;
    }

    public void setNoOfPosts(String noOfPosts) {
        this.noOfPosts = noOfPosts;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(String otherBenefits) {
        this.otherBenefits = otherBenefits;
    }
}
