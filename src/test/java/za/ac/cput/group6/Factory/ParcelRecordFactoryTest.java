package za.ac.cput.group6.Factory;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import org.junit.jupiter.api.Disabled;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Entity.ParcelStatus;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRecordFactoryTest {
    @Test
    public void test(){
            ParcelRecord parcelRecord = ParcelRecordFactory.createParcelRecord("12/05/2022","The parcel is delivered");
            assertNotNull(parcelRecord);
            System.out.println(parcelRecord);
    }


    @Test
    void testIdentity(){
        ParcelRecord parcelRecord = new ParcelRecord.Builder()
                .setParcelRecordDate("12/12/2022").build();
        ParcelRecord parcelRecord1 = parcelRecord;
        assertSame(parcelRecord1,parcelRecord);
    }
    @Test
    void testEquality(){
        ParcelRecord parcelRecord = new ParcelRecord.Builder()
                .setParcelRecordDate("12/12/2022").build();
        ParcelRecord parcelRecord1 = parcelRecord;
        assertEquals(parcelRecord1,parcelRecord);
    }

    @Test
    @Disabled
    void createParcelRecordDisable(){
        ParcelRecord parcelRecord = ParcelRecordFactory.createParcelRecord("2356432","Large food");
        System.out.println(parcelRecord);
        assertNotNull(parcelRecord);
    }
    @Test
    @Timeout(12)
    void timeOut() throws InterruptedException{
        Thread.sleep(100);
        System.out.println("Testing Timed out");
    }
}