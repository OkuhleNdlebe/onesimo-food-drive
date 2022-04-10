package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.ParcelType;
import za.ac.cput.group6.Util.GenerateID;

public class ParcelTypeFactory {
    public static ParcelType createParcelType(String parcelTypeName, String parcelTypeDecr){
        String parcelTypeId = GenerateID.generateID();

        return new ParcelType.Builder()
                .setParcelTypeName(parcelTypeName)
                .setParcelTypeId(parcelTypeId)
                .setParcelTypeDecr(parcelTypeDecr)
                .build();
    }
}
