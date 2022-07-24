package Tema1Ex3Ex4.P1;

public class Student {
    private final String NAME;
    private String facultate;
    private double medieAdmitere;

    public Student(String name, String facultate, double medieAdmitere) {
        this.NAME = name;
        this.facultate = facultate;
        this.medieAdmitere = medieAdmitere;
    }

    public String getNAME() {
        return NAME;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }

    public void setMedieAdmitere(double medieAdmitere) {
        this.medieAdmitere = medieAdmitere;
    }

    public void afiseaza() {
        System.out.println("Nume: " + NAME);
        System.out.println("Facultate: " + facultate);
        System.out.println("Medie admitere: " + medieAdmitere);
    }
}
