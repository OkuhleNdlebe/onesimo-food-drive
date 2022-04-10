package za.ac.cput.group6.Factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelType;

import static org.junit.jupiter.api.Assertions.*;

class ParcelPackTypeFactoryTest {
@Test
    public void test(){
    ParcelType parcelType = ParcelTypeFactory.createParcelType("Clothes", "1. Jean 2. Shirt 3.Jacket 4. 6 t-shirt 5. shoes");
    assertNotNull(parcelType);
    System.out.println(parcelType);
}
}