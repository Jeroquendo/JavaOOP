import java.util.List;

public class Car {
    private Long id;
    private String brand;
    private String model;
    // when the relation between classes are 1 to 1
    //private Owner owner;
    // When the relation between classes are 1 to n
    private List<Owner> ownerList;

    public Car() {}

    public Car(Long id, String brand, String model, List<Owner> ownerList) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ownerList = ownerList;
    }

    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerList=" + ownerList +
                '}';
    }
}
