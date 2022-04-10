package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;


class FundingStatusTest {
    @Test
    public void test(){
       FundingStatus fundingStatus = new FundingStatus.Builder()
                .setStudentID("21231314")
                .setStatus(true)
                .setFundingDate("22.03.21")
                .build();
        System.out.println(fundingStatus);
    }
}