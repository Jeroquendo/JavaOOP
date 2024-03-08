package inheritance;

public class Boss extends Person {
    int id_boss;
    String boss_department;

    public Boss() {
    }

    public Boss(int id, String dni, String name, String lastName, String address, String phone, int id_boss, String boss_department) {
        super(id, dni, name, lastName, address, phone);
        this.id_boss = id_boss;
        this.boss_department = boss_department;
    }

    public int getId_boss() {
        return id_boss;
    }

    public void setId_boss(int id_boss) {
        this.id_boss = id_boss;
    }

    public String getBoss_department() {
        return boss_department;
    }

    public void setBoss_department(String boss_department) {
        this.boss_department = boss_department;
    }
}
