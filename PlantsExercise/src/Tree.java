public class Tree extends Plant{
    private String variety;
    private String troncoType;
    private double troncoRadius;
    private String color;
    private String leavesType;

    public Tree() {}

    public Tree(String name, double altoTallo, boolean haveLeaves, String idealClimate, String variety, String troncoType, double troncoRadius, String color, String leavesType) {
        super(name, altoTallo, haveLeaves, idealClimate);
        this.variety = variety;
        this.troncoType = troncoType;
        this.troncoRadius = troncoRadius;
        this.color = color;
        this.leavesType = leavesType;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTroncoType() {
        return troncoType;
    }

    public void setTroncoType(String troncoType) {
        this.troncoType = troncoType;
    }

    public double getTroncoRadius() {
        return troncoRadius;
    }

    public void setTroncoRadius(double troncoRadius) {
        this.troncoRadius = troncoRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLeavesType() {
        return leavesType;
    }

    public void setLeavesType(String leavesType) {
        this.leavesType = leavesType;
    }

    @Override
    protected void kindOfPlant() {
        System.out.println("I'm a " +  this.name);
    }
}
