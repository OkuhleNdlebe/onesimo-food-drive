package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;


class DistributionTest {
    @Test
    public void test(){
        Distribution distribution = new Distribution.Builder()
                .setDistributionId("213")
                .setDistributionName("Zodwa")
                .setDistributionSurname("mduli")
                .setDistributionEmail("zodwamduli.gmail.com")
                .setDistributionAddress("Catsville")
                .build();
        System.out.println(distribution);
    }

}