package za.ac.cput.group6.domain.lookup;


import javax.persistence.Embeddable;

@Embeddable

public class Parcel {

    private String parcelId;
    private String parcelDescription;
    private String date;
    private String parcelType;
    private String parcelStatus;



    public Parcel() {

    }



    public Parcel(Builder builder) {
        this.parcelId = builder.parcelId;
        this.parcelDescription = builder.parcelDescription;
        this.date = builder.date;
        this.parcelType = builder.parcelType;
        this.parcelStatus = builder.parcelStatus;

    }

    public Parcel(Request request) {
    }


    @Override
    public String toString() {
        return "Parcel{" +
                "parcelId='" + parcelId + '\'' +
                ", parcelDescription='" + parcelDescription + '\'' +
                ", date='" + date + '\'' +
                ", parcelType='" + parcelType + '\'' +
                ", parcelStatus='" + parcelStatus + '\'' +
                '}';
    }

    public static class Builder{
            private String parcelId;
            private String parcelDescription;
            private String date;
            private String parcelType;
            private String parcelStatus;


        }

        public Parcel copy(Parcel parcel){

            this.parcelId=parcel.parcelId;
            this.parcelDescription =parcel.parcelDescription;
            this.date=parcel.date;
            this.parcelType=parcel.parcelType;
            this.parcelStatus=parcel.parcelStatus;
            return this;
        }
    }

