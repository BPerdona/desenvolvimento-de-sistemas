package controller;

import dao.ClienteDao;
import java.util.List;
import model.Cliente;

public class ClienteController extends Controller{
    
    public ClienteController(){
        this.dao = new ClienteDao();
        this.consultar(new Cliente());
    }
    
    public List<Object> getTuplasPorNome(String nome){
        this.listaObjetos.clear();
        this.listaObjetos = ((ClienteDao)this.dao).consultar(new Cliente(nome));
        return this.listaObjetos;
    }
}
