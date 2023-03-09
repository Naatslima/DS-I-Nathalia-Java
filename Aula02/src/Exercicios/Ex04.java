/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex04 {
    public static void main (String [] args){ 
        Scanner x = new Scanner(System.in); 
        
        int a,b; // -> atalho para fazer a soma 
         
        System.out.println(" Digite o valor de A: "); 
        a = x.nextInt(); // -> copia de scanner de A, o parenteses permite q usuario add um numero 
        
         System.out.println(" Digite o valor de B: ");
           b = x.nextInt();
           
           int soma = a + b;
            System.out.println(" Digite o valor da soma é: " + soma);
            System.out.printf("\n O resultado é %d \n", soma);
    }
}

// atalho para chamar o scanner automatico = escreva a palavra "scanner, no final dela segure
// crult + espaço... vai abrir o comando import automatico 
