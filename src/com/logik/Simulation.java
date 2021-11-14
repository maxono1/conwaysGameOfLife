package com.logik;

public interface Simulation {
    void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinlichkeitDerBesiedlung);
    void specialAnfangsGeneration(int anzahlDerZellen);
    void berechnefolgeGeneration(int berechnungsschritte);
    void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung);
}
