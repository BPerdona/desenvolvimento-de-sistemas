package dao;

import bd.ConnectionFactory;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TFilme;
import java.sql.SQLException;
import model.Filme;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FilmeDao implements Dao{

    @Override
    public List<Object> consultar(Object model) {
        List<Object> alFilme = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from filme";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alFilme.add(new Filme(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getString(6)));
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alFilme;
    }
    
    public List<Object> consultarCodigo(String codigo){
        List<Object> alFilme = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from filme where codigo like ?";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setString(1, "%"+codigo+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alFilme.add(new Filme(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getString(6)));
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alFilme;
    }
    
    public List<Object> consultarPorId(int idFilme){
        List<Object> alFilme = new ArrayList<>();
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "select * from filme where idFilme= ?";
        
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, idFilme);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alFilme.add(new Filme(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getString(6)));
            }
            rs.close();
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alFilme;
    }
    
    @Override
    public int inserir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "insert into filme (titulo,genero,produtora,codigo) values (?,?,?,?)";
        int id = -1;
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ((Filme)model).getTitulo());
            ps.setString(2, ((Filme)model).getGenero());
            ps.setString(3, ((Filme)model).getProdutora());
            ps.setString(4, ((Filme)model).getCodigo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                id=rs.getInt(1);
            }
            ps.close();
            connection.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public boolean alterar(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "update filme set titulo = ?, genero = ?, produtora = ?, codigo = ? where idFilme = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setString(1, ((Filme)model).getTitulo());
            ps.setString(2, ((Filme)model).getGenero());
            ps.setString(3, ((Filme)model).getProdutora());
            ps.setString(4, ((Filme)model).getCodigo());
            ps.setInt(5, ((Filme)model).getIdFilme());
            ps.executeUpdate();
            ps.close();
            connection.close();
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean excluir(Object model) {
        Connection connection = ConnectionFactory.getConnection();
        String codigoSql = "delete from filme where idFilme=?";
        try{
            PreparedStatement ps = connection.prepareStatement(codigoSql);
            ps.setInt(1, ((Filme)model).getIdFilme());
            ps.execute();
            ps.close();
            connection.close();
            return true;
        }
        catch(SQLException ex){
            Logger.getLogger(TFilme.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}