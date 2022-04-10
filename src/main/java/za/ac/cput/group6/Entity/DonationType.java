package za.ac.cput.group6.Entity;

public class DonationType {
    private static String donationId;
    private String donationTypeId;
    private String donationTypeDescrId;

    public DonationType(Builder builder){
        this.donationTypeDescrId = builder.donationTypeDescrId;
        this.donationTypeId = builder.donationTypeId;
        this.donationId = builder.donationId;
    }

    public String getDonationId() {
        return donationId;
    }

    public String getDonationTypeId() {
        return donationTypeId;
    }

    public String getDonationTypeDescrId() {
        return donationTypeDescrId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public void setDonationTypeId(String donationTypeId) {
        this.donationTypeId = donationTypeId;
    }

    public void setDonationTypeDescrId(String donationTypeDescrId) {
        this.donationTypeDescrId = donationTypeDescrId;
    }

    @Override
    public String toString() {
        return "DonationType{" +
                "donationId='" + donationId + '\'' +
                ", donationTypeId='" + donationTypeId + '\'' +
                ", donationTypeDescrId='" + donationTypeDescrId + '\'' +
                '}';
    }

    public static class Builder {
        private String donationId;
        private String donationTypeId;
        private String donationTypeDescrId;

        public Builder setDonationId(String donationId) {
            this.donationId = donationId;
            return this;
        }

        public Builder setDonationTypeId(String s) {
            this.donationTypeId = donationTypeId;
            return this;
        }

        public Builder setDonationTypeDescrId(String donationTypeDescrId) {
            this.donationTypeDescrId = donationTypeDescrId;
            return this;
        }

        public DonationType.Builder copy(DonationType donationType) {
            this.donationId = donationId;
            this.donationTypeId = donationTypeId;
            this.donationTypeDescrId = donationTypeId;
            return this;
        }
        public DonationType build(){return new DonationType(this);}
    }
}

