package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Util.GenerateID;
import za.ac.cput.group6.Util.GenericHelper;

public class DistributionFactory {


        public static Distribution createDistribution(String distributionId, String distributionName, String distributionSurname,
                                                      String distributionEmail, String distributionAddress){

            String DistributionId = GenerateID.generateID();

            return new Distribution.Builder()
                    .setDistributionId(distributionId)
                    .setDistributionName(distributionName)
                    .setDistributionSurname(distributionSurname)
                    .setDistributionEmail(distributionEmail)
                    .setDistributionAddress(distributionAddress)
                    .build();

        }

    }
