package za.ac.cput.group6.domain.user;

import za.ac.cput.group6.domain.lookup.Address;

public class DonorAddress {
    private  String donorId;
    private Address address;

    private DonorAddress() {
    }

    public DonorAddress(Address.Builder builder){
        this.donorId= builder.donorId;
        this.address= builder.address;
    }

    public DonorAddress(Builder builder) {
    }

    public String getDonorId() {
        return donorId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "DonorAddress{" +
                "donorId='" + donorId + '\'' +
                ", address=" + address +
                '}';
    }
     public static class Builder{
        private String donorId;
        private Address address;

         public Builder setDonorId(String donorId) {
             this.donorId = donorId;

             return this;
         }

         public Builder setAddress(Address address) {
             this.address = address;

             return this;
         }
         public DonorAddress build(){return new DonorAddress(this);}

         public Builder copy(DonorAddress donorAddress){
             this.donorId= donorAddress.donorId;
             this.address= donorAddress.address;

             return this;
         }
     }
}