/* Donor Profile.java
Entity for the DonorProfile.
Author: Bokang Molaoa (218131097) ADP3 Assignment 1.
Date: 07 April 2022
*/
package za.ac.cput.group6.Entity;

public class DonorProfile {
    private String donorId;
    private String donorName, donorAddress, donorContact;

    //Builder Constructor
    private DonorProfile(Builder builder) {
        this.donorId = builder.donorId;
        this.donorName = builder.donorName;
        this.donorAddress = builder.donorAddress;
        this.donorContact = builder.donorContact;
    }

    public String getDonorId() {
        return donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public String getDonorContact() {
        return donorContact;
    }


    public static class Builder {
        private String donorId;
        private String donorName, donorAddress, donorContact;

        //Set donorId
        public DonorProfile.Builder setDonorId (String donorId) {
            this.donorId = donorId;
            return this;
        }

        public DonorProfile.Builder setDonorName(String donorName) {
            this.donorName = donorName;
            return this;
        }

        public DonorProfile.Builder setDonorAddress (String donorAddress) {
            this.donorAddress = donorAddress;
            return this;
        }

        public DonorProfile.Builder setDonorContact (String donorContact) {
            this.donorContact = donorContact;
            return this;
        }
        //Return instance of DonorProfile.
        public DonorProfile build() {
            return new DonorProfile(this);
        }

        //Copy method
        public DonorProfile.Builder copy(DonorProfile donorProfile) {
            return this;
        }
    }

    @Override
    public String toString() {
        return "DonorProfile :{" +
                "Donor Id ='" + donorId + '\'' +
                ", Donor Name ='" + donorName + '\'' +
                ", Donor Address='" + donorAddress + '\'' +
                ", Donor Contact='" + donorContact + '\'' +
                '}';
    }
}
