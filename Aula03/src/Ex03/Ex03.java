/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;
import javax.swing.JOptionPane;

public class Ex03 {
   public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));;
        int soma = a + b;
       // JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
        
       JOptionPane.showMessageDialog(null, 
               String.format("O valor do soma é: \n %d + %d = %d ", a, b, soma));
   }
}
