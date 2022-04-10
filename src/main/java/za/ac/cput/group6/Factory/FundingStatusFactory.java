package za.ac.cput.group6.Factory;


import za.ac.cput.group6.Entity.FundingStatus;

import java.util.Date;

public class FundingStatusFactory {

    public static FundingStatus createFundingStatus(String studentID, Boolean status, String date){

        //*String lecturerId = GenericHelper.generateId();*//

        return new FundingStatus.Builder()
                .setStudentID(studentID)
                .setStatus(status)
                .setFundingDate(date)

                .build();

    }
}
