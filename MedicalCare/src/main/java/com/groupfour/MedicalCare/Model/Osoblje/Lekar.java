package com.groupfour.MedicalCare.Model.Osoblje;

import com.groupfour.MedicalCare.Model.Dokumenti.Recept;
import com.groupfour.MedicalCare.Model.Pacijent.Pacijent;
import org.springframework.stereotype.Component;

import java.util.Hashtable;
import java.util.List;

@Component
public class Lekar implements IMedicinskoOsoblje {
    private String korisnickoIme;
    private String lozinka;
    private List<Pacijent> listaPacijenata;
    private Hashtable<Pacijent, Recept> tabelaRecepata = new Hashtable<>();

    public Lekar(String korisnickoIme, String lozinka) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public List<Pacijent> getListaPacijenata() {
        return listaPacijenata;
    }

    public void setListaPacijenata(List<Pacijent> listaPacijenata) {
        this.listaPacijenata = listaPacijenata;
    }

    public Hashtable<Pacijent, Recept> getTabelaRecepata() {
        return tabelaRecepata;
    }

    public void setTabelaRecepata(Hashtable<Pacijent, Recept> tabelaRecepata) {
        this.tabelaRecepata = tabelaRecepata;
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
    public void podnesiZahtevZaOdmor() {
    }

    @Override
    public void podnesiZahtevZaOdsustvo() {
    }

    @Override
    public void promeniLozinku(String lozinka) {
    }
}
