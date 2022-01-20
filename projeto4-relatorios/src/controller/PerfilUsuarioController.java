
package controller;

import dao.PerfilUsuarioDao;
import model.PerfilUsuario;

public class PerfilUsuarioController extends Controller{
 
    public PerfilUsuarioController(){
        this.dao = new PerfilUsuarioDao();
        this.consultar(new PerfilUsuario());
    }
}
