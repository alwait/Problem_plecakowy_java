package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {

    @Test
    public void LiczenieRodzajow() {
        Problem p1 = new Problem(10, 1, 1, 10);
        assertEquals(10, p1.lista.size());
    }

    @Test
    public void SprawdzenieZakresu() {
        Problem p1 = new Problem(10, 1, 1, 10);
        for (int i = 0; i < p1.lista.size(); i++) {
            assert p1.lista.get(i).getWartosc() >= 1 && p1.lista.get(i).getWartosc() <= 10;
            assert p1.lista.get(i).getWaga() >= 1 && p1.lista.get(i).getWartosc() <= 10;
        }
    }

    @Test
    public void SpelnienieOgraniczen() {
        Problem p1 = new Problem(10, 1, 1, 10);
        Result r1 = p1.Solve(10);
        assertNotNull(r1.przedmioty.getFirst());
    }

    @Test
    public void NiespelnienieOgraniczen() {
        Problem p1 = new Problem(10, 1, 5, 15);
        Result r1 = p1.Solve(4);
        assertEquals(r1.przedmioty.size(),0);
    }

    @Test
    public void PoprawnoscWyniku() {
        Problem p1 = new Problem(10, 1, 1, 10);
        Result r1 = p1.Solve(40);
        int wagaTest=0;
        for (int i = 0; i < r1.przedmioty.size(); i++) {
            wagaTest += r1.przedmioty.get(i).getWaga();
        }
        assertEquals(r1.waga,wagaTest);
    }

}