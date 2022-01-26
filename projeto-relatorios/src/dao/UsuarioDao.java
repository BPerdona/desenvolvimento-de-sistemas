
package dao;

import bd.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.TFilme;
import view.TUsuario;

public class UsuarioDao extends AbstractDao{

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alUsuario = new ArrayList<Object>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from usuario where 1=1";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                alUsuario.add(new Usuario(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getInt(6)));
            }
            rs.close();
            ps.close();
            connection.close();
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alUsuario;
    }
    
    public List<Object> consultarLogin(Object model){
        List<Object> alUsuario = new ArrayList<Object>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from usuario where login = ? and senha = md5(?)";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setString(1, ((Usuario)model).getLogin());
            ps.setString(2, ((Usuario)model).getSenha());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                alUsuario.add(new Usuario(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getInt(6)));
            }
            rs.close();
            ps.close();
            connection.close();
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alUsuario;
    }

    @Override
    public int inserir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "Insert into usuario (nome, login, senha, perfilUsuario_idPerfilUsuario) values ( ? , ? , md5(?), ?)";
        int id = -1;
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setString(1, ((Usuario)model).getNome());
            ps.setString(2, ((Usuario)model).getLogin());
            ps.setString(3, ((Usuario)model).getSenha());
            ps.setInt(4, ((Usuario)model).getPerfilUsuario_idPerfilUsuario());
            ps.executeUpdate();
            ps.close();
            connection.close();
        }catch(SQLException ex){
            Logger.getLogger(TUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
        String codigoSql = "delete from usuario where idUsuario=?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, ((Usuario)model).getIdUsuario());
            ps.execute();
            ps.close();
            connection.close();
            return true;
        }catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
