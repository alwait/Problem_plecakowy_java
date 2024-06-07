package org.example;

import java.util.*;

public class Problem {
    int liczbaRozdzajow;
    int ziarno;
    int zakresDol;
    int zakresGora;
    public ArrayList<Przedmiot> lista;

    public Problem(int LiczbaRodzajow, int Ziarno, int ZakresDol, int ZakresGora) {
        liczbaRozdzajow = LiczbaRodzajow;
        ziarno = Ziarno;
        zakresDol = ZakresDol;
        zakresGora = ZakresGora;
        lista = new ArrayList<Przedmiot>();

        Random generator = new Random(ziarno);

        for (int i = 0; i < liczbaRozdzajow; ++i) {
            lista.add(new Przedmiot(i, zakresDol + generator.nextInt(zakresGora), zakresDol + generator.nextInt(zakresGora)));
        }

    }

    public Result Solve(int PojemnoscPlecaka) {
        lista.sort((p1, p2) -> Float.compare((float) p2.getWartosc() / (float) p2.getWaga(), (float) p1.getWartosc() / (float) p1.getWaga()));

        Result wynik = new Result();
        int dodajWage = 0;
        int rodzaj = 0;

        while (true) {
            dodajWage = lista.get(rodzaj).getWaga();
            if (PojemnoscPlecaka >= wynik.waga + dodajWage) {
                wynik.przedmioty.add(lista.get(rodzaj));
                wynik.waga += dodajWage;
            } else if (rodzaj < liczbaRozdzajow - 1) {
                rodzaj++;
            } else break;
        }
        return wynik;
    }

    @Override
    public String toString() {
        String instancja = "";
        for (Przedmiot przedmiot : lista) {
            instancja += "nr: " + (przedmiot.nr + 1) + "   wartosc: " + przedmiot.getWartosc() + "   waga: " + przedmiot.getWaga() + System.lineSeparator();
        }
        return instancja;
    }
}
