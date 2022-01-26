
package model;

import java.util.Date;


public class Cliente extends Object{
    private int idCliente = -1;
    private String nome = null;
    private String endereco = null;
    private Date dataCadastro = null;
    private short statusTupla = -1;

    public Cliente() {
    }
    
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public Cliente(int idCliente, String nome, String endereco, Date dataCadastro, short statusTupla){
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.statusTupla = statusTupla;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public short getStatusTupla() {
        return statusTupla;
    }

    public void setStatusTupla(short statusTupla) {
        this.statusTupla = statusTupla;
    }
    
}
