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
public class Ex05 {
    public static void main (String [] args){ 
         Scanner entrada = new Scanner(System.in); 
         
         int base,altura; 
         
           System.out.println(" Digite o valor da altura: ");
           altura = entrada.nextInt();
           
           System.out.println(" Digite o valor da base: ");
           base = entrada.nextInt(); 
           
           int resultado = base * altura /2; 
            System.out.println(" O valor da área do triangulo é: " + resultado);
         
    }
    
}
