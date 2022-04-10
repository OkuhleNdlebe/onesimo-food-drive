/*
Description: Builder pattern to FundingStatus Entity
Author: Lukhona Tetyana
Student number: 218119321
Date: 10 April 2022
ADP assignment 1

 */
package za.ac.cput.group6.Entity;



public class FundingStatus {

    private String studentID;
    private Boolean status;
    private String fundingDate;

    private FundingStatus() {
    }

    private FundingStatus(Builder builder) {
        this.studentID = builder.studentID;
        this.status = builder.status;
        this.fundingDate = builder.fundingDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getFundingDate() {
        return fundingDate;
    }

    @Override
    public String toString() {
        return "FundingStatus{" +
                "studentID='" + studentID + '\'' +
                ", status=" + status +
                ", fundingDate=" + fundingDate +
                '}';
    }

    public static class Builder {
        private String studentID;
        private Boolean status;
        private String fundingDate;

        public Builder setStudentID(String id) {
            this.studentID = id;
            return this;
        }

        public Builder setStatus(Boolean status) {
            this.status = status;
            return this;
        }

        public Builder setFundingDate(String date) {
            this.fundingDate = date;
            return this;

        }

        public FundingStatus build() {
            return new FundingStatus(this);
        }

        public Builder copy(FundingStatus fundingStatus) {
            this.studentID = fundingStatus.studentID;
            this.status = fundingStatus.status;
            this.fundingDate = fundingStatus.fundingDate;
            return this;
        }

    }

}


