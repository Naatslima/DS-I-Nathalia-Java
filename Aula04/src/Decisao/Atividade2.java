/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Atividade2 {

    void idade() {

        try {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            if (idade >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você é menor de idade!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caracter inválido");
        }
    }

    void soma() {

        try {

            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int soma = a + b;

            JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caracter inválido");
        }
    }

    void sub() {

        try {

            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

            int sub = a - b;

            JOptionPane.showMessageDialog(null, "O valor da subtração é: " + sub);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caracter inválido");
        }
    }
}
