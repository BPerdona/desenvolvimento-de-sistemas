
package controller;

import dao.ItensLocacaoDao;
import java.util.ArrayList;
import model.ItensLocacao;
import model.Locacao;

public class ItensLocacaoController extends Controller{
    
    public ItensLocacaoController(){
        this.dao = new ItensLocacaoDao();
        this.consultar(new ItensLocacao());
    }

    public boolean excluir(Locacao locacao){
        ArrayList<ItensLocacao> itensLocacao = (ArrayList<ItensLocacao>) (ArrayList<?>) this.getTuplas();
        ArrayList<ItensLocacao> itensExcluir = new ArrayList<>();
        
        for(ItensLocacao itens:itensLocacao){
            if(itens.getLocacao_idLocacao() == locacao.getIdLocacao())
                itensExcluir.add(itens);
        }
        
        for(int i=itensExcluir.size()-1; i>=0; i--){
            this.excluir(itensExcluir.get(i));
        }
        return true;
    }
}
