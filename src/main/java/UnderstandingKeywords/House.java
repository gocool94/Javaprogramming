package UnderstandingKeywords;

public class House {

    public String HouseMake;

    public House() {
    }

    public House(String houseMake, String houseMaterial, int noofRooms) {
        this.HouseMake = houseMake;
        this.HouseMaterial = houseMaterial;
        this.NoofRooms = noofRooms;
    }

    public String HouseMaterial;

    public String getHouseMaterial() {
        return HouseMaterial;
    }

    public void setHouseMaterial(String houseMaterial) {
        HouseMaterial = houseMaterial;
    }

    public int NoofRooms;

}
