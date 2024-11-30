/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidoproject.controller;
import com.mycompany.pedidoproject.pedidos.AbstractPedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 13178031758
 */
public class GerenciarPedidos {
    private List<AbstractPedido> listaPedidos = new ArrayList<>();

    public GerenciarPedidos() {
    }

    public GerenciarPedidos(List<AbstractPedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public List<AbstractPedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<AbstractPedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    public void adicionarPedidos(AbstractPedido pedido){
        listaPedidos.add(pedido);
        
    }
    
    public void removerPedido(AbstractPedido pedido){
        listaPedidos.remove(pedido);
    }
    
    public void enviarNotificacoes( String txtMsg){
        for (AbstractPedido item : listaPedidos) {
            System.out.println(item.notificar(txtMsg)); // Exibe cada item na lista
        }
    }
    
    public void listarPedidos(){
        for (AbstractPedido item : listaPedidos) {
            System.out.println(item.toString()); // Exibe cada item na lista
        }
    }
    
}
