package za.ac.cput.group6.Entity;
import java.util.Objects;


public class ParcelPack {
    private String parcelId;
    private String parcelDate;
    private String parcelDescr;
    private  String parcelName;

    private ParcelPack(){

    }
    private ParcelPack(Builder builder){
        this.parcelId = builder.parcelId;
        this.parcelDate = builder.parcelDate;
        this.parcelDescr = builder.parcelDescr;
        this.parcelName = builder.parcelName;
    }
    public String getParcelRecordId(){
        return parcelId;
    }
    public String getParcelDate(){
        return parcelDate;
    }
    public String getParcelRecordDescr(){
        return parcelDescr;
    }

    public String getParcelName() {
        return parcelName;
    }

    @Override
    public String toString() {
        return "ParcelPack" + " \n"+
                "parcelId:" + " "+ parcelId + "\n" +
                "ParcelDate:" + " "+ parcelDate + "\n" +
                "ParcelDescr:" + " "+ parcelDescr + "\n" +
                "ParcelName:" + " "+ parcelName + "\n";
    }

    public static class Builder {
        private String parcelId;
        private String parcelDate;
        private String parcelDescr;
        private String parcelName;

        public Builder setParcelId(String parcelId){
            this.parcelId = parcelId;
            return this;
        }
        public Builder setParcelDate(String parcelDate){
            this.parcelDate = parcelDate;
            return this;
        }
        public Builder setParcelDecr(String parcelDescr){
            this.parcelDescr = parcelDescr;
            return this;

        }
        public Builder setParcelName(String parcelName){
            this.parcelName = parcelName;
            return this;

        }
        public Builder copy(ParcelPack parcelPack){
            this.parcelId = parcelPack.parcelId;
            this.parcelDate = parcelPack.parcelDate;
            this.parcelDescr = parcelPack.parcelDescr;
            this.parcelName = parcelPack.parcelName;
            return this;
        }
        public ParcelPack build(){
            return new ParcelPack(this);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParcelPack parcelPack = (ParcelPack) o;
            return parcelId.equals(parcelPack.parcelId);
        }
        @Override
        public int hashCode() {
            return Objects.hash(parcelId);
        }

    }
}
