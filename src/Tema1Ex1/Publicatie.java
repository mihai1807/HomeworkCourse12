package Tema1Ex1;

public class Publicatie {
    private String titlu;

    public Publicatie(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getType(){
        return "Publicatie";
    }

    public String getDetalii() {
        return "Titlu: " + this.titlu;
    }
    public final void getInfo() {
        System.out.println(getType());
        System.out.println(getDetalii());
    }
}
