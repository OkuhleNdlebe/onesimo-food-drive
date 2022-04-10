package za.ac.cput.group6.Entity;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import org.junit.jupiter.api.Test;

class ParcelPackTest {

@Test
    public void test(){
    ParcelPack parcelPack = new ParcelPack.Builder()
            .setParcelPackId("21231314")
            .setParcelDate("21/09/2020")
            .setParcelDecr("Two rolls, soap, toothpaste, brush")
            .setParcelName("Stationary Pack")
            .build();
    System.out.println(parcelPack);
}


}