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
import org.junit.jupiter.api.Test;
class ParcelTypeTest {
    @Test
    public void test(){
        ParcelType parcelType = new ParcelType.Builder()
                .setParcelTypeId("22673664748")
                .setParcelTypeDecr("Toileties, food, stationary, covid pack")
                .setParcelTypeName("Frmale pack")
                .build();
        System.out.println(parcelType);
    }

}