package org.example;

public class Przedmiot {
    int nr;
    int wartosc;
    int waga;
    public Przedmiot(int Nr, int Wartosc, int Waga){
        nr=Nr;
        wartosc=Wartosc;
        waga=Waga;
    }
    public int getWartosc() {
        return wartosc;
    }
    public int getWaga(){
        return waga;
    }
}
