/* DonorFactory.java
Factory for the Donor.
Author: Bokang Molaoa (218131097).
Date: 07 April 2022
*/
package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.Donor;
import za.ac.cput.group6.Util.GenerateID;

public class DonorFactory {
    public static Donor createDonor ( String donorName, String email, String telephoneNumber) {
        String donorId = GenerateID.generateID();
        Donor donor = new Donor.Builder()
                .setDonorId(donorId)
                .setDonorName(donorName)
                .setEmail(email)
                .setTelephoneNumber(telephoneNumber)
                .build();

        return donor;
    }
}
