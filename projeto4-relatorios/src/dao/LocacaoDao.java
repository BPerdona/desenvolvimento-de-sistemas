
package dao;

import bd.ConnectionFactory;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Cliente;
import java.util.Random;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import model.Locacao;
import view.TDevolucao;
import view.TLocacao;

public class LocacaoDao implements Dao{

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alLocacao = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from locacao";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alLocacao.add(new Locacao(rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getShort(6),
                        rs.getBoolean(7)));
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alLocacao;
    }
    

    @Override
    public int inserir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "insert into locacao (cliente_idCliente, dataLocacao, valor, statusTupla, emprestado) values (?,?,?,?,?)";
        Random r = new Random();
        Double valor = r.nextDouble()*30;
        int id = -1;
        
        //Resolvendo problema das datas, agora ela adiciona o dia do computador
        LocalDate dataHoje = LocalDate.now( ZoneId.of( "America/Montreal" ) );
        java.sql.Date sqlDate = java.sql.Date.valueOf(dataHoje);
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ((Cliente)model).getIdCliente());
            ps.setDate(2, sqlDate);
            ps.setDouble(3, valor);
            ps.setShort(4, (short) 1);
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                id=rs.getInt(1);
            }
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public boolean alterar(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "delete from locacao where idLocacao=?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, ((Locacao)model).getIdLocacao());
            ps.execute();
            ps.close();
            connection.close();
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(TDevolucao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   
}
