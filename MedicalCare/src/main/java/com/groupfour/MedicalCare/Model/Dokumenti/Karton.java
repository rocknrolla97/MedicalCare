package com.groupfour.MedicalCare.Model.Dokumenti;

import java.util.HashMap;
import java.util.List;

public class Karton {
    private int id;
    private int idPacijenta;
    private List<IzvestajOPregledu> izvestajiOPregledima;
    private List<Dijagnoza> istorijaBolesti;

    public Karton() {}

    public Karton(int idPacijenta, List<IzvestajOPregledu> izvestajiOPregledima, List<Dijagnoza> istorijaBolesti) {
        this.idPacijenta = idPacijenta;
        this.izvestajiOPregledima = izvestajiOPregledima;
        this.istorijaBolesti = istorijaBolesti;
    }

    public int getId() {
        return id;
    }

    public int getIdPacijenta() {
        return idPacijenta;
    }

    public void setIdPacijenta(int idPacijenta) {
        this.idPacijenta = idPacijenta;
    }

    public List<IzvestajOPregledu> getIzvestajiOPregledima() {
        return izvestajiOPregledima;
    }

    public void setIzvestajiOPregledima(List<IzvestajOPregledu> izvestajiOPregledima) {
        this.izvestajiOPregledima = izvestajiOPregledima;
    }

    public List<Dijagnoza> getIstorijaBolesti() {
        return istorijaBolesti;
    }

    public void setIstorijaBolesti(List<Dijagnoza> istorijaBolesti) {
        this.istorijaBolesti = istorijaBolesti;
    }
}
