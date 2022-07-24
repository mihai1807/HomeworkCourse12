package Tema1Ex1;

public class Ziar extends Publicatie {
    private String sursa;

    public Ziar(String titlu, String sursa) {
        super(titlu);
        this.sursa = sursa;
    }

    @Override
    public String getType() {
        return "Ziar";
    }

    @Override
    public String getDetalii() {
        return "Titlu: " + super.getTitlu() + " Sursa: " + sursa;
    }
}
