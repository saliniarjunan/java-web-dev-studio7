package org.launchcode.studio7;

public class FloppyDisks extends BaseDisc implements OpticalDisc{
    public FloppyDisks(String strTitle, String strDiscModel, int iStorageCapacity, int iusedSpace, String strspinSpeed, String strMemoryType) {
        super(strTitle, strDiscModel,iStorageCapacity,iusedSpace,strspinSpeed,strMemoryType);
    }

    @Override
    public void spinDisc() { System.out.println("Floppy Disks RPM: "+getSpinSpeed()); }

    @Override
    public void storageDisc() {System.out.println("Floppy Disks storageCapacity: "+getStorageCapacity());}

    @Override
    public void returnInfo() { System.out.println("Floppy Disks returnInformation: \n"+toString()+"\n"); }

}
