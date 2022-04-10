package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.Distribution;

import static org.junit.jupiter.api.Assertions.*;

class DistributionFactoryTest {
    Distribution distribution = DistributionFactory.createDistribution("589" ,"Zodwa",
            "Mduli", "zodwam@gmail.com", "catsville");
    Distribution distribution2 = distribution;

    @Test
    void testIdentity(){
        assertSame(distribution,distribution2);

    }
    @Test
    void testEquality()
    {
        assertEquals(distribution,distribution2);

    }

    @Test
    @Disabled
    @DisplayName("This method should not run")

    void testDisabled()
    {
        fail("this test method should be disabled");

    }

    @Test
    @Timeout(5)
    public void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will passed with in the time");
    }
}