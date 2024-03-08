import inheritance.Boss;
import inheritance.Consultant;
import inheritance.Person;
import inheritance.Worker;

public class Main {
    public static void main(String[] args) {
        /** Inheritance */
        /**System.out.println("Hello world!");
        Worker worker = new Worker();
        Consultant consultant = new Consultant();

        worker.getIntern_id();
        consultant.getId_consultant();*/

        /** Polymorphism */
        Person vector[] = new Person[5];
        vector[0] = new Person();
        vector[1] = new Worker();
        vector[2] = new Consultant();
        vector[3] = new Boss();
        
        Person person = new Person();
        Consultant consultant = new Consultant();

        person = consultant;

    }
}