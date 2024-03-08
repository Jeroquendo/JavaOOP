package inheritance;

public class Worker extends Person {
    int intern_id;
    String rol;
    Double salary;

    public Worker() {}

    public Worker(int id, String dni, String name, String lastName, String address, String phone, int intern_id, String rol, Double salary) {
        super(id, dni, name, lastName, address, phone);
        this.intern_id = intern_id;
        this.rol = rol;
        this.salary = salary;
    }

    public int getIntern_id() {
        return intern_id;
    }

    public void setIntern_id(int intern_id) {
        this.intern_id = intern_id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
