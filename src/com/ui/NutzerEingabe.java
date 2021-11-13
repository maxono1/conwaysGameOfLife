package com.ui;

import com.util.EinUndAusgabe;

public class NutzerEingabe {
    private EinUndAusgabe io;
    private static final int MIN_ZELLEN = 5;
    private static final int MAX_ZELLEN = 100;
    private static final int MIN_WAHRSCHEINLICH = 1;
    private static final int MAX_WAHRSCHEINLICH = 100;

    public NutzerEingabe(EinUndAusgabe io){ this.io = io; }
    public int anzahlZellenDesSpielfelds(){
        //wichtig: dies heisst anzahl der zellen in einer Spalte/Reihe, nicht die gesamtAnzahl
        io.ausgeben("Bitte Anzahl der Zellen in einer Reihe des Quadrats angeben\n");

        int eingabe = -1;
        while ( (eingabe < MIN_ZELLEN) || (eingabe > MAX_ZELLEN) ){
            io.ausgeben("Bitte eine Zahl von " + MIN_ZELLEN + " bis " + MAX_ZELLEN + " angeben\n");
            eingabe = io.leseInteger();
        }
        return eingabe;
    }
    public int wahrscheinlichkeitDerBesiedlung(){
        io.ausgeben("Bitte Wahrscheinlichkeitswert angeben\n");

        int eingabe = -1;
        while ( (eingabe < MIN_WAHRSCHEINLICH) || (eingabe > MAX_WAHRSCHEINLICH) ){
            io.ausgeben("Bitte eine Zahl von " + MIN_WAHRSCHEINLICH + " bis " + MAX_WAHRSCHEINLICH + " angeben\n");
            eingabe = io.leseInteger();
        }
        return eingabe;
    }

    public int anzahlDerSimulationsschritte(){
        io.ausgeben("Bitte Anzahl der Simulationsschritte angeben\n");

        int eingabe = -1;
        //hier erstmal min_wahrscheinlich verwenden, is nicht wichtig.
        while ( (eingabe < MIN_WAHRSCHEINLICH) || (eingabe > MAX_WAHRSCHEINLICH) ){
            io.ausgeben("Bitte eine Zahl von " + MIN_WAHRSCHEINLICH + " bis " + MAX_WAHRSCHEINLICH + " angeben\n");
            eingabe = io.leseInteger();
        }
        return eingabe;
    }
}
