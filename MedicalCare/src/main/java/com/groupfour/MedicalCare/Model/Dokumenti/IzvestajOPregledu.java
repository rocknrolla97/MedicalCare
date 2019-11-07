package com.groupfour.MedicalCare.Model.Dokumenti;

import com.groupfour.MedicalCare.Model.Osoblje.IMedicinskoOsoblje;
import com.groupfour.MedicalCare.Model.Zahtevi.Operacija;
import com.groupfour.MedicalCare.Model.Zahtevi.Pregled;

import java.time.LocalDateTime;
import java.util.List;

public class IzvestajOPregledu {

    private int id;
    private int idIzvestaja;
    private LocalDateTime terminPregleda;
    private IMedicinskoOsoblje lekar;
    private IMedicinskoOsoblje medicinskaSestra;
    private String informacijeOPregledu;
    private List<Recept> recepti;
    private Dijagnoza dijagnoza;
    private Pregled dodatniPregled;
    private Operacija dodatnaOperacija;

    public int getId() {
        return id;
    }

    public IMedicinskoOsoblje getLekar() {
        return lekar;
    }

    public void setLekar(IMedicinskoOsoblje lekar) {
        this.lekar = lekar;
    }

    public IMedicinskoOsoblje getMedicinskaSestra() {
        return medicinskaSestra;
    }

    public void setMedicinskaSestra(IMedicinskoOsoblje medicinskaSestra) {
        this.medicinskaSestra = medicinskaSestra;
    }

    public String getInformacijeOPregledu() {
        return informacijeOPregledu;
    }

    public void setInformacijeOPregledu(String informacijeOPregledu) {
        this.informacijeOPregledu = informacijeOPregledu;
    }

    public List<Recept> getRecepti() {
        return recepti;
    }

    public void setRecepti(List<Recept> recepti) {
        this.recepti = recepti;
    }

    public Dijagnoza getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(Dijagnoza dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public Pregled getDodatniPregled() {
        return dodatniPregled;
    }

    public void setDodatniPregled(Pregled dodatniPregled) {
        this.dodatniPregled = dodatniPregled;
    }

    public Operacija getDodatnaOperacija() {
        return dodatnaOperacija;
    }

    public void setDodatnaOperacija(Operacija dodatnaOperacija) {
        this.dodatnaOperacija = dodatnaOperacija;
    }
}
