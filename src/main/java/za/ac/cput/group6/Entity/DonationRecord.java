package za.ac.cput.group6.Entity;

public class DonationRecord {
    private String donationId;
    private String donationRecordId;
    private int donationRecordDate;

    public DonationRecord(Builder builder){
        this.donationId = builder.donationId;
        this.donationRecordDate = builder.donationRecordDate;
        this.donationRecordId = builder.donationRecordId;
    }

    public String getDonationId() {
        return donationId;
    }

    public String getDonationRecordId() {
        return donationRecordId;
    }

    public int getDonationRecordDate() {
        return donationRecordDate;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public void setDonationRecordId(String donationRecordId) {
        this.donationRecordId = donationRecordId;
    }

    public void setDonationRecordDate(int donationRecordDate) {
        this.donationRecordDate = donationRecordDate;
    }

    @Override
    public String toString() {
        return "DonationRecord{" +
                "donationId='" + donationId + '\'' +
                ", donationRecordId='" + donationRecordId + '\'' +
                ", donationRecordDate=" + donationRecordDate +
                '}';
    }
    public static class Builder{
        private String donationId;
        private String donationRecordId;
        private int donationRecordDate;

        public Builder setDonationId(String donationId) {
            this.donationId = donationId;
            return this;
        }

        public Builder setDonationRecordId(String donationRecordId) {
            this.donationRecordId = donationRecordId;
            return this;
        }

        public Builder setDonationRecordDate(int donationRecordDate) {
            this.donationRecordDate = donationRecordDate;
            return this;
        }
        public Builder copy(DonationRecord donationRecord){
            this.donationId = donationRecord.donationId;
            this.donationRecordId = donationRecord.donationRecordId;
            this.donationRecordDate = donationRecord.donationRecordDate;
            return this;
        }
        public DonationRecord build(){return new DonationRecord(this);}
    }
}
