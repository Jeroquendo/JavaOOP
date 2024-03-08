import Logic.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student std1 = new Student();
        Student std2 = new Student(5,"Juan","Rodas");

        System.out.println("id for student 2 is: " + std2.getId());
        System.out.println("name is: " + std2.getName());
        System.out.println("latName is: " + std2.getLastName());

        std1.setId(1);
        std1.setName("Marcela");
        std1.setLastName("Colorado");

        System.out.println("-------------------------");
        System.out.println("id for student 2 is: " + std1.getId());
        System.out.println("name is: " + std1.getName());
        System.out.println("latName is: " + std1.getLastName());

        System.out.println("-------------------------");
        std2.setId(2);
        System.out.println("Your id is: " + std2.getId());
    }
}