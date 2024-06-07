package org.example;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem(6, 5, 1, 10);
        System.out.print(problem.toString() + System.lineSeparator());
        Result wynik = problem.Solve(0);
        System.out.print(wynik.toString() + System.lineSeparator());
    }
}