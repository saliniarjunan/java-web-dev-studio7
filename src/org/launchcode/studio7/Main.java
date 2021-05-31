package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCd = new CD("Viswasam", "CD-R", 700, 550,"200 - 500","MB");
        DVD myDvd = new DVD("Mankatha", "DVD-R", 4, 1,"570 - 1600","GB");
        VinylRecords myVinylRecords = new VinylRecords("Songs", "Raw Audio", 10, 5, "33 - 45","MB");
        FloppyDisks myFloppyDisks = new FloppyDisks("Documents", "Floppy Disc", 1, 0, "300","MB");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.spinDisc();
        myCd.storageDisc();
        myCd.returnInfo();

        System.out.println("---------------------\n");

        myDvd.spinDisc();
        myDvd.storageDisc();
        myDvd.returnInfo();

        System.out.println("---------------------\n");

        myVinylRecords.spinDisc();
        myVinylRecords.storageDisc();
        myVinylRecords.returnInfo();

        System.out.println("---------------------\n");

        myFloppyDisks.spinDisc();
        myFloppyDisks.storageDisc();
        myFloppyDisks.returnInfo();
    }
}
