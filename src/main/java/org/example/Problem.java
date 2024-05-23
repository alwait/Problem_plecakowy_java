package org.example;

import org.example.Przedmiot;

import java.util.Arrays;
import java.util.Random;

public class Problem {
    int liczbaRozdzajow;
    int ziarno;
    int zakresDol;
    int zakresGora;
    Przedmiot[] lista;

    public Problem(int LiczbaRodzajow, int Ziarno, int ZakresDol, int ZakresGora) {
        liczbaRozdzajow = LiczbaRodzajow;
        ziarno = Ziarno;
        zakresDol = ZakresDol;
        zakresGora = ZakresGora;

        Random generator = new Random(ziarno);

        for (Przedmiot przedmiot : lista = new Przedmiot[liczbaRozdzajow]) {
            przedmiot = new Przedmiot(zakresDol + generator.nextInt(zakresGora), zakresDol + generator.nextInt(zakresGora));
        }

    }

    @Override
    public String toString() {
        String instancja = "";
        for (Przedmiot przedmiot : lista = new Przedmiot[liczbaRozdzajow]) {
            instancja += "wartosc: " + przedmiot.getWartosc() + "   waga: " + przedmiot.getWaga() + System.lineSeparator();
        }
        return instancja;
    }
}
