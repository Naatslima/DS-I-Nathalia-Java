/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import javax.swing.JOptionPane;

public class caixadeDialogo {

    public static void main(String[] args) { //psv crult espaço enter = atalho para puxar a frase inicial 
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);

    }

}
