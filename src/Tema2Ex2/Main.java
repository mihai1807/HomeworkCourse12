package Tema2Ex2;

public class Main {
    public static void main(String[] args) {
        BicicletaDeCurse bicicletaDeCurse = new BicicletaDeCurse();
        Automobil automobil = new Automobil();
        bicicletaDeCurse.afiseazaCuloare(" alb");
        bicicletaDeCurse.seDeplaseaza();
        automobil.afiseazaCuloare(" alb");
        automobil.seDeplaseaza();
        System.out.println(bicicletaDeCurse.intoarceNumarRoti());
        System.out.println(automobil.intoarceNumarRoti());
    }
}
