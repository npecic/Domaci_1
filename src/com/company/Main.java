package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi operand: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Unesite aritmeticki operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Unesite drugi operand: ");
        double operand2 = scanner.nextDouble();
        // Kreiranje instance klase Kalkulator
        Kalkulator kalkulator = new Kalkulator(operand1, operand2, operator);

        // Izvršavanje odgovarajuće aritmetičke operacije na osnovu unetog operatora
        if (operator == '+') {
            System.out.println("Zbir dva broja: " + kalkulator.add());
        } else if (operator == '-') {
            System.out.println("Razlika dva broja: " + kalkulator.sub());
        } else if (operator == '*') {
            System.out.println("Proizvod dva broja: " + kalkulator.mul());
        } else if (operator == '/') {
            System.out.println("Količnik dva broja: " + kalkulator.div());
        } else {
            System.out.println("Nepoznat aritmetiiki operator.");
        }
    }
}

