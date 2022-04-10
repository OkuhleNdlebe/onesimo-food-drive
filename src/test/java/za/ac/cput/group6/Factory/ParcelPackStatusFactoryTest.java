package za.ac.cput.group6.Factory;

import  org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelStatus;

import static org.junit.jupiter.api.Assertions.*;

class ParcelPackStatusFactoryTest {

 @Test

public void test(){
     ParcelStatus parcelStatus1 = ParcelStatusFactory.createParcelStatus("2331213",true);
     assertNotNull(parcelStatus1);
     System.out.println(parcelStatus1);
 }

}