/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = 10;
        int b = 10;
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
    }

    void subtracao() {
        int c = 13;
        int d = 5;
        int subtracao = c - d;
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + subtracao);
    }

    void multiplicacao() {
        int c = 13;
        int d = 5;
        int mult = c * d;
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + mult);
    }

    void divisao() {
        double c = 13;
        double d = 5;
        double div = c / d;
        JOptionPane.showMessageDialog(null, "O valor da divisão é: " + div);
    }
}
