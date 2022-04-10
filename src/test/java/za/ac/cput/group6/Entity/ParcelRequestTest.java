package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRequestTest {
    @Test
    public void test(){
        ParcelRequest parcelRequest = new ParcelRequest.Builder()
                .setParcelRequestId("2124")
                .setParcelName("Food parcel")
                .setDate("10.02.21")
                .build();
        System.out.println(parcelRequest);
    }

}