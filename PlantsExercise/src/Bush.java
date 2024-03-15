public class Bush extends Plant{
    private double weightBush;
    private boolean isDomestic;
    private String bushVariety;
    private String leavesColor;
    private boolean prune;

    public Bush() {}

    public Bush(String name, double altoTallo, boolean haveLeaves, String idealClimate, double weightBush, boolean isDomestic, String bushVariety, String leavesColor, boolean prune) {
        super(name, altoTallo, haveLeaves, idealClimate);
        this.weightBush = weightBush;
        this.isDomestic = isDomestic;
        this.bushVariety = bushVariety;
        this.leavesColor = leavesColor;
        this.prune = prune;
    }

    public double getWeightBush() {
        return weightBush;
    }

    public void setWeightBush(double weightBush) {
        this.weightBush = weightBush;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getBushVariety() {
        return bushVariety;
    }

    public void setBushVariety(String bushVariety) {
        this.bushVariety = bushVariety;
    }

    public String getLeavesColor() {
        return leavesColor;
    }

    public void setLeavesColor(String leavesColor) {
        this.leavesColor = leavesColor;
    }

    public boolean isPrune() {
        return prune;
    }

    public void setPrune(boolean prune) {
        this.prune = prune;
    }

    @Override
    protected void kindOfPlant() {
        System.out.println("I'm a " + this.name);
    }
}
