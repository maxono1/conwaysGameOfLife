package com.test;

import com.util.Interaktionsbrett;

public class Main {
    public static void main(String[] args){

        Interaktionsbrett ib = new Interaktionsbrett();

        int seitenlaenge = 720;

        ib.neuesRechteck(1,1,seitenlaenge,seitenlaenge);
        for(int y = 10; y < seitenlaenge; y+=10){
            ib.neueLinie(y,1,y,seitenlaenge);
            ib.neueLinie(1,y,seitenlaenge,y);
        }
        for(int i = 1; i<10;i++) {
            ib.neueLinie(1,i,10,i);
            ib.neueLinie(i,1,i,10);
        }



    }
}
