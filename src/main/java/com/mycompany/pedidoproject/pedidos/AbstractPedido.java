/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidoproject.pedidos;

import java.util.Objects;

/**
 *
 * @author 13178031758
 */
public abstract class AbstractPedido {
    private Integer Codigo;
    private String Descricao;
    private Double Preco;

  
    

    public AbstractPedido(Integer Codigo, String Descricao, Double Preco) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        this.Preco = Preco;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Double getPreco() {
        return Preco;
    }
    
    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.Codigo);
        hash = 67 * hash + Objects.hashCode(this.Descricao);
        hash = 67 * hash + Objects.hashCode(this.Preco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractPedido other = (AbstractPedido) obj;
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return Objects.equals(this.Preco, other.Preco);
    }

    @Override
    public String toString() {
        return "AbstractPedido{" + "Codigo=" + Codigo + ", Descricao=" + Descricao + ", Preco=" + Preco + '}';
    }

  
    
    public abstract Double calcularImposto();
            
            
            
    
    public String notificar(String texto){

       return texto;
    }
    
    
}
