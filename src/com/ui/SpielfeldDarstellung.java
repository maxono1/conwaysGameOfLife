package com.ui;

import com.util.Interaktionsbrett;

public class SpielfeldDarstellung {
    public static final int DarstellungsBereichSeitenlaenge = 500;
    public static final int margin = 30;
    //der bereich(ausgenommen margin) ist der darstellungsbereich
    //10x10 zellen -> jede zelle 30x30
    //bei 20 und 10x10 zellen
    //jede 2x2

    //Berechnung Seitenlaenge/anzahlZellenProSeite = größe der zelle

    Interaktionsbrett ib;

    public SpielfeldDarstellung(Interaktionsbrett ib){
        this.ib = ib;
    }

    public void abwischen(){
        ib.abwischen();
    }

    public void spielfeldDarstellen(boolean[][] spielfeld){
        //funktioniert, aber bei krummen zahlen ist die größe manchmal kleiner als DarstellungsBereichSeitenlaenge
        //int seitenlaenge = 15;
        int anzahlQuadrateProZeile = spielfeld.length;
        int seitenlaenge = DarstellungsBereichSeitenlaenge/anzahlQuadrateProZeile;


        Quadrat[][] alleQuadrate = new Quadrat[anzahlQuadrateProZeile][anzahlQuadrateProZeile];


        for(int i = 0; i < anzahlQuadrateProZeile;i++){
            for(int j = 0; j < anzahlQuadrateProZeile;j++){

                //erstes quadrat margin weit weg vom rand, 0*seitenlaenge also 0px extra
                //zweites quadrat margin weit weg + 1*seitenlaenge also zb 15px weiter rechts
                Quadrat bruh = new Quadrat((i*seitenlaenge)+margin,(j*seitenlaenge)+margin,seitenlaenge);


                alleQuadrate[i][j] = bruh;
                bruh.darstellenRahmen(ib);

                //falls zelle bzw quadrat bewohnt, dann ausfuellen
                if(spielfeld[i][j]){
                    bruh.darstellenFuellung(ib);
                }

            }

        }
    }
}
