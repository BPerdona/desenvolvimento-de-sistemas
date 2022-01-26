
package model;

import java.util.Date;


public class Usuario {
    Integer idUsuario = null;
    String nome = null;
    String login = null;
    String senha = null;
    Short statusTupla = null;
    Integer perfilUsuario_idPerfilUsuario = null;
    Date dataCadastro = null;

    public Usuario() {
    }
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(String nome, String login, String senha, Integer perfilUsuario){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfilUsuario_idPerfilUsuario = perfilUsuario;
    }
    
    public Usuario(Integer idUsuario, String nome, String login, String senha, Short statusTupla, Integer perfilUsuario){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.statusTupla = statusTupla;
        this.perfilUsuario_idPerfilUsuario = perfilUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Short getStatusTupla() {
        return statusTupla;
    }

    public void setStatusTupla(Short statusTupla) {
        this.statusTupla = statusTupla;
    }

    public Integer getPerfilUsuario_idPerfilUsuario() {
        return perfilUsuario_idPerfilUsuario;
    }

    public void setPerfilUsuario_idPerfilUsuario(Integer perfilUsuario_idPerfilUsuario) {
        this.perfilUsuario_idPerfilUsuario = perfilUsuario_idPerfilUsuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
