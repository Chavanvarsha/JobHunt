package com.example.jobhunt.Model;

public class JobPost {
    String postingId,startDate,endDate,status;

    public JobPost(String postingId, String startDate, String endDate, String status) {
        this.postingId = postingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getPostingId() {
        return postingId;
    }

    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
