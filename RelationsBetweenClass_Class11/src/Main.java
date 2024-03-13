import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setId(1L);
        myCar.setBrand("Mazda");
        myCar.setModel("CX-5");

        List<Owner> ownerList = new ArrayList<Owner>();
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();

        owner1.setId(35L);
        owner1.setName("Juan");
        owner1.setLastName("Rodas");
        owner2.setId(23L);
        owner2.setName("Marcela");
        owner2.setLastName("Colorado");

        ownerList.add(owner1);
        ownerList.add(owner2);
        myCar.setOwnerList(ownerList);

        System.out.println("The Car " + myCar.getBrand() + " " + myCar.getModel() + " have to owners: " + myCar.getOwnerList().toString());
    }
}