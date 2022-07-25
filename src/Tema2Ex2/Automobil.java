package Tema2Ex2;

public class Automobil implements VehiculTerestru{
    @Override
    public int intoarceNumarRoti() {
        return 4;
    }

    @Override
    public void afiseazaCuloare(String culoare) {
        VehiculTerestru.super.afiseazaCuloare(culoare);
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Automobilul se deplaseaza");
    }
}
