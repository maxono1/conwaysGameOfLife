package com.ui;

import com.logik.BeiAenderung;
import com.logik.Simulation;
import com.logik.Simulator;
import com.util.EinUndAusgabe;
import com.util.Interaktionsbrett;

public class Steuerung implements BeiAenderung {
    //interaktion mit dem nutzer
    //interaktionsbrett und ein und ausgabe instanziieren
    private SpielfeldDarstellung spielfeldDarstellung;
    private NutzerEingabe nutzerEingabe;
    private Simulation simulation;


    public void startDesSpiels(){
        initialisierung();

        simulation = new Simulator();
        simulation.berechneAnfangsGeneration(nutzerEingabe.anzahlZellenDesSpielfelds(),
                nutzerEingabe.wahrscheinlichkeitDerBesiedlung());


    }

    private void initialisierung(){
        spielfeldDarstellung = new SpielfeldDarstellung( new Interaktionsbrett());
        nutzerEingabe = new NutzerEingabe( new EinUndAusgabe() );

        simulation.anmeldenFuerAktualisierungBeiAenderung(this);
        //beim simulation objekt anmelden?
    }

    public void aktualisiere(boolean[][] neueGeneration){
        //hier Spielfeld darstellung methoden benutzen

        spielfeldDarstellung.spielfeldDarstellen(neueGeneration);

    }
}
