package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.ParcelStatus;
import za.ac.cput.group6.Util.GenerateID;

public class ParcelStatusFactory {
    public static ParcelStatus createParcelStatus(String parcelId,boolean parcelStatus){
        String parcelStatusId = GenerateID.generateID();
        return new ParcelStatus.Builder()
                .setParcelStatusId(parcelStatusId)
                .setParcelId(parcelId)
                .setParcelSatus(parcelStatus)
                .build();

    }
}
