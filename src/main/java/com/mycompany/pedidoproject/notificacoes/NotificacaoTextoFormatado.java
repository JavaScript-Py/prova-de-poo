/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidoproject.notificacoes;

/**
 *
 * @author 13178031758
 */
public class NotificacaoTextoFormatado implements Notificacao {
    
    @Override
    public String enviarMensagem(String textoMsg){
        return "MSG - Texto Formatado = " + textoMsg;
    }
}
