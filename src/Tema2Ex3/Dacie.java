package Tema2Ex3;
public class Dacie extends Masina {
    public Dacie(String culoare, boolean areProbleme) {
        super(culoare, false);
    }

    @Override
    public void porneste() {
        System.out.println("Dacia porneste");
    }

    @Override
    public void seOpreste() {
        System.out.println("Dacia se opreste");
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Dacia se deplaseaza");
    }

    @Override
    public void seStrica() {
        System.out.println("Dacia se strica");
        super.areProbleme = true;
    }
}
