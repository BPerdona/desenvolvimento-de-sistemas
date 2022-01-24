
package controller;

import dao.UsuarioDao;
import java.util.List;
import model.Usuario;


public class UsuarioController extends Controller{
    
    public UsuarioController(){
        this.dao = new UsuarioDao();
        this.consultar(new Usuario());
    }
    
    public List<Object> consultarLogin(Object model){
        this.listaObjetos.clear();
        this.listaObjetos = ((UsuarioDao)this.dao).consultarLogin(model);
        return this.listaObjetos;
    }
}
