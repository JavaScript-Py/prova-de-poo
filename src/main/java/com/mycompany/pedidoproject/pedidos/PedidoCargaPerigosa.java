/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidoproject.pedidos;
import com.mycompany.pedidoproject.notificacoes.Notificacao;

/**
 *
 * @author 13178031758
 */
public class PedidoCargaPerigosa extends AbstractPedido {
    private String motivoCargaPerigosa;
    private final Notificacao notificacao;

    public PedidoCargaPerigosa(String motivoCargaPerigosa, Notificacao notif, Integer Codigo, String Descricao, Double Preco) {
        super(Codigo, Descricao, Preco);
        this.motivoCargaPerigosa = motivoCargaPerigosa;
        this.notificacao = notif;
    }

    

    public String getMotivoCargaPerigosa() {
        return motivoCargaPerigosa;
    }

    public void setMotivoCargaPerigosa(String motivoCargaPerigosa) {
        this.motivoCargaPerigosa = motivoCargaPerigosa;
    }

    @Override
    public String toString() {
        return "PedidoCargaPerigosa{" +
                "notificacao=" + notificacao +
                ", motivoCargaPerigosa='" + motivoCargaPerigosa + '\'' +
                "} " + super.toString();
    }

    @Override
    public String notificar(String texto){

       return this.notificacao.enviarMensagem(texto);
    }

    @Override
   public Double calcularImposto(){
       
       Double preco = getPreco();
        return (preco / 10) * 3;
        
   }
    
    
}
