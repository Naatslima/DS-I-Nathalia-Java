/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Atividade1 {

    void idade() {

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digte sua idade"));

            if (idade >= 18) {
                System.out.println("Você é maior de idade :D");
            } else {
                System.out.println("Você é menor de idade!");
            }
        } catch (Exception e) {
            System.out.println("Caractere inválido, digite novamente!!!");
        }
    }
}
