package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String strTitle, String strDiscModel, int iStorageCapacity, int iusedSpace, String strspinSpeed, String strMemoryType) {

        super(strTitle, strDiscModel,iStorageCapacity,iusedSpace,strspinSpeed,strMemoryType);
    }

    @Override
    public void spinDisc() { System.out.println("A CD spins at a rate of "+getSpinSpeed() + " rpm"); }

    @Override
    public void storageDisc() {
        System.out.println("CD storageCapacity: "+getStorageCapacity());
    }

    @Override
    public void returnInfo() {
        System.out.println("CD return Information: \n \n" + toString());
    }

}
