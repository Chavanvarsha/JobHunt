package com.example.jobhunt.Model;

public class SearchCandidate {
    String RefId,nationality,experience,rankExp,appliedPost,fromDate;

    public SearchCandidate(String refId, String nationality, String experience, String rankExp, String appliedPost, String fromDate) {
        RefId = refId;
        this.nationality = nationality;
        this.experience = experience;
        this.rankExp = rankExp;
        this.appliedPost = appliedPost;
        this.fromDate = fromDate;
    }

    public String getRefId() {
        return RefId;
    }

    public void setRefId(String refId) {
        RefId = refId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getRankExp() {
        return rankExp;
    }

    public void setRankExp(String rankExp) {
        this.rankExp = rankExp;
    }

    public String getAppliedPost() {
        return appliedPost;
    }

    public void setAppliedPost(String appliedPost) {
        this.appliedPost = appliedPost;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }
}
