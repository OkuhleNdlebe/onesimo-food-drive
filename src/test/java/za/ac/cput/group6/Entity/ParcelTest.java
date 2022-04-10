package za.ac.cput.group6.Entity;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelPack;
import static org.junit.jupiter.api.Assertions.*;

class ParcelPackTest {

@Test
    public void test(){
    ParcelPack parcelPack = new ParcelPack.Builder()
            .setParcelId("21231314")
            .setParcelDate("21/09/2020")
            .setParcelDecr("Two rolls, soap, toothpaste, brush")
            .setParcelName("Stationary Pack")
            .build();
    System.out.println(parcelPack);
}


}