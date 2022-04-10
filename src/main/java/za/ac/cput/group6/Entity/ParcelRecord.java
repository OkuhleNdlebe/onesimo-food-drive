package za.ac.cput.group6.Entity;

import java.util.Date;
import java.util.Objects;

public class ParcelRecord {
    private String parcelRecordId;
    private String parcelRecordDate;
    private String parcelRecordDescr;

    private ParcelRecord(){

    }
    private ParcelRecord( Builder builder){
    this.parcelRecordId = builder.parcelRecordId;
    this.parcelRecordDate = builder.parcelRecordDate;
    this.parcelRecordDescr = builder.parcelRecordDescr;
    }
    public String getParcelRecordId(){
    return parcelRecordId;
    }
    public String getParcelRecordDate(){
        return parcelRecordDate;
    }
    public String getParcelRecordDescr(){
        return parcelRecordDescr;
    }

    @Override
    public String toString() {
        return "ParcelRecord" + " "+ "\n"+
                "ParcelRecordId:" + " "+ parcelRecordId + "\n"+
                "ParcelRecordDate:"+" " + parcelRecordDate +"\n"+
                "ParcelRecordDescr:" +" "+ parcelRecordDescr + "\n";
    }

    public static class Builder {
        private String parcelRecordId;
        private String parcelRecordDate;
        private String parcelRecordDescr;

        public Builder setParcelRecordId(String parcelRecordId){
            this.parcelRecordId = parcelRecordId;
            return this;
        }
        public Builder setParcelRecordDate(String parcelRecordDate){
            this.parcelRecordDate = parcelRecordDate;
            return this;
        }
        public Builder setParcelRecordDecr(String parcelRecordDescr){
            this.parcelRecordDescr = parcelRecordDescr;
            return this;
        }
        public Builder copy(ParcelRecord parcelRecord){
            this.parcelRecordId = parcelRecord.parcelRecordId;
            this.parcelRecordDate = parcelRecord.parcelRecordDate;
            this.parcelRecordDescr = parcelRecord.parcelRecordDescr;
            return this;
        }
        public ParcelRecord build(){
            return new ParcelRecord(this);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParcelRecord parcelRecord = (ParcelRecord) o;
            return parcelRecordId.equals(parcelRecord.parcelRecordId);
        }
        @Override
        public int hashCode() {
            return Objects.hash(parcelRecordId);
        }

    }
}
