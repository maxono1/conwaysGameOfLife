package com.test;

import com.ui.NutzerEingabe;
import com.util.EinUndAusgabe;

public class NutzerEingabeTest {
    public static void main(String[] args){
        NutzerEingabe eingabe = new NutzerEingabe(new EinUndAusgabe());
        int anzahlZellen = eingabe.anzahlZellenDesSpielfelds();
        int wahrscheinlichkeit = eingabe.wahrscheinlichkeitDerBesiedlung();
        int anzahlSim = eingabe.anzahlDerSimulationsschritte();

        System.out.println("zellen: " + anzahlZellen + "\nwahrscheinlichkeit: " + wahrscheinlichkeit + "\nanzahlSim: " + anzahlSim);
    }
}
