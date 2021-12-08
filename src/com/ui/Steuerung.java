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
        int anzahlZellen = nutzerEingabe.anzahlZellenDesSpielfelds();
        int wahrscheinlichkeit = nutzerEingabe.wahrscheinlichkeitDerBesiedlung();

        simulation.berechneAnfangsGeneration(anzahlZellen,wahrscheinlichkeit);
        //simulation.specialAnfangsGeneration(anzahlZellen);


        while(true){
            int anzahlSimulationsSchritte = nutzerEingabe.anzahlDerSimulationsschritte();
            if(anzahlSimulationsSchritte < 0){

                break;
            }

            simulation.berechnefolgeGeneration(anzahlSimulationsSchritte);
        }

        System.out.println("Ende des Programms");
        System.exit(0);
    }

    private void initialisierung(){
        spielfeldDarstellung = new SpielfeldDarstellung( new Interaktionsbrett());
        nutzerEingabe = new NutzerEingabe( new EinUndAusgabe() );
        simulation = new Simulator();

        simulation.anmeldenFuerAktualisierungBeiAenderung(this);
        //beim simulation objekt anmelden?
    }

    public void aktualisiere(boolean[][] neueGeneration){
        //hier Spielfeld darstellung methoden benutzen
        spielfeldDarstellung.abwischen();
        spielfeldDarstellung.spielfeldDarstellen(neueGeneration);

    }
}
