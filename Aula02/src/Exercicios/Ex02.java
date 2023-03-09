/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author CAMARGO
 */
public class Ex02 {
    
    public static void main (String [] args){
        String nome = "Nathalia"; 
        int idade = 28; 
        
        System.out.println("Eu me chamo " + nome + " e tenho " + idade + " anos.");
         System.out.printf("\n Meu nome é %s e vc tem %d anos.", nome, idade); 
    }
}

// System.out.printf("\n Meu nome é %s e vc tem %d anos.", nome, idade); 
// acima outra forma para chamar o texto formatado quando tem varias variaveis sem ter que ficar concatenando e abrindo ""
// dentro das aspas, %s = string, %d = int, %f double
// para diminuir a quantidade de numeros depois da virgula %.(o numero q vc quer dimunir sem o parenteses)f0

