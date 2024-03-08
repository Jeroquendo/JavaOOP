package Logic;

public class Student {
    int id;
    String name;
    String lastName;

    public Student() {}

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void showName() {
        System.out.println("Hi, I'm a student and I can tell me name");
    }

    public void getApprove(double grade) {
        if(grade >=3) {
            System.out.println("Lesson approved !");
        } else {
            System.out.println("F !" );
        }
    }
}
