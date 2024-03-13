import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1523, "Juan");
        employeeMap.put(1524, "Marcela");
        employeeMap.put(1525, "Esteban");
        employeeMap.put(1526, "Diana");
        employeeMap.put(1527, "Carlos");

        /*
        boolean isThere = employeeMap.containsValue("Juan");
        boolean isThere = employeeMap.containsKey(1525);
        if(isThere == true) {
            System.out.println("The value is in the Map");
        } else {
            System.out.println("The value is not in the Map");
        }*/
        //Return all the value in the Map
        System.out.println(employeeMap.values());
        //Return all the keys in the Map
        System.out.println(employeeMap.keySet());

        // Return value for a key
        String employeeName = employeeMap.get(1524);
        System.out.println("Employee searched is: " + employeeName);

        //Remove item from the Map
        employeeMap.remove(1528);
        
    }
}