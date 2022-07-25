package Tema2Ex3;

public class ServiceAuto {
    public static void main(String[] args) {
        Masina dacia = new Dacie("alb", false);
        Masina ford = new Ford("verde", true);
        Masina dacia2 = new Dacie("negru",false);
        Masina ford2 = new Ford("rosu", true);
        Masina [] masini = {dacia, ford,dacia2,ford2};

        dacia.afiseaza();
        dacia.porneste();
        dacia.seDeplaseaza();
        dacia.seOpreste();
        ford.afiseaza();
        ford.porneste();
        ford.seDeplaseaza();
        ford.seOpreste();

        repara(ford);
        repara(ford2);

        reparaMasini(masini);



    }
    static void repara(Masina masina) {
        if (masina.areProbleme) masina.areProbleme = false;
        System.out.println("Masina a fost reparata.");
        masina.porneste();
        masina.seDeplaseaza();
    }

    static void reparaMasini(Masina[] masini) {
        for (Masina masina:masini) {
            if (masina.areProbleme) repara(masina);
            else {
                System.out.println("Masina nu are nevoie de reparatii.");
            }
        }
    }
}
