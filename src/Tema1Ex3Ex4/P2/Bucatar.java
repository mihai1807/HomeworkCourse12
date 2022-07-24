package Tema1Ex3Ex4.P2;

public class Bucatar extends Angajat {
    public int nrFeluriMancareStiute;
    public String felPreferat;

    public Bucatar(String name, int age, double salary, int zileLibere,int nrFeluriMancareStiute, String felPreferat) {
        super(name, age, salary, zileLibere);
        this.nrFeluriMancareStiute = nrFeluriMancareStiute;
        this.felPreferat = felPreferat;
    }

    @Override
    public void munceste() {
        System.out.println("Bucatarul  " + super.name + " stie sa gateasca " +
                this.nrFeluriMancareStiute + " feluri iar felul preferat este " + this.felPreferat);
    }
}
