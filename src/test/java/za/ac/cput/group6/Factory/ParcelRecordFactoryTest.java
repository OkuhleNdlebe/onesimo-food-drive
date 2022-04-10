package za.ac.cput.group6.Factory;
import  org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelRecord;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRecordFactoryTest {
    @Test
    public void test(){
            ParcelRecord parcelRecord = ParcelRecordFactory.createParcelRecord("12/05/2022","The parcel is delivered");
            assertNotNull(parcelRecord);
            System.out.println(parcelRecord);
    }
}