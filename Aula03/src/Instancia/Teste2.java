/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;

import javax.swing.JOptionPane;

public class Teste2 {
    public static void main(String[] args) {
        Funcalc chamar = new Funcalc();
        
        String op = JOptionPane.showInputDialog("Digite o operador "); 
        
        if(op.equals("+")){
            chamar.soma();
        }else if(op.equals("-")){
            chamar.subtracao();
        }else if(op.equals("*")){
            chamar.multiplicacao();
        }else if(op.equals("/")){
            chamar.divisao();
        }else{
            System.out.println("Valor inválido");
    }
            
        
        
                
    }
    
}
