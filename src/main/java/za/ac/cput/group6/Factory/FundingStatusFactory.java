package za.ac.cput.group6.Factory;


import za.ac.cput.group6.Entity.FundingStatus;

import za.ac.cput.group6.Util.GenerateID;

public class FundingStatusFactory {

    public static FundingStatus createFundingStatus(String studentID, Boolean status, String date){

      String studentId= GenerateID.generateID();

        return new FundingStatus.Builder()
                .setStudentID(studentID)
                .setStatus(status)
                .setFundingDate(date)

                .build();

    }
}
