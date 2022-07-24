package Tema1Ex3Ex4.P1;

public class Admitere {
    private static double ultimaMedie;
    private static int locuriTotale;
    private static int locuriOcupate;

    public static double getUltimaMedie() {
        return ultimaMedie;
    }

    public static void setUltimaMedie(double ultimaMedie) {
        Admitere.ultimaMedie = ultimaMedie;
    }

    public static int getLocuriTotale() {
        return locuriTotale;
    }

    public static void setLocuriTotale(int locuriTotale) {
        Admitere.locuriTotale = locuriTotale;
    }

    public static int getOcuriOcupate() {
        return locuriOcupate;
    }

    public static void setOcuriOcupate(int ocuriOcupate) {
        Admitere.locuriOcupate = ocuriOcupate;
    }

    public static boolean acceptaStudet(Student student) {
        if (locuriOcupate == locuriTotale) {
            return false;
        } else {
            return student.getMedieAdmitere() >= ultimaMedie;
        }
    }

    public static void schimbaFacultatea(Student student, String facultateNoua) {
        student.setFacultate(facultateNoua);
    }
}
