package Tema2Ex3;
public class Ford extends Masina {

    public Ford(String culoare, boolean areProbleme) {
        super(culoare, true);
    }

    @Override
    public void porneste() {
        System.out.println("Ford porneste");
    }

    @Override
    public void seOpreste() {
        System.out.println("Ford se opreste");
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Ford se deplaseaza");
    }

    @Override
    public void seStrica() {
        System.out.println("Ford se strica");
        super.areProbleme = true;
    }
}



