import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        //Display stack
        System.out.println("Stack empty: " + stack);
        System.out.println("Stack empty ? " + stack.isEmpty());

        //Add element to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (Integer stacky: stack) {
            System.out.println(stacky);
        }

        //display stack
        System.out.println("Stack empty: " + stack);
        System.out.println("Stack empty ? " + stack.isEmpty());

        //Delete las item in the stack
        stack.pop();
        //Search item in the stack
        System.out.println("is 3 there ? " + stack.search(3));
        // Return the item in the top of the stack
        System.out.println("last added: " + stack.peek());
    }
}