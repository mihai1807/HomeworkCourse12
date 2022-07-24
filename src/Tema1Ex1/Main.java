package Tema1Ex1;

public class Main {
    public static void main(String[] args) {
        Publicatie publicatie1 = new Publicatie("Publicatie1");
        Anunt anunt1 = new Anunt("Anunt1", 10);
        Ziar ziar1 = new Ziar("Ziar1", "Sursa1");
        Articol articol1 = new Articol("Articol1", "Autor1");
    Publicatie [] Scrise = {publicatie1, anunt1, ziar1, articol1};
        for (Publicatie p : Scrise) {
            p.getInfo();
        }
    }
}
