package za.ac.cput.group6.Factory;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import  org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelStatus;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
class ParcelPackStatusFactoryTest {

 @Test

public void test(){
     ParcelStatus parcelStatus1 = ParcelStatusFactory.createParcelStatus("2331213",true);
     assertNotNull(parcelStatus1);
     System.out.println(parcelStatus1);
 }

@Test
    void testIdentity(){
     ParcelStatus parcelStatus = new ParcelStatus.Builder()
             .setParcelSatus(true).build();
     ParcelStatus parcelStatus2 = parcelStatus;
     assertSame(parcelStatus2,parcelStatus);
}
@Test
void testEquality(){
    ParcelStatus parcelStatus = new ParcelStatus.Builder()
            .setParcelId("22333857").build();
        ParcelStatus parcelStatus1 = parcelStatus;
        assertEquals(parcelStatus1,parcelStatus);
}

@Test
    @Disabled
    void createParcelStatusDisable(){
     ParcelStatus parcelStatus = ParcelStatusFactory.createParcelStatus("2356432",true);
    System.out.println(parcelStatus);
    assertNotNull(parcelStatus);
}
@Test
    @Timeout(12)
    void timeOut() throws InterruptedException{
     Thread.sleep(100);
    System.out.println("Testing Timed out");
}
}