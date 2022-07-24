package Tema1Ex3Ex4.P2;

public class Angajat {
    public String name;
    public int age;
    public double salary;
    public int zileLibere;

    public Angajat(String name, int age, double salary, int zileLibere) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.zileLibere = zileLibere;
    }

    public void munceste() {
        System.out.println("Acest angajat munceste.");
    }

    public boolean cereLiber(int zileLibereCerute) {
        return zileLibere >= zileLibereCerute;
    }
}
