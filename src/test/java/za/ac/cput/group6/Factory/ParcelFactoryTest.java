package za.ac.cput.group6.Factory;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelPack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
class ParcelFactoryTest {
    @Test
    public void test(){
        ParcelPack parcelPack = ParcelFactory.createParcel("10/23/22", "The food is delivered to student at Catsville","Female Package");
        assertNotNull(parcelPack);
        System.out.println(parcelPack);
    }
    ParcelPack parcelPack = ParcelFactory.createParcel("12/23/22","Glosary","Food");
    ParcelPack parcelPack1 = parcelPack;

    @Test
    void testIdentity(){
        assertSame(parcelPack,parcelPack1);
    }

    @Test
    void testEquality(){
        assertEquals(parcelPack,parcelPack1);
    }
    @Test
    @Disabled
     @DisplayName("This method should not run")
    void testDisabled(){
        fail("this method should be disabled");
    }

    @Test
    @Timeout(12)
    void timeOut() throws InterruptedException{
        Thread.sleep(100);
        System.out.println("Testing Timed out");
    }
    }
