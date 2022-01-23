
package dao;

import bd.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TCliente;
import model.ItensLocacao;
import java.sql.ResultSet;
import java.util.ArrayList;
import view.TDevolucao;

public class ItensLocacaoDao implements Dao{

    @Override
    public List<Object> consultar(Object model) {
        List<Object> itensLoc = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from itenslocacao";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                itensLoc.add(new ItensLocacao(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3)));
            }
            rs.close();;
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TDevolucao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itensLoc;
    }
    

    @Override
    public int inserir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "insert into itenslocacao (locacao_idLocacao, filme_idFilme) values (?,?)";
        int id=-1;
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql,  PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ((ItensLocacao)model).getLocacao_idLocacao());
            ps.setInt(2, ((ItensLocacao)model).getFilme_idFilme());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                id=rs.getInt(1);
            }  
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TCliente.class.getName()).log(Level.SEVERE, null, ex);
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
        String codigoSql = "delete from itenslocacao where idItensLocacao=?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, ((ItensLocacao)model).getIdItensLocacao());
            ps.executeUpdate();
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
