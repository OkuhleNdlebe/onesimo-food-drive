package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.ParcelPack;
import za.ac.cput.group6.Util.GenerateID;

public class ParcelFactory {
    public static ParcelPack createParcel(String parcelDate, String parcelDescr, String parcelName ){

        String parcelId = GenerateID.generateID();
        return new ParcelPack.Builder()
                .setParcelId(parcelId)
                .setParcelName(parcelName)
                .setParcelDate(parcelDate)
                .setParcelDecr(parcelDescr)
                .build();
    }
}
