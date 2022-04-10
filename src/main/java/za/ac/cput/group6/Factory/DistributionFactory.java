package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.Distribution;

public class DistributionFactory {


        public static Distribution createDistribution(String distributionId, String distributionName, String distributionSurname,
                                                      String distributionEmail, String distributionAddress){

            //*String lecturerId = GenericHelper.generateId();*//

            return new Distribution.Builder()
                    .setDistributionId(distributionId)
                    .setDistributionName(distributionName)
                    .setDistributionSurname(distributionSurname)
                    .setDistributionEmail(distributionEmail)
                    .setDistributionAddress(distributionAddress)
                    .build();

        }

    }
