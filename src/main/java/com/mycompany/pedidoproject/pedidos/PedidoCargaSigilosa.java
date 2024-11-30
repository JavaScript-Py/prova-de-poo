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
public class PedidoCargaSigilosa extends AbstractPedido  {
    
    
    private String motivoSigilo;
    private Notificacao notificacao;

    public PedidoCargaSigilosa(String motivoSigilo, Integer Codigo, String Descricao, Double Preco, Notificacao notif) {
        super(Codigo, Descricao, Preco);
        this.motivoSigilo = motivoSigilo;
        this.notificacao = notif;
    }

    public String getMotivoSigilo() {
        return motivoSigilo;
    }

    public void setMotivoSigilo(String motivoSigilo) {
        this.motivoSigilo = motivoSigilo;
    }

    @Override
    public String toString() {
        return "PedidoCargaSigilosa{" +
                "motivoSigilo='" + motivoSigilo + '\'' +
                ", notificacao=" + notificacao +
                "} " + super.toString();
    }

    @Override
   public Double calcularImposto(){
       
       Double preco = getPreco();
        return preco / 5;
        
   }
   
   @Override
   public String notificar(String texto){

       return notificacao.enviarMensagem(texto);
   }
   
}
