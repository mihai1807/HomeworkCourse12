package Tema2Ex2;

public class BicicletaDeCurse extends Bicicleta implements VehiculTerestru {
    @Override
    public int intoarceNumarRoti() {
        return 2;
    }

    @Override
    public void afiseazaCuloare(String culoare) {
        super.afiseazaCuloare(culoare);
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Bicicleta de curse se deplaseaza");
    }
}

