package za.ac.cput.group6.Entity;

import java.util.Objects;

public class ParcelType {
    private String parcelTypeName;
    private String parcelTypeId;
    private String parcelTypedecr;

    public ParcelType(){

    }

    private ParcelType(Builder builder){
        this.parcelTypeId = builder.parceltypeId;
        this.parcelTypeName = builder.parcelTypeName;
        this.parcelTypedecr = builder.parcelTypedecr;
    }

    public String getParcelTypeName() {
        return parcelTypeName;
    }

    public String getParcelTypeId() {
        return parcelTypeId;
    }

    public String getParcelTypedecr() {
        return parcelTypedecr;
    }

    @Override
    public String toString() {
        return "ParcelType{" +
                "parcelTypeName='" + parcelTypeName + '\'' +
                ", parceltypeId='" + parcelTypeId + '\'' +
                ", parcelTypedecr='" + parcelTypedecr + '\'' +
                '}';
    }

    public static class Builder{
        private String parcelTypeName;
        private String parceltypeId;
        private String parcelTypedecr;

        public Builder setParcelTypeName(String parcelTypeName){
            this.parcelTypeName = parcelTypeName;
            return this;
        }
        public Builder setParcelTypeId(String parceltypeId){
            this.parceltypeId = parceltypeId;
            return this;
        }
        public Builder setParcelTypeDecr(String parcelTypedecr){
            this.parcelTypedecr = parcelTypedecr;
            return this;
        }
        public Builder copy(ParcelType parcelType){
            this.parcelTypeName = parcelType.parcelTypeName;
            this.parceltypeId = parcelType.parcelTypeId;
            this.parcelTypedecr = parcelType.parcelTypedecr;
            return this;
        }
        public ParcelType build(){
            return  new ParcelType(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParcelType parcelType = (ParcelType) o;
            return parcelType.equals(parcelType.parcelTypeId);
        }
        @Override
        public int hashCode() {
            return Objects.hash(parceltypeId);
        }


    }
}

