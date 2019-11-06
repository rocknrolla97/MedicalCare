package com.groupfour.MedicalCare.Model.Osoblje;

import com.groupfour.MedicalCare.Model.Pacijent.Pacijent;
import com.groupfour.MedicalCare.Model.Zahtevi.Recept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Component
public class MedicinskaSestra implements IMedicinskoOsoblje {
    private String korisnickoIme;
    private String lozinka;
    private List<Pacijent> listaPacijenata = new ArrayList<>();
    private Hashtable<Pacijent, Recept> listaRecepata = new Hashtable<>();

    public MedicinskaSestra(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public List<Pacijent> getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata(List<Pacijent> listaPacijenata) {
        this.listaPacijenata = listaPacijenata;
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


    @Override
    public void promeniLozinku(String lozinka) {
    }

    @Override
    public void podnesiZahtevZaOdmor() {
    }

    @Override
    public void podnesiZahtevZaOdsustvo() {
    }
}
