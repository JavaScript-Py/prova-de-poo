/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.pedidoproject.controller.GerenciarPedidos;
import com.mycompany.pedidoproject.pedidos.PedidoCargaPerigosa;
import com.mycompany.pedidoproject.pedidos.AbstractPedido;
import com.mycompany.pedidoproject.pedidos.PedidoCargaSigilosa;
import com.mycompany.pedidoproject.pedidos.PedidoCargaSimples;
import com.mycompany.pedidoproject.notificacoes.NotificacaoHtml;
import com.mycompany.pedidoproject.notificacoes.NotificacaoTextoFormatado;

public class ProvaPratica {
    public static void main(String[] args) {
    GerenciarPedidos gerenciarPedidos = new GerenciarPedidos();
    AbstractPedido pedido1 = new PedidoCargaSimples(10, 100, "Pedido carga Simples",10.00);
    AbstractPedido pedido2 = new PedidoCargaSigilosa("Sigilo pela LGPD", 11, "Pedido Carga Sigilosa", 100.00, new NotificacaoTextoFormatado());
    AbstractPedido pedido3 = new PedidoCargaPerigosa("Material Inflamável", new NotificacaoHtml(), 12, "Pedido Carga Perigosa",1000.00);
    gerenciarPedidos.adicionarPedidos(pedido1);
    gerenciarPedidos.adicionarPedidos(pedido2);
    gerenciarPedidos.adicionarPedidos(pedido3);
    gerenciarPedidos.listarPedidos();
    gerenciarPedidos.enviarNotificacoes("Mensagem Enviada");
}
}
