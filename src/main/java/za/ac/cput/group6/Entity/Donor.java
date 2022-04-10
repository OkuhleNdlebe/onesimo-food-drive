/* Donor.java
Entity for the Donor.
Author: Bokang Molaoa (218131097) ADP3 Assignment 1.
Date: 07 April 2022
*/
package za.ac.cput.group6.Entity;

public class Donor {
    private String donorId;
    private String donorName, email, telephoneNumber;

    //Builder Constructor
    private Donor(Builder builder) {
        this.donorId = builder.donorId;
        this.donorName = builder.donorName;
        this.email = builder.email;
        this.telephoneNumber = builder.telephoneNumber;
    }

    public String getDonorId() {
        return donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public static class Builder {
        private String donorId;
        private String donorName, email, telephoneNumber;

        //Set donorId
        public Builder setDonorId (String donorId) {
            this.donorId = donorId;
            return this;
        }

        public Builder setDonorName(String donorName) {
            this.donorName = donorName;
            return this;
        }

        public Builder setEmail (String email) {
            this.email = email;
            return this;
        }

        public Builder setTelephoneNumber (String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }
        //Return instance of Donor.
        public Donor build() {
            return new Donor(this);
        }

        //Copy method
        public Builder copy(Donor donor) {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Donor: {" +
                "Donor Id ='" + donorId + '\'' +
                ", Donor Name ='" + donorName + '\'' +
                ", Email ='" + email + '\'' +
                ", Telephone Number ='" + telephoneNumber + '\'' +
                '}';
    }
}
