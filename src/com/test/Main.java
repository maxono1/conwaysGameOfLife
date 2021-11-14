package com.test;

import com.ui.Quadrat;
import com.ui.Steuerung;
import com.util.EinUndAusgabe;
import com.util.Interaktionsbrett;
import com.ui.SpielfeldDarstellung;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class Main {

    public static void main(String[] args){
        Steuerung steuerung = new Steuerung();
        steuerung.startDesSpiels();
    }
}

//Code graveyard
//
//Interaktionsbrett ib = new Interaktionsbrett();
//
//LinkedHashSet<Quadrat> alleQuadrate = new LinkedHashSet<>();
//
//
// Iterator<Quadrat> itr = alleQuadrate.iterator();
//       // if(itr.hasNext())
//        //    itr.next().darstellenFuellung(ib);
//
//        /*
//        for(int y = 10; y < seitenlaenge; y+=10){
//            ib.neueLinie(y,1,y,seitenlaenge);
//            ib.neueLinie(1,y,seitenlaenge,y);
//        }*/

/*
 int x = 0;
 int y = 0;

 for(int i = margin; i < ( anzahlQuadrateProZeile * seitenlaenge )+margin;i+=seitenlaenge){
 y=0;
 for(int j= margin; j<( anzahlQuadrateProZeile * seitenlaenge )+margin;j+=seitenlaenge){
 //neues Quadrat machen und da die methode aufrufen
 Quadrat bruh = new Quadrat(i,j,seitenlaenge);
 bruh.darstellenRahmen(ib);
 alleQuadrate[x][y] = bruh;
 //alleQuadrate.add(bruh);
 y++;
 }
 x++;
 }

 */

/*
* int seitenlaenge = 15;
        int anzahlQuadrateProZeile = 30;
        Quadrat[][] alleQuadrate = new Quadrat[anzahlQuadrateProZeile][anzahlQuadrateProZeile];


        for(int i = 0; i < anzahlQuadrateProZeile;i++){
            for(int j = 0; j < anzahlQuadrateProZeile;j++){

                //erstes quadrat margin weit weg vom rand, 0*seitenlaenge also 0px extra
                //zweites quadrat margin weit weg + 1*seitenlaenge also zb 15px weiter rechts
                Quadrat bruh = new Quadrat((i*seitenlaenge)+SpielfeldDarstellung.margin,(j*seitenlaenge)+SpielfeldDarstellung.margin,seitenlaenge);
                bruh.darstellenRahmen(ib);
                alleQuadrate[i][j] = bruh;
            }

        }
* */

/*
* EinUndAusgabe robot = new EinUndAusgabe();


        SpielfeldDarstellung spiel = new SpielfeldDarstellung( new Interaktionsbrett() );
        boolean[][] feld = new boolean[20][20];
        for(int i = 0; i < feld.length;i++){
            for(int j = 0; j < feld.length;j++){
                if(i==feld.length-1){
                    feld[i][j]=true;
                }
            }
        }

        spiel.spielfeldDarstellen(feld);
        robot.leseString();
        spiel.abwischen();
        robot.leseString();
        spiel.spielfeldDarstellen(feld);
*
* */