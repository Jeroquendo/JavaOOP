package inheritance;

public class Consultant extends Person{
    String company_name;
    int id_consultant;

    public Consultant() {}

    public Consultant(int id, String dni, String name, String lastName, String address, String phone, String company_name, int id_consultant) {
        super(id, dni, name, lastName, address, phone);
        this.company_name = company_name;
        this.id_consultant = id_consultant;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getId_consultant() {
        return id_consultant;
    }

    public void setId_consultant(int id_consultant) {
        this.id_consultant = id_consultant;
    }
}
