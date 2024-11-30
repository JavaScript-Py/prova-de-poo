/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidoproject.pedidos;

/**
 *
 * @author 13178031758
 */
public class PedidoCargaSimples extends  AbstractPedido{
    private Integer quantidadeVolumes;

    public PedidoCargaSimples(Integer quantidadeVolumes, Integer Codigo, String Descricao, Double Preco) {
        super(Codigo, Descricao, Preco);
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public Integer getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(Integer quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    @Override
    public String toString() {
        return "PedidoCargaSimples{" +
                "quantidadeVolumes=" + quantidadeVolumes +
                "} " + super.toString();
    }

    @Override
    public Double calcularImposto(){
        Double preco = getPreco();
        return preco / 10;
        
        
    }
    
    
    
    
}
