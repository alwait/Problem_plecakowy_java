package org.example;

import java.util.ArrayList;

public class Result {
    public int waga;
    public ArrayList<Przedmiot> przedmioty;
    public Result(){
        waga=0;
        przedmioty = new ArrayList<Przedmiot>();
    }
    @Override
    public String toString() {
        int wartosc=0;
        for(Przedmiot przedmiot: przedmioty){
            wartosc+= przedmiot.wartosc;
        }
        String instancja = "waga plecaka: " + waga + System.lineSeparator() + "wartosc przedmiotow: " + wartosc + System.lineSeparator();
        for (Przedmiot przedmiot : przedmioty) {
            instancja += "nr: " + (przedmiot.nr+1) + "   wartosc: " + przedmiot.getWartosc() + "   waga: " + przedmiot.getWaga() + System.lineSeparator();
        }
        return instancja;
    }
}
