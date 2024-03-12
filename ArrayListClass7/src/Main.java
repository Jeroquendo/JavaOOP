import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList
        List<Person> lista = new ArrayList<Person>();
        // Add item to the ArrayList
        lista.add(new Person(1, "Juan", 29));
        lista.add(new Person(2, "Gabriel", 30));
        lista.add(new Person(3, "Ibre", 9));
        lista.add(new Person(4, "Carlos", 27));

        //recorrer por indice
        for(int i=0; i<lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getName());
        }

        System.out.println("----------------");

        // recorrer foreach
        for (Person person: lista) {
            System.out.println("Prueba: " + person.getName());
        }

        //Remove ArrayList
        // If I know the position that I want to remove, use the method remove
        lista.remove(1);

        /**Create LinkedList*/

        LinkedList<Person> linkedList = new LinkedList<Person>();

        // Add items to linkedList
        linkedList.add(new Person(1, "Juan", 29));
        linkedList.add(new Person(2, "Gabriel", 30));
        linkedList.add(new Person(3, "Ibre", 9));
        linkedList.add(new Person(4, "Carlos", 27));

        System.out.println("-------- LinkedList ----------");
        // Add item at the beginning of the list

        linkedList.add(0, new Person(5, "Marcela", 28));

        // recorrer foreach
        for (Person person: linkedList) {
            System.out.println("Prueba: " + person.getName());
        }

        /**
         * Remove when I don't know the position in linked List
         */
        String nameToDelete = "Ibre";
        for (Person person: linkedList) {
            if (person.getName().equals(nameToDelete)) {
                linkedList.remove(person);
                break; //We use the break to cut the for because the linkedList need to reorganize the pointers
            }
        }

        /**
         * methods that usually use with arrayList and linkedList
         */

        System.out.println("--------List sizes--------");
        System.out.println("ArrayList size: " + lista.size());
        System.out.println("LinkedList size: " + linkedList.size());

        System.out.println("--------List clear--------");
//        lista.clear();
//        linkedList.clear();

        System.out.println("--------lists are empty ?--------");
        System.out.println("ArrayList: " + lista.isEmpty());
        System.out.println("LinkedList: " + linkedList.isEmpty());

        // Methods for LinkedLists

        System.out.println("--------First and Last element in LinkedList--------");
        System.out.println("First position in LinkedList: " + linkedList.getFirst().toString());
        System.out.println("Last position in LinkedList: " + linkedList.getLast().toString());
    }
}