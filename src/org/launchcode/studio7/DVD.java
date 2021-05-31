package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String strTitle, String strDiscModel, int iStorageCapacity, int iusedSpace, String strspinSpeed, String strMemoryType) {

        super(strTitle, strDiscModel,iStorageCapacity,iusedSpace,strspinSpeed,strMemoryType);
    }

    @Override
    public void spinDisc() { System.out.println("A DVD spins at a rate of "+getSpinSpeed() + " rpm"); }

    @Override
    public void storageDisc() {
        System.out.println("DVD storageCapacity: "+getStorageCapacity());
    }

    @Override
    public void returnInfo() {
        System.out.println("DVD return Information: \n" + toString());
    }

}
