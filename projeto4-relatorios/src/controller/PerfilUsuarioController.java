
package controller;

import dao.PerfilUsuarioDao;
import model.PerfilUsuario;

public class PerfilUsuarioController extends Controller{
 
    public PerfilUsuarioController(PerfilUsuario perfilUsuario){
        this.dao = new PerfilUsuarioDao();
        this.consultar(perfilUsuario);
    }
}
