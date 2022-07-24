package Tema1Ex3Ex4.P2;

public class Main {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Ion", 30, 1000, 5);
        Angajat angajat2 = new Angajat("Mihai", 40, 2000, 7);
        Programator programator1 = new Programator("Alina", 25, 3000, 5, "Java", "NetBeans");
        Programator programator2 = new Programator("Ioana", 35, 4000, 8, "Java", "Eclipse");
        Bucatar bucatar1 = new Bucatar("Gigel", 25, 3500, 4, 5, "pizza");
        Bucatar bucatar2 = new Bucatar("Mihai", 35, 3700, 8, 6, "paste");
        angajat1.munceste();
        angajat2.munceste();
        programator1.munceste();
        programator2.munceste();
        bucatar1.munceste();
        bucatar2.munceste();
        System.out.println(angajat1.cereLiber(1));
        System.out.println(angajat2.cereLiber(3));
        System.out.println(programator1.cereLiber(2));
        System.out.println(programator2.cereLiber(1));
        System.out.println(bucatar1.cereLiber(9));
        System.out.println(bucatar2.cereLiber(4));

        Angajat [] angajati = {angajat1, angajat2, programator1, programator2, bucatar1, bucatar2};
        int mediaSalariilor = 0, sumaSalariilor = 0;
        for (Angajat angajat : angajati) {
            sumaSalariilor += angajat.salary;
        }
        mediaSalariilor = sumaSalariilor / angajati.length;
        System.out.println("Media salariilor este " + mediaSalariilor);

    }
}
