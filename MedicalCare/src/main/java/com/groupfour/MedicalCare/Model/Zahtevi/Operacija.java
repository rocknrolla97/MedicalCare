package com.groupfour.MedicalCare.Model.Zahtevi;

import com.groupfour.MedicalCare.Model.Klinika.Sala;
import com.groupfour.MedicalCare.Model.Osoblje.IMedicinskoOsoblje;
import com.groupfour.MedicalCare.Model.Pacijent.Pacijent;

import java.time.LocalDateTime;

public class Operacija implements ITermin {

    private LocalDateTime terminOperacije;
    private Sala sala;
    private IMedicinskoOsoblje lekar;
    private Pacijent pacijent;

    public Operacija(){}

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

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }
}
