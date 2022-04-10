package za.ac.cput.group6.Entity;

import java.util.Objects;

public class ParcelStatus {

    private String parcelId;
    private String parcelSatusId;
    private boolean parcelSatus;

    //Default Constructor
    private ParcelStatus(){
    }

    //Builder Constructor
    private ParcelStatus(Builder builder){
        this.parcelId = builder.parcelSatusId;
        this.parcelSatusId = builder.parcelSatusId;
        this.parcelSatus = builder.parcelSatus;
    }

    //Getters
    public String getParcelId() {
        return parcelId;
    }

    public String getParcelSatusId() {
        return parcelSatusId;
    }

    public boolean isParcelSatus() {
        return parcelSatus;
    }

    //ToString Method
    @Override
    public String toString() {
        return  "ParcelStatus" + "\n"+
                "ParcelId:" +" "+ parcelId + "\n" +
                "ParcelSatusId:"+" "+ parcelSatusId + "\n" +
                "ParcelSatus:" +" "+ parcelSatus;
    }
    //Builder Pattern
    public static class Builder {
        private String parcelId;
        private String parcelSatusId;
        private boolean parcelSatus;

        public Builder setParcelId(String parcelId) {
            this.parcelId = parcelId;
            return this;
        }

        public Builder setParcelStatusId(String parcelSatusId) {
            this.parcelSatusId = parcelSatusId;
            return this;
        }

        public Builder setParcelSatus(boolean parcelSatus) {
            this.parcelSatus = parcelSatus;
            return this;
        }

        public Builder copy(ParcelStatus parcelStatus) {
            this.parcelId = parcelStatus.parcelId;
            this.parcelSatusId = parcelStatus.parcelSatusId;
            this.parcelSatus = parcelStatus.parcelSatus;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParcelStatus parcelStatus = (ParcelStatus) o;
            return parcelId.equals(parcelStatus.parcelId) || parcelSatusId.equals(parcelStatus.parcelSatusId);
        }
        @Override
        public int hashCode() {
            return Objects.hash(parcelId, parcelSatusId);
        }


        public ParcelStatus build() {
            return new ParcelStatus(this);
        }
    }//Close Builder
    }//Close Main