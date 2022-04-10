package za.ac.cput.group6.Factory;


import za.ac.cput.group6.Entity.ParcelRequest;

import java.util.Date;

public class ParcelRequestFactory {

    public static ParcelRequest createParcelRequest(String parcelRequestId, String parcelName,String date){

        //*String lecturerId = GenericHelper.generateId();*//

        ParcelRequest parcelRequest = new ParcelRequest.Builder()
                .setParcelRequestId(parcelRequestId)
                .setParcelName(parcelName)
                .setDate(date)

                .build();
        return parcelRequest;
    }
}
