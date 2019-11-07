package com.groupfour.MedicalCare.Model.Zahtevi;


import com.groupfour.MedicalCare.Model.Klinika.Sala;
import com.groupfour.MedicalCare.Model.Osoblje.IMedicinskoOsoblje;

import java.time.LocalDateTime;

public class Pregled implements ITermin {

    private int id;
    private LocalDateTime terminPregleda;
    //tip i trajanje pregleda ne znam kako da definisem
    private Sala sala;
    private IMedicinskoOsoblje lekar;
    private int cena;
    //private IzvestajOPregledu izvestajOPregledu;


    public Pregled() {

    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTerminPregleda() {
        return terminPregleda;
    }

    public void setTerminPregleda(LocalDateTime terminPregleda) {
        this.terminPregleda = terminPregleda;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public IMedicinskoOsoblje getLekar() {
        return lekar;
    }

    public void setLekar(IMedicinskoOsoblje lekar) {
        this.lekar = lekar;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
