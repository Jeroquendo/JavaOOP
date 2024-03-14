import enums.Color;

public class Main {
    // Simple enum
    /*
    enum Color {
        RED, BLUE, YELLOW, BLACK, WHITE
    }*/
    public static void main(String[] args) {
        //Example with simple Enum
        /*Color color = Color.WHITE;
        System.out.println("enums.Color is: "+ color);

        for(Color c: Color.values()) {
            System.out.println("the color is: " + c);
        }*/

        Color col = Color.GREEN;
        for (Color color: Color.values()) {
            System.out.println("The color is: "+ color);
        }

        System.out.println(col.name());
        System.out.println(col.ordinal());

        try {
            col = Color.valueOf("GREN");
            System.out.println("Color founded: " + col);
        } catch (IllegalArgumentException e) {
            System.out.println("There is an error. The value is not correct");
        }
    }
}