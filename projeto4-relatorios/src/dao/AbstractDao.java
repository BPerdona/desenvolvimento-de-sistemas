
package dao;

import java.util.Map;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractDao implements Dao{
    
    public static void mapParams(PreparedStatement ps, Map<Integer, Object> map){
        try{
            for(Integer indexParam: map.keySet()){
                Object paramValue = map.get(indexParam);
                if(paramValue instanceof Integer){
                    ps.setInt(indexParam, (Integer) paramValue);
                } if (paramValue instanceof Date){
                    ps.setDate(indexParam, (java.sql.Date) paramValue);
                } else if (paramValue instanceof String){
                    ps.setString(indexParam, (String) paramValue);
                } else if (paramValue instanceof Short){
                    ps.setShort(indexParam, (Short) paramValue);
                } else if (paramValue instanceof Double){
                    ps.setDouble(indexParam, (Double) paramValue);
                } else if(paramValue instanceof Long){
                    ps.setLong(indexParam, (Long) paramValue);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
