
package controller;

import java.util.List;
import java.util.ArrayList;
import dao.Dao;

public abstract class Controller {
    protected List<Object> listaObjetos = new ArrayList<Object>();
    protected Dao dao;
    
    public List<Object> getTuplas(){
        return listaObjetos;
    }
    
    public Object getTuplasPorIndice(int indiceTupla){
        return listaObjetos.get(indiceTupla);
    }
    
    public void consultar(Object controller){
        this.listaObjetos.clear();
        this.listaObjetos = this.dao.consultar(controller);
    }
    
    public boolean inserir(Object controller){
        boolean r = false;
        if(this.dao.inserir(controller) > 0){
            r=true;
        }
        this.consultar(new Object());
        return r;
    }
    
    public boolean alterar(Object controller){
        boolean r;
        r = this.dao.alterar(controller);
        this.consultar(new Object());
        return r;
    }
    
    public boolean excluir(Object controller){
        boolean r;
        r = this.dao.excluir(controller);
        this.consultar(new Object());
        return r;
    }
}
