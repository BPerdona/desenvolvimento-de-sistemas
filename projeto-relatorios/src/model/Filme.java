
package model;

public class Filme extends Object {
    private int idFilme = -1;
    private String titulo = null;
    private String genero = null;
    private String produtora = null;
    private short statusTupla = -1;
    private String codigo = null;

    public Filme() {
    }
    
    public Filme(String codigo){
        this.codigo=codigo;
    }

    public Filme(String titulo, String genero, String produtora, String codigo){
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.codigo = codigo;
    };
    
    public Filme(int idFilme, String titulo, String genero, String produtora, short statusTupla, String codigo){
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.produtora = produtora;
        this.statusTupla = statusTupla;
        this.codigo = codigo;
    }
    

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public short getStatusTupla() {
        return statusTupla;
    }

    public void setStatusTupla(short statusTupla) {
        this.statusTupla = statusTupla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   
}
