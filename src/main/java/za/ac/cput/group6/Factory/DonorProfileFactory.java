/* DonorProfileFactory.java
Factory for the DonorProfile.
Author: Bokang Molaoa (218131097).
Date: 07 April 2022
*/
package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.DonorProfile;
import za.ac.cput.group6.Util.GenerateID;

public class DonorProfileFactory {
    public static DonorProfile createDonorProfile (String donorName, String donorAddress, String donorContact) {
        String donorId = GenerateID.generateID();
        DonorProfile donorProfile = new DonorProfile.Builder()
                .setDonorId(donorId)
                .setDonorName(donorName)
                .setDonorAddress(donorAddress)
                .setDonorContact(donorContact)
                .build();

        return donorProfile;
    }
}
