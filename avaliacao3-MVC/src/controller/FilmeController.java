package controller;

import dao.FilmeDao;
import java.util.ArrayList;
import java.util.List;
import model.Filme;
import model.ItensLocacao;

public class FilmeController extends Controller{
    
    private ItensLocacaoController itensLocacaoController = new ItensLocacaoController();
 
    public FilmeController(){
        this.dao = new FilmeDao();
        this.consultar(new Filme());
    }
    
    public List<Object> getTuplasPorCodigo(String codigo){
        this.listaObjetos.clear();
        this.listaObjetos = ((FilmeDao)this.dao).consultarCodigo(codigo);
        return this.listaObjetos;
    }
    
    public ArrayList<Filme> getTuplasPorId(int idLocacao){
        ArrayList<Filme> todosFilmes = (ArrayList<Filme>) (ArrayList<?>) this.listaObjetos;
        ArrayList<Filme> filmesPorOrdem = new ArrayList<>();
        ArrayList<ItensLocacao> todosItens = (ArrayList<ItensLocacao>) (ArrayList<?>) itensLocacaoController.getTuplas();
        ArrayList<ItensLocacao> itensDaLocacao = new ArrayList<>();
        
        
        //Separando de todos os itens os expecificos do selecionado!
        for(ItensLocacao item : todosItens){
            if(item.getLocacao_idLocacao() == idLocacao)
                itensDaLocacao.add(item);
        }
        
        for(ItensLocacao item:itensDaLocacao){
            for(Filme filme:todosFilmes){
                if(item.getFilme_idFilme() == filme.getIdFilme())
                    filmesPorOrdem.add(filme);
            }
        }
        
        return filmesPorOrdem;
    } 
}
