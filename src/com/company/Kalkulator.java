package com.company;

// Klasa za izvršavanje osnovnih aritmetičkih operacija
public class Kalkulator {
    private double operand1;  // Prvi operand
    private double operand2;  // Drugi operand
    private char operator;    // Aritmetički operator (+,-,*,/)

    // Konstruktor za inicijalizaciju operanada i operatora
    public Kalkulator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    // Metoda za sabiranje
    public double add() {
        return this.operand1 + this.operand2;
    }

    // Metoda za oduzimanje
    public double sub() {
        return this.operand1 - this.operand2;
    }

    // Metoda za množenje
    public double mul() {
        return this.operand1 * this.operand2;
    }

    // Metoda za deljenje
    public double div() {
        if (operand2 != 0) {
            return this.operand1 / this.operand2;
        } else {
            System.out.println("Nije moguce deliti sa nulom.");
             return Double.NaN; // Vraćanje NaN (Not a Number) za neddefinisan rezultat
        }
    }
}
