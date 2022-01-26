
package dao;

import bd.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import model.PerfilUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PerfilUsuarioDao extends AbstractDao {

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alPerfilUsuario = new ArrayList<Object>();
        Connection connection = ConnectionFactory.getConnection();
        String sql = "select * from perfilUsuario where 1=1";
        
        Map<Integer, Object> params = new HashMap<>();
        if(((PerfilUsuario)model).getIdPerfilUsuario()!=null){
            sql += " and idPerfilUsuario = ?";
            params.put(params.size()+1, ((PerfilUsuario)model).getIdPerfilUsuario());
        }
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            this.mapParams(ps, params);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alPerfilUsuario.add(new PerfilUsuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getShort(4)));
            }
            rs.close();
            ps.close();
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return alPerfilUsuario;
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
