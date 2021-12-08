package com.logik;

import java.util.concurrent.ThreadLocalRandom;

public class Simulator implements Simulation{
    private BeiAenderung beiAenderung;
    private boolean[][] spielfeld;
    private int anzahlFelder;

    public Simulator(){

    }

    @Override
    public void berechneAnfangsGeneration(int anzahlDerZellen, int wahrscheinlichkeitDerBesiedlung) {
        //int wahrscheinlichkeitDerBesiedlung ist ein user input von 1 bis 100
        spielfeld = new boolean[anzahlDerZellen][anzahlDerZellen];

        //das hier in nem loop?
        for( int i = 0; i < anzahlDerZellen; i++ ){
            for( int j = 0; j < anzahlDerZellen ; j++ ){
                //für jede zelle eine zufallszahl berechnen
                int uniqueRandomValue = ThreadLocalRandom.current().nextInt(1,100);
                if( uniqueRandomValue < wahrscheinlichkeitDerBesiedlung ) spielfeld[i][j] = true;
            }
        }
        if( beiAenderung != null ) beiAenderung.aktualisiere(spielfeld);
    }

    @Override
    public void specialAnfangsGeneration(int anzahlDerZellen) {
        spielfeld = new boolean[anzahlDerZellen][anzahlDerZellen];
        spielfeld[0][1] = true;
        spielfeld[1][2] = true;
        spielfeld[2][0] = true;
        spielfeld[2][1] = true;
        spielfeld[2][2] = true;

        if( beiAenderung != null ) beiAenderung.aktualisiere(spielfeld);
    }

    @Override
    public void berechnefolgeGeneration(int berechnungsschritte) {
        for(int u = 0; u < berechnungsschritte; u++){
            //die äußerste wiederholt soviel wie schritte angegeben wurden
            boolean[][] neuesSpielfeld = new boolean[spielfeld.length][spielfeld.length];
            for( int i = 0; i < spielfeld.length; i++ ){
                for( int c = 0; c < spielfeld.length ; c++ ){
                    //jz kommt die fette logik
                    //ausnahmen sind wenn
                    //i == 0 oder i == spielfeld.length-1
                    //oder
                    //j == 0 oder j == spielfeld.length-1
                    int anzahlNachbarn = 0;
/*
                    //diese booleans sagen ob die jetzige zelle an irgendeinem rand ist
                    boolean left = false;
                    boolean right = false;
                    boolean top = false;
                    boolean bottom = false;

                    if( i == 0 ) left = true;
                    if( i == spielfeld.length-1 ) right = true;
                    if( c == 0 ) top = true;
                    if( c == spielfeld.length-1 ) bottom = true;

                    //nachbarn prüfen
                    //links oben
                    if((!top)&&(!left)&&spielfeld[i-1][c-1]) anzahlNachbarn++;
                    //oben
                    if((!top)&&spielfeld[i][c-1]) anzahlNachbarn++;
                    //rechts oben
                    if((!top)&&(!right)&&spielfeld[i+1][c-1]) anzahlNachbarn++;
                    //
                    //links
                    if((!left)&&spielfeld[i-1][c]) anzahlNachbarn++;
                    //rechts
                    if((!right)&&spielfeld[i+1][c]) anzahlNachbarn++;
                    //
                    //links unten
                    if((!bottom)&&(!left)&&spielfeld[i-1][c+1]) anzahlNachbarn++;
                    //unten
                    if((!bottom)&&spielfeld[i][c+1]) anzahlNachbarn++;
                    //rechts unten
                    if((!bottom)&&(!right)&&spielfeld[i+1][c+1]) anzahlNachbarn++;
*/
                    anzahlNachbarn = anzahlNachbarn(i,c);

                    if( anzahlNachbarn == 3 ||(spielfeld[i][c] && anzahlNachbarn == 2)) neuesSpielfeld[i][c] = true;
                    else neuesSpielfeld[i][c] = false;
                }
            }
            spielfeld = neuesSpielfeld;
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if( beiAenderung != null ) beiAenderung.aktualisiere(spielfeld);
        }

    }

    public int anzahlNachbarn(int x, int y){
        int anzahlNachbarn = 0;

        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++)
                if(j>=0 && i>=0 && !(i==x && j==y) && i< spielfeld.length &&j< spielfeld.length&&spielfeld[i][j]){
                    anzahlNachbarn++;
                }
        }
        return anzahlNachbarn;
    }

    @Override
    public void anmeldenFuerAktualisierungBeiAenderung(BeiAenderung beiAenderung) {
        this.beiAenderung = beiAenderung;
    }
}

/* code graveyard

  if(top){
                      if(left){}
                      else if(right){}
                      else{}
                  } else if(bottom){
                      if(left){}
                      else if(right){}
                      else{}
                  } else{
                      for(int x = i-1; x<=i+1;x++){
                          for (int y = c-1; y < c+1; y++) {
                              if((!(x==i && y==c))&&spielfeld[x][y]) anzahlNachbarn++;
                          }
                      }

  */