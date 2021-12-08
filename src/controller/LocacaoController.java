
package controller;
import dao.ClienteDao;
import dao.ItensLocacaoDao;
import dao.LocacaoDao;
import java.util.List;
import java.util.ArrayList;
import model.Cliente;
import model.Filme;
import model.ItensLocacao;
import model.Locacao;

public class LocacaoController extends Controller{
    private ItensLocacaoController itensLocacaoController = new ItensLocacaoController();
    private ClienteController clienteController = new ClienteController();
    
    public LocacaoController(){
        this.dao = new LocacaoDao();
        this.listaObjetos = this.dao.consultar(new Object());
    }
    
    public boolean inserir(Object cliente, List<Filme> listaFilmes){
        boolean r = false;
        int pKey;
       
        pKey = this.dao.inserir(cliente);
        
        for(int i=0; i<listaFilmes.size(); i++){
            itensLocacaoController.dao.inserir(new ItensLocacao(pKey,listaFilmes.get(i).getIdFilme()));
        }
        this.consultar(new Object());
        return r;
    }
    
    public ArrayList<Cliente> clientesLocados(){
        ArrayList<Cliente> alClientes = (ArrayList<Cliente>) (ArrayList<?>) this.clienteController.getTuplas();
        ArrayList<Cliente> clientesLocados = new ArrayList<>();
        ArrayList<Locacao> locacao = (ArrayList<Locacao>) (ArrayList<?>) this.listaObjetos;
        
        for(Locacao itens:locacao){
            for(Cliente cliente : alClientes){
                if(itens.getCliente_idCliente() == cliente.getIdCliente()){
                    clientesLocados.add(cliente);
                }
            }
        }
        
        return clientesLocados;
    }
}
