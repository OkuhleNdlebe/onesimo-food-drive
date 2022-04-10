package za.ac.cput.group6.Factory;


import za.ac.cput.group6.Entity.ParcelRequest;
import za.ac.cput.group6.Util.GenerateID;

import java.util.Date;

public class ParcelRequestFactory {

    public static ParcelRequest createParcelRequest( String parcelName,String date){

        String parcelRequestId = GenerateID.generateID();

        ParcelRequest parcelRequest = new ParcelRequest.Builder()
                .setParcelRequestId(parcelRequestId)
                .setParcelName(parcelName)
                .setDate(date)

                .build();
        return parcelRequest;
    }
}
