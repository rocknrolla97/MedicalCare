package com.groupfour.MedicalCare.Model.Zahtevi;

import java.time.LocalDateTime;

public class Odsustvo implements  ITermin {

    private LocalDateTime pocetakOdsustva;
    private LocalDateTime krajOdsustva;
    private boolean odobren;

    public Odsustvo(){}



    public LocalDateTime getPocetakOdsustva() {
        return pocetakOdsustva;
    }

    public void setPocetakOdsustva(LocalDateTime pocetakOdsustva) {
        this.pocetakOdsustva = pocetakOdsustva;
    }

    public LocalDateTime getKrajOdsustva() {
        return krajOdsustva;
    }

    public void setKrajOdsustva(LocalDateTime krajOdsustva) {
        this.krajOdsustva = krajOdsustva;
    }

    public boolean isOdobren() {
        return odobren;
    }

    public void setOdobren(boolean odobren) {
        this.odobren = odobren;
    }
}
