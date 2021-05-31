package org.launchcode.studio7;
public abstract class BaseDisc {
    private int storageCapacity;
    private String memoryType;
    private String title;
    private String discModel;
    private int storageUsed;
    private String spinSpeed;

    public BaseDisc(String strTitle, String strDiscModel, int iStorageCapacity, int iusedSpace, String strspinSpeed, String strMemoryType) {
        setTitle(strTitle);
        setDiscModel(strDiscModel);
        setStorageCapacity(iStorageCapacity);
        setStorageUsed(iusedSpace);
        setSpinSpeed(strspinSpeed);
        setMemoryType(strMemoryType);
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }

    public String getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(String spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getDiscModel() {
        return discModel;
    }

    public void setDiscModel(String discModel) {
        this.discModel = discModel;
    }

    public int spaceLeft() {
        return getStorageCapacity() - storageUsed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n" +
                "Disc Model : " + getDiscModel() + "\n" +
                "Storage Capacity: " + getStorageCapacity() + " " +  getMemoryType() + "\n" +
                "Disc Used: " + getStorageUsed() + " " +  getMemoryType() + "\n" +
                "Remaining Space: " + spaceLeft() + " " +  getMemoryType() + "\n" +
                "Spin Speed: " + getSpinSpeed() + " RPM" ;

    }
}