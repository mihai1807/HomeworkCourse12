package Tema2Ex3;
public abstract class Masina {
    String culoare;
    boolean areProbleme;

    public Masina(String culoare, boolean areProbleme) {
        this.culoare = culoare;
        this.areProbleme = areProbleme;
    }


    public void afiseaza(){
        System.out.println("Culoare: " + culoare);
        System.out.println("Are probleme: " + areProbleme);
    }
    public abstract void porneste();
    public abstract void seOpreste();
    public abstract void seDeplaseaza();
    public abstract void seStrica();
}
