public class Main {
    public static void main(String[] args) {
        try {
        int result = 3/0;
        } catch (Exception e) {
            System.out.println("You can divide a number with 0 !!!!");
        }

        int ages[] = {15,12,23,30};
        try{
        System.out.println("The age for the position 4 is: " + ages[4]);
        } catch (Exception e) {
            System.out.println("Yo try to get a position with an index that does not exist");
        }
    }
}