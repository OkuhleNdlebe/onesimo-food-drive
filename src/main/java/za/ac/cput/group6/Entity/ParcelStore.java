/* Parcel Storage.java
Entity for the ParcelStore.
Author: Bokang Molaoa (218131097) ADP3 Assignment 1.
Date: 07 April 2022
*/
package za.ac.cput.group6.Entity;

public class ParcelStore {
    private String parcelStoreId;
    private String parcelStoreDescr;
    public boolean isStoreFull;

    //Builder Constructor
    private ParcelStore(Builder builder) {
        this.parcelStoreId = builder.parcelStoreId;
        this.parcelStoreDescr = builder.parcelStoreDescr;
        this.isStoreFull = builder.isStoreFull;
    }

    public String getParcelStoreId() {
        return parcelStoreId;
    }

    public String getParcelStoreDescr() {
        return parcelStoreDescr;
    }

    public boolean isStoreFull() {
        return isStoreFull;
    }

    public static class Builder {
        private String parcelStoreId;
        private String parcelStoreDescr;
        private boolean isStoreFull;

        //Set ParcelStoreId
        public ParcelStore.Builder setParcelStoreId (String parcelStoreId) {
            this.parcelStoreId = parcelStoreId;
            return this;
        }

        public ParcelStore.Builder setParcelStoreDescr(String parcelStoreDescr) {
            this.parcelStoreDescr = parcelStoreDescr;
            return this;
        }

        public ParcelStore.Builder setIsStoreFull (boolean isStoreFull) {
            this.isStoreFull = isStoreFull;
            return this;
        }

        //Return instance of ParcelStore.
        public ParcelStore build() {
            return new ParcelStore(this);
        }

        //Copy method
        public ParcelStore.Builder copy(ParcelStore parcelStore) {
            return this;
        }
    }

    @Override
    public String toString() {
        return "ParcelStore: {" +
                "ParcelStoreId ='" + parcelStoreId + '\'' +
                ", ParcelStoreDescription ='" + parcelStoreDescr + '\'' +
                ", Is the Storeroom Full? =" + isStoreFull +
                '}';
    }
}
