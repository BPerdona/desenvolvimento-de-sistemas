
package controller;

import dao.UsuarioDao;
import model.Usuario;


public class UsuarioController extends Controller{
    
    public UsuarioController(){
        this.dao = new UsuarioDao();
        this.consultar(new Usuario());
    }
}
