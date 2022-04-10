/*
Description: Builder pattern to ParcelRequest Entity
Author: Lukhona Tetyana
Student number: 218119321
Date: 10 April 2022
ADP assignment 1
 */
package za.ac.cput.group6.Entity;



public class ParcelRequest {
    private String parcelRequestId;
    private String parcelName;
    private String date;

    private ParcelRequest() {
    }

    private ParcelRequest(Builder builder) {
        this.parcelRequestId = builder.parcelRequestId;
        this.parcelName = builder.parcelName;
        this.date = builder.date;
    }

    public String getParcelRequestId() {
        return parcelRequestId;
    }

    public String getParcelName() {
        return parcelName;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ParcelRequest{" +
                "parcelRequestId='" + parcelRequestId + '\'' +
                ", parcelName='" + parcelName + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private String parcelRequestId;
        private String parcelName;
        private String date;

        public ParcelRequest.Builder setParcelRequestId(String id) {
            this.parcelRequestId = id;
            return this;
        }

        public ParcelRequest.Builder setParcelName(String name) {
            this.parcelName = name;
            return this;
        }

        public ParcelRequest.Builder setDate(String date) {
            this.date = date;
            return this;

        }
        public ParcelRequest build() {
            return new ParcelRequest(this);
        }

        public ParcelRequest.Builder copy(ParcelRequest parcelRequest) {
            this.parcelRequestId = parcelRequest.parcelRequestId;
            this.parcelName= parcelRequest.parcelName;
            this.date = parcelRequest.date;
            return this;
        }
    }
}