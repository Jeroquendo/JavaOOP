public class Main {
    public static void main(String[] args) {
        // Cast numeric values
        double num = 1.67;
        //Cast to int
        int numInt = (int) num;
        //Cast to long
        long numLong = (long) num;
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        //Working with Strings
        String quantity = "15";
        String price = "150.27";

        int quantityInt = Integer.parseInt(quantity);
        double priceDouble = Double.parseDouble(price);
        System.out.println("The order total is: " + (quantityInt * priceDouble));

        int age = 29;
        double height = 1.75;

        String ageString = String.valueOf(age);
        String heightString = String.valueOf(height);

        System.out.println("Age: " + ageString + " Height: " + heightString);
    }
}