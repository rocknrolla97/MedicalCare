package com.groupfour.MedicalCare.Model.Klinika;

import com.groupfour.MedicalCare.Model.Osoblje.Lekar;

import java.time.LocalDateTime;

public class Klinika {
    private String naziv;
    private String adresa;
    private String opis;
    private List<LocalDateTime> slobodniTermini;
    private List<Lekar> listaLekara;
    private List<Sala>  spisakSala;
    private Cenovnik cenovnik;

    public Klinika(String naziv, String adresa, String opis) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<LocalDateTime> getSlobodniTermini() {
        return slobodniTermini;
    }

    public void setSlobodniTermini(List<LocalDateTime> slobodniTermini) {
        this.slobodniTermini = slobodniTermini;
    }

    public List<Lekar> getListaLekara() {
        return listaLekara;
    }

    public void setListaLekara(List<Lekar> listaLekara) {
        this.listaLekara = listaLekara;
    }

    public List<Sala> getSpisakSala() {
        return spisakSala;
    }

    public void setSpisakSala(List<Sala> spisakSala) {
        this.spisakSala = spisakSala;
    }

    public Cenovnik getCenovnik() {
        return cenovnik;
    }

    public void setCenovnik(Cenovnik cenovnik) {
        this.cenovnik = cenovnik;
    }
}
