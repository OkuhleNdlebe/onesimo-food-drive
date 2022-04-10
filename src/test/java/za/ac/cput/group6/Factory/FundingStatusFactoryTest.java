package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.FundingStatus;

import static org.junit.jupiter.api.Assertions.*;

class FundingStatusFactoryTest {
 FundingStatus fundingStatus = FundingStatusFactory.createFundingStatus("218119632", true, "12/21/2022");
 FundingStatus fundingStatus2= fundingStatus;

    @Test
    void testIdentity(){
        assertSame(fundingStatus,fundingStatus2);

    }
    @Test
    void testEquality()
    {
        assertEquals(fundingStatus,fundingStatus2);

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