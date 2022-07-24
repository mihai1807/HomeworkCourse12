package Tema1Ex3Ex4.P2;

public class Programator extends Angajat{
    public String limbajProgramare;
    public String editorCod;

    public Programator(String name, int age, double salary, int zileLibere, String limbajProgramare, String editorCod) {
        super(name, age, salary, zileLibere);
        this.limbajProgramare = limbajProgramare;
        this.editorCod = editorCod;
    }

    @Override
    public void munceste() {
        System.out.println("Programatorul cu numele " + super.name + " scrie cod " +
                this.limbajProgramare + " in editorul " + this.editorCod);
    }
}
