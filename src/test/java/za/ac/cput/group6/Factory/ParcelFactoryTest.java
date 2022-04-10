package za.ac.cput.group6.Factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelPack;

import static org.junit.jupiter.api.Assertions.*;

class ParcelFactoryTest {
    @Test
    public void test(){
        ParcelPack parcelPack = ParcelFactory.createParcel("10/23/22", "The food is delivered to student at Catsville","Female Package");
        assertNotNull(parcelPack);
        System.out.println(parcelPack);
    }

}