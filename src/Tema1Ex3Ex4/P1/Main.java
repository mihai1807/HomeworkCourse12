package Tema1Ex3Ex4.P1;

public class Main {
    public static void main(String[] args) {
        Admitere.setLocuriTotale(5);
        Admitere.setOcuriOcupate(4);
        Admitere.setUltimaMedie(5);
        Student student1 = new Student("Ion", "Facultatea de informatica", 3);
        Student student2 = new Student("Mihai", "Facultatea de informatica", 6);
        Student student3 = new Student("Alina", "Facultatea de informatica", 8);
        Student student4 = new Student("Ioana", "Facultatea de informatica", 9);
        System.out.println(Admitere.acceptaStudet(student1));
        System.out.println(Admitere.acceptaStudet(student2));
        System.out.println(Admitere.acceptaStudet(student3));
        System.out.println(Admitere.acceptaStudet(student4));
        Student [] studenti = {student1, student2, student3, student4};
        for (Student student : studenti) {
            student.afiseaza();
        }
    }
}
