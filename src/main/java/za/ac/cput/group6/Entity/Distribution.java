/*
Description: Builder pattern to Distribution Entity
Author: Lukhona Tetyana
Student number: 218119321
Date: 10 April 2022
ADP assignment 1
 */
package za.ac.cput.group6.Entity;


public class Distribution {
    private String DistributionId, DistributionName, DistributionSurname, DistributionEmail, DistributionAddress;
    private String distributionId;
    private String distributionName;
    private String distributionSurname;
    private String distributionEmail;
    private String distributionAddress;

    private Distribution() {
    }

    private Distribution(Builder builder) {
        this.distributionId = builder.distributionId;
        this.distributionName = builder.distributionName;
        this.distributionSurname = builder.distributionSurname;
        this.distributionEmail= builder.distributionEmail;
        this.distributionAddress = builder.distributionAddress;
    }

    public String getDistributionId() {
        return DistributionId;
    }

    public String getDistributionName() {
        return DistributionName;
    }

    public String getDistributionSurname() {
        return DistributionSurname;
    }

    public String getDistributionEmail() {
        return DistributionEmail;
    }

    public String getDistributionAddress() {
        return DistributionAddress;
    }

    @Override
    public String toString() {
        return "Distribution{" +
                "DistributionId='" + DistributionId + '\'' +
                ", DistributionName='" + DistributionName + '\'' +
                ", DistributionSurname='" + DistributionSurname + '\'' +
                ", DistributionEmail='" + DistributionEmail + '\'' +
                ", DistributionAddress='" + DistributionAddress + '\'' +
                '}';
    }
    public static class Builder{
        private String distributionId,distributionName, distributionSurname, distributionEmail, distributionAddress;

        public Builder setDistributionId(String distributionId) {
            this.distributionId = distributionId;

            return this;
        }

        public Builder setDistributionName(String distributionName ) {
            this.distributionName = distributionName;

            return this;
        }

        public Builder setDistributionSurname(String distributionSurname) {
            this.distributionSurname = distributionSurname;
            return this;

        }

        public Builder setDistributionEmail(String distributionEmail) {
            this.distributionEmail = distributionEmail;
            return this;

        }
        public Builder setDistributionAddress(String distributionAddress) {
            this.distributionAddress = distributionAddress;
            return this;

        }
        public Distribution build() {
            return new Distribution(this);
        }

        public Builder copy(Distribution distribution) {
            this.distributionId = distribution.distributionId;
            this.distributionName = distribution.distributionName;
            this.distributionSurname = distribution.distributionSurname;
            this.distributionEmail = distribution.distributionEmail;
            this.distributionAddress= distribution.distributionAddress;
            return this;
        }

    }
}