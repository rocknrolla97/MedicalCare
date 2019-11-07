package com.groupfour.MedicalCare.Model.Klinika;

import com.groupfour.MedicalCare.Model.Zahtevi.Operacija;

import java.time.LocalDateTime;

public class Sala {

    private int id;
    private boolean zauzeta = false;
    private LocalDateTime pocetakTermina;
    private LocalDateTime krajTermina;
    private Operacija operacija;

    public int getId() {
        return id;
    }

    public boolean isZauzeta() {
        return zauzeta;
    }

    public void setZauzeta(boolean zauzeta) {
        this.zauzeta = zauzeta;
    }

    public LocalDateTime getPocetakTermina() {
        return pocetakTermina;
    }

    public void setPocetakTermina(LocalDateTime pocetakTermina) {
        this.pocetakTermina = pocetakTermina;
    }

    public LocalDateTime getKrajTermina() {
        return krajTermina;
    }

    public void setKrajTermina(LocalDateTime krajTermina) {
        this.krajTermina = krajTermina;
    }

    public Operacija getOperacija() {
        return operacija;
    }

    public void setOperacija(Operacija operacija) {
        this.operacija = operacija;
    }
}
