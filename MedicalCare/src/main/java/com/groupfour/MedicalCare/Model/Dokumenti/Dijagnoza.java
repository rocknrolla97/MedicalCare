package com.groupfour.MedicalCare.Model.Dokumenti;
//kontala sam da sifarnik bude lista dijagnoza
public class Dijagnoza {

    int id;
    String nazivBolesti;
    String lek;

    public Dijagnoza(String nazivBolesti, String lek) {
        this.nazivBolesti = nazivBolesti;
        this.lek = lek;
    }

    public int getId() {
        return id;
    }

    public String getNazivBolesti() {
        return nazivBolesti;
    }

    public void setNazivBolesti(String nazivBolesti) {
        this.nazivBolesti = nazivBolesti;
    }

    public String getLek() {
        return lek;
    }

    public void setLek(String lek) {
        this.lek = lek;
    }
}
