public abstract class Plant {
    protected String name;
    protected double altoTallo;
    protected boolean haveLeaves;
    protected String idealClimate;

    public Plant() {}

    public Plant(String name, double altoTallo, boolean haveLeaves, String idealClimate) {
        this.name = name;
        this.altoTallo = altoTallo;
        this.haveLeaves = haveLeaves;
        this.idealClimate = idealClimate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isHaveLeaves() {
        return haveLeaves;
    }

    public void setHaveLeaves(boolean haveLeaves) {
        this.haveLeaves = haveLeaves;
    }

    public String getIdealClimate() {
        return idealClimate;
    }

    public void setIdealClimate(String idealClimate) {
        this.idealClimate = idealClimate;
    }

    protected abstract void kindOfPlant();
}
