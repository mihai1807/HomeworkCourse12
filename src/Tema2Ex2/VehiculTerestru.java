package Tema2Ex2;

public interface VehiculTerestru extends Vehicul {
    int intoarceNumarRoti();
    default void afiseazaCuloare(String culoare) {
        System.out.println("Culoarea este" + culoare);
    }
}

