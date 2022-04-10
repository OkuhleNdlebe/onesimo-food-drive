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
class ParcelStatusTest {
@Test
    public void  test(){
    ParcelStatus parcelStatus = new ParcelStatus.Builder()
            .setParcelId("239847589")
            .setParcelStatusId("yt683937yf")
            .setParcelSatus(true)
            .build();
    System.out.println(parcelStatus);
}
}