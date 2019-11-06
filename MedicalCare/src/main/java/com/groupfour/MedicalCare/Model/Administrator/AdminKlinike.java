package com.groupfour.MedicalCare.Model.Administrator;

import com.groupfour.MedicalCare.Model.Klinika.Klinika;
import org.springframework.stereotype.Component;

@Component
public class AdminKlinike implements IAdmin {
    private Klinika klinika;

    public AdminKlinike(Klinika klinika) {
        this.klinika = klinika;
    }

    public Klinika getKlinika() {
        return klinika;
    }

    public void setKlinika(Klinika klinika) {
        this.klinika = klinika;
    }
}
