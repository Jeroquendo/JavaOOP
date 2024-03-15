public class Flower extends Plant{
    private String petalColor;
    private int averageAmountOfPetals;
    private String talloColor;
    private String petalsColor;
    private String flowerVariety;
    private String station;

    public Flower() {}

    public Flower(String name, double altoTallo, boolean haveLeaves, String idealClimate, String petalColor, int averageAmountOfPetals, String talloColor, String petalsColor, String flowerVariety, String station) {
        super(name, altoTallo, haveLeaves, idealClimate);
        this.petalColor = petalColor;
        this.averageAmountOfPetals = averageAmountOfPetals;
        this.talloColor = talloColor;
        this.petalsColor = petalsColor;
        this.flowerVariety = flowerVariety;
        this.station = station;
    }

    public String getPetalColor() {
        return petalColor;
    }

    public void setPetalColor(String petalColor) {
        this.petalColor = petalColor;
    }

    public int getAverageAmountOfPetals() {
        return averageAmountOfPetals;
    }

    public void setAverageAmountOfPetals(int averageAmountOfPetals) {
        this.averageAmountOfPetals = averageAmountOfPetals;
    }

    public String getTalloColor() {
        return talloColor;
    }

    public void setTalloColor(String talloColor) {
        this.talloColor = talloColor;
    }

    public String getPetalsColor() {
        return petalsColor;
    }

    public void setPetalsColor(String petalsColor) {
        this.petalsColor = petalsColor;
    }

    public String getFlowerVariety() {
        return flowerVariety;
    }

    public void setFlowerVariety(String flowerVariety) {
        this.flowerVariety = flowerVariety;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    protected void kindOfPlant() {
        System.out.println("I'm a " + this.name);
    }
}
