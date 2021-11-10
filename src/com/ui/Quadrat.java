package com.ui;

import com.util.Interaktionsbrett;

/**
 * TODO:
 * mit main testen
 * Fuellung rausfinden wie der shit geht bruderrrrr
 *
 * */

public class Quadrat {
    private int x; //positionswert für x???
    private int y;  //positionswert für y??
    private int seitenlaenge;

    public Quadrat(int x, int y, int seitenlaenge){
        setX(x);
        setY(y);
        setSeitenlaenge(seitenlaenge);
    }

    public void setSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void darstellenRahmen(Interaktionsbrett ib){
        //neues rechteck von interaktionsbrett benutzen??
        ib.neuesRechteck(x,y,seitenlaenge,seitenlaenge);
    }

    public void darstellenFuellung(Interaktionsbrett ib){
        // ka wie der shit geht bruderrrr
    }
}
