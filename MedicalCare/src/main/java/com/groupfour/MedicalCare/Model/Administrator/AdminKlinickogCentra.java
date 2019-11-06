package com.groupfour.MedicalCare.Model.Administrator;

import com.groupfour.MedicalCare.Model.Zahtevi.RegistracijaKorisnika;
import org.springframework.stereotype.Component;

@Component
public class AdminKlinickogCentra implements IAdmin {
    private List<RegistracijaKorisnika> listaRegistracija;

    public AdminKlinickogCentra() {
    }

    public List<RegistracijaKorisnika> getListaRegistracija() {
        return listaRegistracija;
    }

    public void setListaRegistracija(List<RegistracijaKorisnika> listaRegistracija) {
        this.listaRegistracija = listaRegistracija;
    }
}
