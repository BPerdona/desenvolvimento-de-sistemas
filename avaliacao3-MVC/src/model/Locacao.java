
package model;

import java.util.Date;


public class Locacao extends Object{
    private int idLocacao = -1;
    private int cliente_idCliente =-1;
    private Date dataLocacao = null;
    private Date dataDevolucao = null;
    private double valor;
    private short statusTupla=-1;
    private boolean emprestado = false;

    public Locacao(int cliente_idCliente, Date dataLocacao, Date dataDevolucao, double valor, boolean emprestado) {
        this.cliente_idCliente = cliente_idCliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valor = valor;
        this.emprestado = emprestado;
    }
    
    public Locacao(int idLocacao, int cliente_idCliente, Date dataLocacao, Date dataDevolucao, double valor, short statusTupla, boolean emprestado){
        this.idLocacao = idLocacao;
        this.cliente_idCliente = cliente_idCliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valor = valor;
        this.statusTupla = statusTupla;
        this.emprestado = emprestado;
    }
    
    public Locacao(){
        
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public int getCliente_idCliente() {
        return cliente_idCliente;
    }

    public void setCliente_idCliente(int cliente_idCliente) {
        this.cliente_idCliente = cliente_idCliente;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public short getStatusTupla() {
        return statusTupla;
    }

    public void setStatusTupla(short statusTupla) {
        this.statusTupla = statusTupla;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
