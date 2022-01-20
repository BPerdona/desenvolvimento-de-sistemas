
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

public class UsuarioDao extends AbstractDao{

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alUsuario = new ArrayList<Object>();
        Connection connection = ConnectionFactory.getConnection();
        String sql = "select * from usuario where 1=1";
        
        Map<Integer, Object> params = new HashMap<>();
        if(((Usuario)model).getIdUsuario() != null){
            sql += " and idUsuario = ?";
            params.put(params.size()+1, ((Usuario)model).getIdUsuario());
        }
        if(((Usuario)model).getLogin() != null){
            sql += " and login = ?";
            params.put(params.size()+1, ((Usuario)model).getLogin());
        }
        if(((Usuario)model).getSenha() != null){
            sql += " and senha = md5(?)";
            params.put(params.size()+1, ((Usuario)model).getSenha());
        }
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            this.mapParams(ps, params);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Object model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
