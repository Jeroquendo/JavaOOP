public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(1, "Juan", "Rodas");

        System.out.println("id: " + std2.getId());
        System.out.println("name: " + std2.getName());
        System.out.println("lastName: " + std2.getLastName());
    }
}