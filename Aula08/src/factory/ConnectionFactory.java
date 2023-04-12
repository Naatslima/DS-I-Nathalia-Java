/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
//situa em qual packeage ou "pacote" está a classe package factory;
// faz as importações de classes necessárias para o funcionamento do programa

import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // drive de conexão SQL para Java
import java.sql.DriverManager; // SQLExeption; // classe para tratamento de exeções
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
        
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
