package com.groupfour.MedicalCare.Model.Dokumenti;

import com.groupfour.MedicalCare.Model.Osoblje.IMedicinskoOsoblje;
import org.springframework.stereotype.Component;

@Component
public class Recept {
    private IMedicinskoOsoblje medicinskaSestra;
    private IMedicinskoOsoblje lekar;
    private boolean overeno = false;

    public Recept() {

    }

    public Recept(IMedicinskoOsoblje medicinskaSestra, IMedicinskoOsoblje lekar, boolean overeno) {
        this.medicinskaSestra = medicinskaSestra;
        this.lekar = lekar;
        this.overeno = overeno;
    }

    public IMedicinskoOsoblje getMedicinskaSestra() {
        return medicinskaSestra;
    }

    public void setMedicinskaSestra(IMedicinskoOsoblje medicinskaSestra) {
        this.medicinskaSestra = medicinskaSestra;
    }

    public IMedicinskoOsoblje getLekar() {
        return lekar;
    }

    public void setLekar(IMedicinskoOsoblje lekar) {
        this.lekar = lekar;
    }

    public boolean isOvereno() {
        return overeno;
    }

    public void setOvereno(boolean overeno) {
        this.overeno = overeno;
    }
}
