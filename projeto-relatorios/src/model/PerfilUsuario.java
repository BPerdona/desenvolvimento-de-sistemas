
package model;

import java.util.Date;


public class PerfilUsuario {
    Integer idPerfilUsuario = null;
    String nome = null;
    String descricao = null;
    Short statusTupla = null;
    Date dataCadastro = null;

    public PerfilUsuario() {
    }
    
    public PerfilUsuario(Integer idPerfilUsuario, String nome, String descricao, Short statusTupla){
        this.idPerfilUsuario = idPerfilUsuario;
        this.nome = nome;
        this.descricao = descricao;
        this.statusTupla = statusTupla;
    }

    public Integer getIdPerfilUsuario() {
        return idPerfilUsuario;
    }

    public void setIdPerfilUsuario(Integer idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Short getStatusTupla() {
        return statusTupla;
    }

    public void setStatusTupla(Short statusTupla) {
        this.statusTupla = statusTupla;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
    
}
