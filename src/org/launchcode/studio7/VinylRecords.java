package org.launchcode.studio7;

public class VinylRecords extends BaseDisc implements OpticalDisc{

    public VinylRecords(String strTitle, String strDiscModel, int iStorageCapacity, int iusedSpace, String strspinSpeed, String strMemoryType) {
        super(strTitle, strDiscModel,iStorageCapacity,iusedSpace,strspinSpeed,strMemoryType);
    }

    @Override
    public void spinDisc() { System.out.println("Vinyl Record RPM: "+getSpinSpeed()); }

    @Override
    public void storageDisc() {System.out.println("Vinyl Record storageCapacity: "+getStorageCapacity());}

    @Override
    public void returnInfo() { System.out.println("Vinyl Record returnInformation: \n"+toString()+"\n"); }
}