/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class testeConexao {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();

        ProcedimentoBean pb = new ProcedimentoBean();
        ProcedimentoDAO pd = new ProcedimentoDAO(con);

        pb.setNome("Caroline");
        pb.setTelefone("(11)95560-2299");
        pb.setLimpezaDePele("Não realizada");
        pb.setUnhaGel("Não realizada");
        pb.setUnhaFibra("Procedimento realizado");
        pb.setPodologia("Procedimento realizado");
        pb.setEscovaCabelo("Não realizada");
        pb.setPinturaCabelo("Não realizada");
        pb.setLuzesCabelo("Não realizada");
        pb.setCorteCabelo("Procedimento realizado");
        pb.setMassagem("Não realizada");
        pb.setDrenagemLinfatica("Procedimento realizado");
        pb.setBanhoDeLama("Não realizada");
        System.out.println(pd.inserir(pb));

        List<ProcedimentoBean> lista = pd.listarTodos();
        if (lista != null) {
            for (ProcedimentoBean procedimento : lista) {
                System.out.println("Nome: " + procedimento.getNome());
                System.out.println("Telefone: " + procedimento.getTelefone());
                System.out.println("Limpeza de pele:" + procedimento.getLimpezaDePele());
                System.out.println("Unha de gel: " + procedimento.getUnhaGel());
                System.out.println("Unha de fibra: " + procedimento.getUnhaFibra());
                System.out.println("Podologia: " + procedimento.getPodologia());
                System.out.println("Escova Cabelo: " + procedimento.getEscovaCabelo());
                System.out.println("Pintura Cabelo: " + procedimento.getPinturaCabelo());
                System.out.println("Luzes Cabelo: " + procedimento.getLuzesCabelo());
                System.out.println("Corte Cabelo: " + procedimento.getCorteCabelo());
                System.out.println("Massagem: " + procedimento.getMassagem());
                System.out.println("Drenagem Linfática: " + procedimento.getDrenagemLinfatica());
                System.out.println("Banho de Lama: " + procedimento.getBanhoDeLama());
                System.out.println("");

            }
        }
        Conexao.fecharConexao(con);
    }

}
