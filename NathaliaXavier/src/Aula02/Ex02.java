/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = x.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = x.nextInt();

        int soma = a + b;

        System.out.println("O valor da soma é: " + soma);

        System.out.println("Digite o valor de A: ");
        double c = x.nextDouble();

        System.out.println("Digite o valor de B: ");
        double d = x.nextDouble();

        double mais = c + d;

        System.out.println("O valor da soma é: " + mais);

        System.out.println("Digite o valor de A: ");
        double e = x.nextDouble();

        System.out.println("Digite o valor de B: ");
        double f = x.nextDouble();

        double divisao = e / f;

        System.out.println("O valor da soma é: " + divisao);
    }
}

// atalho para puxar o scanner crult espaço enter 
