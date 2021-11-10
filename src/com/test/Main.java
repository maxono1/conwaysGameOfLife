package com.test;

import com.ui.Quadrat;
import com.util.Interaktionsbrett;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Interaktionsbrett ib = new Interaktionsbrett();

        int seitenlaenge = 15;
        int margin = 50;
        int anzahlQuadrateProZeile = 30;
        ArrayList<Quadrat> alleQuadrate = new ArrayList<Quadrat>();

        for(int i = margin; i<(anzahlQuadrateProZeile*seitenlaenge)+margin;i+=seitenlaenge){
            for(int j= margin; j<(anzahlQuadrateProZeile*seitenlaenge)+margin;j+=seitenlaenge){
                //neues Quadrat machen und da die methode aufrufen
                Quadrat bruh = new Quadrat(i,j,seitenlaenge);
                bruh.darstellenRahmen(ib);
                alleQuadrate.add(bruh);
            }
        }

        /*
        for(int y = 10; y < seitenlaenge; y+=10){
            ib.neueLinie(y,1,y,seitenlaenge);
            ib.neueLinie(1,y,seitenlaenge,y);
        }*/

        /*
        //fuellung
        for(int i = 1; i<10;i++) {
            for(int j = 1; j<10;j++){
                ib.neuerPunkt(i,j);
            }
        }*/



    }
}
