
package model;


public class ItensLocacao extends Object{
    private int idItensLocacao = -1;
    private int locacao_idLocacao = -1;
    private int filme_idFilme = -1;

    public ItensLocacao() {
    }
    
    public ItensLocacao(int idItensLocacao, int locacao_idLocacao, int filme_idFilme){
        this.idItensLocacao = idItensLocacao;
        this.locacao_idLocacao = locacao_idLocacao;
        this.filme_idFilme = filme_idFilme;
    }
    
    //Utilizado para criar os inserts
    public ItensLocacao(int locacao_idLocacao, int filme_idFilme){
        this.locacao_idLocacao = locacao_idLocacao;
        this.filme_idFilme = filme_idFilme;
    }

    public int getIdItensLocacao() {
        return idItensLocacao;
    }

    public void setIdItensLocacao(int idItensLocacao) {
        this.idItensLocacao = idItensLocacao;
    }

    public int getLocacao_idLocacao() {
        return locacao_idLocacao;
    }

    public void setLocacao_idLocacao(int locacao_idLocacao) {
        this.locacao_idLocacao = locacao_idLocacao;
    }

    public int getFilme_idFilme() {
        return filme_idFilme;
    }

    public void setFilme_idFilme(int filme_idFilme) {
        this.filme_idFilme = filme_idFilme;
    }
    
    
}
