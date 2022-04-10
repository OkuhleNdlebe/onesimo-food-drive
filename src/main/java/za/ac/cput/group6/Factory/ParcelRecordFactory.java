package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Util.GenerateID;

public class ParcelRecordFactory {

    public static ParcelRecord createParcelRecord(String parcelRecordDate, String parcelRecordDescr ){

        String parcelRecordId = GenerateID.generateID();
        return new ParcelRecord.Builder()
                .setParcelRecordId(parcelRecordId)
                .setParcelRecordDate(parcelRecordDate)
                .setParcelRecordDecr(parcelRecordDescr)
                .build();
    }
}
