package za.ac.cput.group6.Entity;




public class Donation {
    private String donationId;
    private String donorName;
    private String email;
    private String telephoneNumber;

    public Donation(Builder builder){
      this.donationId = builder.donationId;
      this.donorName = builder.donorName;
      this.email = builder.email;
      this.telephoneNumber = builder.telephoneNumber;
    }

    public String getDonationId() {
        return donationId;
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

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "donationId='" + donationId + '\'' +
                ", donorName='" + donorName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
    public static class Builder{
        private String donationId;
        private String donorName;
        private String email;
        private String telephoneNumber;

        public Builder setDonationId(String donationId) {
            this.donationId = donationId;
            return this;
        }

        public Builder setDonorName(String donorName) {
            this.donorName = donorName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }
        public Builder copy(Donation donation){
            this.donationId = donation.donationId;
            this.donorName = donation.donorName;
            this.email = donation.email;
            this.telephoneNumber = donation.telephoneNumber;
            return this;
        }
        public Donation build(){
           return new Donation(this);
        }
    }
}
