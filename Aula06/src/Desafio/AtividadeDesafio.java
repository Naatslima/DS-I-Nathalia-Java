/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio;

public class AtividadeDesafio {

    void separaSomaComparaParImpar() {

        int somaPar = 0;
        int somaImpar = 0;

        System.out.println("pares: \n");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                somaPar = somaPar + i;
            }
        }
        System.out.println("\nA soma total dos números pares é: " + somaPar);
        System.out.println("x::::::::::::::::::::::::::::::::::::::::::::x \n");
        System.out.println("ímpares: \n");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 1) {
                System.out.println(i);
                somaImpar = somaImpar + i;
            }
        }
        System.out.println("\nA soma total dos números ímpares é: " + somaImpar);
        System.out.println("x::::::::::::::::::::::::::::::::::::::::::::x");

        if (somaPar > somaImpar) {
            System.out.println("\nComparação:");
            System.out.println("\nA maior soma dos números é a do par: = " + somaPar);
            System.out.println("x::::::::::::::::::::::::::::::::::::::::::::x");
        } else {
            System.out.println("\nComparação:");
            System.out.println("\nA maior soma dos números é a do ímpar = " + somaImpar);
            System.out.println("x::::::::::::::::::::::::::::::::::::::::::::x");
        }
    }
}
