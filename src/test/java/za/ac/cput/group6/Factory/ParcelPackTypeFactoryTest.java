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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Entity.ParcelStatus;
import za.ac.cput.group6.Entity.ParcelType;

import static org.junit.jupiter.api.Assertions.*;

class ParcelPackTypeFactoryTest {
@Test
    public void test(){
    ParcelType parcelType = ParcelTypeFactory.createParcelType("Clothes", "1. Jean 2. Shirt 3.Jacket 4. 6 t-shirt 5. shoes");
    assertNotNull(parcelType);
    System.out.println(parcelType);
}
    @Test
    void testIdentity(){
        ParcelType parcelType = new ParcelType.Builder()
                .setParcelTypeName("Food pack").build();
        ParcelType parceltype1 = parcelType;
        assertSame(parcelType,parcelType);
    }
    @Test
    void testEquality(){
        ParcelType parcelType = new ParcelType.Builder()
                .setParcelTypeName("Food Pack").build();
        ParcelType parcelType1 = parcelType;
        assertEquals(parcelType1,parcelType);
    }

    @Test
    @Disabled
    void createParcelTypeDisable(){
        ParcelType parcelType = ParcelTypeFactory.createParcelType("2356432","Large food");
        System.out.println(parcelType);
        assertNotNull(parcelType);
    }
    @Test
    @Timeout(12)
    void timeOut() throws InterruptedException{
        Thread.sleep(100);
        System.out.println("Testing Timed out");
    }


}