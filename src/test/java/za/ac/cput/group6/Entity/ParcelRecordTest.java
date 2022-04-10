package za.ac.cput.group6.Entity;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class ParcelRecordTest {
    @Test
    public void test(){
        ParcelRecord parcelRecord = new ParcelRecord.Builder()
                .setParcelRecordId("218830hfhjd99")
                .setParcelRecordDecr("The student have recieced his goods")
                .setParcelRecordDate("12/10/2022")
                .build();
        System.out.println(parcelRecord);
    }

}