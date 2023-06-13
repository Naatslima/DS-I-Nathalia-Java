/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class ProcedimentoDAO {
   
    private Connection con;

    public ProcedimentoDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(ProcedimentoBean procedimento ) {

        String sql = "insert into Procedimento(nome, telefone, limpezaDePele, unhaGel, unhaFibra, podologia, escovaCabelo, pinturaCabelo, luzesCabelo, corteCabelo, massagem, drenagemLinfatica, banhoDeLama) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, procedimento.getNome());
            ps.setString(2, procedimento.getTelefone());
            ps.setString(3, procedimento.getLimpezaDePele());
            ps.setString(4, procedimento.getUnhaGel());
            ps.setString(5, procedimento.getUnhaFibra());
            ps.setString(6, procedimento.getPodologia());
            ps.setString(7, procedimento.getEscovaCabelo());
            ps.setString(8, procedimento.getPinturaCabelo());
            ps.setString(9, procedimento.getLuzesCabelo());
            ps.setString(10, procedimento.getCorteCabelo());
            ps.setString(11, procedimento.getMassagem());
            ps.setString(12, procedimento.getDrenagemLinfatica());
            ps.setString(13, procedimento.getBanhoDeLama()); 
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(ProcedimentoBean procedimento) {
        String sql = "update procedimento set nome = ?, telefone = ?, limpezaDePele = ?, unhaGel = ?, unhaFibra = ?,"
                + " podologia = ?, escovaCabelo = ?, pinturaCabelo = ?, luzesCabelo = ?, corteCabelo = ?, massagem = ?,"
                + " drenagemLinfatica = ?, banhoDeLama = ? "
                + "where cod_cliente = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, procedimento.getNome());
            ps.setString(2, procedimento.getTelefone());
            ps.setString(3, procedimento.getLimpezaDePele());
            ps.setString(4, procedimento.getUnhaGel());
            ps.setString(5, procedimento.getUnhaFibra());
            ps.setString(6, procedimento.getPodologia());
            ps.setString(7, procedimento.getEscovaCabelo());
            ps.setString(8, procedimento.getPinturaCabelo());
            ps.setString(9, procedimento.getLuzesCabelo());
            ps.setString(10, procedimento.getCorteCabelo());
            ps.setString(11, procedimento.getMassagem());
            ps.setString(12, procedimento.getDrenagemLinfatica());
            ps.setString(13, procedimento.getBanhoDeLama()); 
            ps.setInt(14, procedimento.getCod_cliente());
            
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(ProcedimentoBean procedimento) {
        String sql = "delete from procedimento where cod_cliente = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
           ps.setInt(1, procedimento.getCod_cliente());
            
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<ProcedimentoBean> listarTodos() {

        String sql = "select * from procedimento ";
        List<ProcedimentoBean> listaProcedimento = new ArrayList<ProcedimentoBean>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    ProcedimentoBean pb = new ProcedimentoBean();
                    pb.setCod_cliente(rs.getInt(1));
                    pb.setNome(rs.getString(2));
                    pb.setTelefone(rs.getString(3));
                    pb.setLimpezaDePele(rs.getString(4));
                    pb.setUnhaGel(rs.getString(5));
                    pb.setUnhaFibra(rs.getString(6));
                    pb.setPodologia(rs.getString(7));
                    pb.setEscovaCabelo(rs.getString(8));
                    pb.setPinturaCabelo(rs.getString(9));
                    pb.setLuzesCabelo(rs.getString(10));
                    pb.setCorteCabelo(rs.getString(11));
                    pb.setMassagem(rs.getString(12));
                    pb.setDrenagemLinfatica(rs.getString(13));
                    pb.setBanhoDeLama(rs.getString(14));
                    listaProcedimento.add(pb);
                }
                return listaProcedimento;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}