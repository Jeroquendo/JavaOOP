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

        /**Create LinkedList*/

        List<Person> linkedList = new LinkedList<Person>();

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
    }
}