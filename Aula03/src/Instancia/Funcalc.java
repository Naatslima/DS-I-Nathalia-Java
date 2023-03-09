/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;
import javax.swing.JOptionPane; 

public class Funcalc {
    
    void soma (){
           int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));;
        int soma = a + b;
       // JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
       JOptionPane.showMessageDialog(null, 
               String.format("O valor do soma é: \n %d + %d = %d ", a, b, soma));
       
       
    }
    
    void subtracao (){
           int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));;
        int sub = a - b;
       // JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
       JOptionPane.showMessageDialog(null, 
               String.format("O valor do subtração é: \n %d - %d = %d ", a, b, sub));
       
       
    }
    void multiplicacao (){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));;
        int mult = a * b;
       // JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
       JOptionPane.showMessageDialog(null, 
               String.format("O valor da multiplicação é: \n %d * %d = %d ", a, b, mult));
       
       
    }
    void divisao (){
           int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));;
        int div = a / b;
       // JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
       JOptionPane.showMessageDialog(null, 
               String.format("O valor da divisão é: \n %d / %d = %d ", a, b, div));
       
       
    }
    
    
}
