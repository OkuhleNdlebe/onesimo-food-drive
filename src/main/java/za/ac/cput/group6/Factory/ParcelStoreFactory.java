/* ParcelStoreFactory.java
Factory for the ParcelStore.
Author: Bokang Molaoa (218131097).
Date: 07 April 2022
*/
package za.ac.cput.group6.Factory;
import za.ac.cput.group6.Entity.ParcelStore;
import za.ac.cput.group6.Util.GenerateID;

public class ParcelStoreFactory {
    public static ParcelStore createParcelStore (String parcelStoreDescr, boolean parcelIsStoreFull) {
        String parcelStoreId = GenerateID.generateID();
       return new ParcelStore.Builder()
                .setParcelStoreId(parcelStoreId)
                .setParcelStoreDescr(parcelStoreDescr)
                .setIsStoreFull(parcelIsStoreFull)
                .build();
    }
}
