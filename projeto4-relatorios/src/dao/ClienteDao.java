
package dao;

import bd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import view.TelaCliente;

public class ClienteDao extends AbstractDao {

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alCliente = new ArrayList<Object>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from cliente where 1=1";
        
        Map<Integer, Object> params = new HashMap<>();
        if(((Cliente)model).getIdCliente() != -1){
            codigoSql += " and IdCliente = ?";
            params.put(params.size()+1, ((Cliente)model).getIdCliente());
        }
        if(((Cliente)model).getNome() != null){
            if(!((Cliente)model).getNome().isBlank()){
                codigoSql += " and nome like ? ";
                params.put(params.size()+1, ((Cliente)model).getNome());
            }
        }
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            this.mapParams(ps, params);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alCliente.add(new Cliente(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getShort(5)));
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alCliente;
    }

    @Override
    public int inserir(Object model) {
       Connection connection = ConnectionFactory.getConnection();
       String codigoSql = "insert into cliente (nome, endereco) values (?,?)";
       int id = -1;
       try{
           PreparedStatement ps = connection.prepareStatement(codigoSql, PreparedStatement.RETURN_GENERATED_KEYS);
           ps.setString(1, ((Cliente)model).getNome());
           ps.setString(2, ((Cliente)model).getEndereco());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
           while(rs.next()){
               id=rs.getInt(1);
           }
           ps.close();
           connection.close();
       }
       catch(SQLException ex){
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       return id;
    }

    @Override
    public boolean alterar(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "update cliente set nome=?, endereco=?, statusTupla=? where idCliente = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setString(1, ((Cliente)model).getNome());
            ps.setString(2, ((Cliente)model).getEndereco());
            ps.setShort(3, ((Cliente)model).getStatusTupla());
            ps.setInt(4, ((Cliente)model).getIdCliente());
            ps.executeUpdate();
            ps.close();
            connection.close();
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "delete from cliente where idCliente=?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, ((Cliente)model).getIdCliente());
            ps.execute();
            ps.close();
            connection.close();
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
    

