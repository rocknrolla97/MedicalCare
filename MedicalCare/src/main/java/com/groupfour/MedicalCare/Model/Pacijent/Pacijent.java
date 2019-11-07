package com.groupfour.MedicalCare.Model.Pacijent;

import com.groupfour.MedicalCare.Model.Dokumenti.Karton;
import com.groupfour.MedicalCare.Model.Klinika.Klinika;
import com.groupfour.MedicalCare.Model.Zahtevi.ITermin;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pacijent {
    private String korisnickoIme;
    private String lozinka;
    private List<ITermin> termin;
    private Karton zdravstveniKarton;
    private List<Klinika> klinike;

    public Pacijent(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public List<ITermin> getTermin() {
        return termin;
    }

    public void setTermin(List<ITermin> termin) {
        this.termin = termin;
    }

    public Karton getZdravstveniKarton() {
        return zdravstveniKarton;
    }

    public void setZdravstveniKarton(Karton zdravstveniKarton) {
        this.zdravstveniKarton = zdravstveniKarton;
    }

    public List<Klinika> getKlinike() {
        return klinike;
    }

    public void setKlinike(List<Klinika> klinike) {
        this.klinike = klinike;
    }
}
