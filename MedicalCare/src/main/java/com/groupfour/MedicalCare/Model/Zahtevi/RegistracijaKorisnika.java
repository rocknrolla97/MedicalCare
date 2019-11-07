package com.groupfour.MedicalCare.Model.Zahtevi;

public class RegistracijaKorisnika {

    private String korisnickoIme;
    private String email;
    private boolean odobren;
    private String razlogOdbijanja;

    public RegistracijaKorisnika(String korisnickoIme, String email) {
        this.korisnickoIme = korisnickoIme;
        this.email = email;
        this.razlogOdbijanja = "";
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOdobren() {
        return odobren;
    }

    public void setOdobren(boolean odobren) {
        this.odobren = odobren;
    }
}
