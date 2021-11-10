package com.logik;

import java.util.concurrent.ThreadLocalRandom;

public class Simulator implements Simulation{
    private BeiAenderung beiAenderung;
    private boolean[][] spielfeld;
    private int anzahlFelder;

    @Override
    public void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinlichkeitDerBesiedlung) {
        //int wahrscheinlichkeitDerBesiedlung ist ein user input von 1 bis 100
        //für jede zelle eine zufallszahl berechnen

        //bsp anzahlDerZellen hei


        //das hier in nem loop?
        for( int i = 0; i < anzahlDerZellen; i++ ){
            for( int j = 0; j < anzahlDerZellen ; j++ ){

            }
        }

        int uniqueRandomValue = ThreadLocalRandom.current().nextInt(1,100);

    }

    @Override
    public void berechnefolgeGeneration(int berechnungsschritte) {

    }

    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung) {

    }
}
