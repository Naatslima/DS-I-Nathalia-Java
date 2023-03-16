/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafioAula05;

import javax.swing.JOptionPane;

public class Desafio {

    void triangulo() {

        try {

            int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do seu triangulo: "));
            int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do seu triangulo: "));

            int area = altura * base / 2;

            if (area <= 100) {
                JOptionPane.showMessageDialog(null, "A área do seu triangulo é: " + area + " cm.");
            } else {
                JOptionPane.showMessageDialog(null, "A área do seu triangulo é: " + area + " metros.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }

    void retangulo() {

        try {

            int base1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do seu retângulo"));
            int altura1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do seu retângulo"));

            int area1 = base1 * altura1;

            if (area1 <= 100) {
                JOptionPane.showMessageDialog(null, "A área do seu retângulo é: " + area1 + " cm.");
            } else {
                JOptionPane.showMessageDialog(null, "A área do seu retângulo é: " + area1 + " metros.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }

    void quadrado() {

        try {

            int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do seu quadrado: "));

            int area2 = altura2 * altura2;

            if (area2 <= 100) {
                JOptionPane.showMessageDialog(null, "A área do seu quadrado é: " + area2 + " cm.");
            } else {
                JOptionPane.showMessageDialog(null, "A área do seu quadrado é: " + area2 + " metros.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
}
