package ui;

import model.pedido;
import model.pedidoComida;
import model.pedidoEncomienda;
import model.pedidoExpress;



public class Main {
    public static void main(String[] args) {

        pedido pedido1 = new pedidoComida(
                "C001",
                "Calle Egipto 620",
                4
        );

        pedido pedido2 = new pedidoEncomienda(
                "E001",
                "Av. Las lagunas 783",
                6
        );

        pedido pedido3 = new pedidoExpress(
                "EX002",
                "Av. Los troncos 889",
                3
        );

        pedido1.mostrarResumen();
        System.out.println("Tiempo de entrega: " +
                pedido1.calcularTiempoDeEntrega() + " minutos\n");
        pedido2.mostrarResumen();
        System.out.println("Tiempo de entrega: " +
                pedido2.calcularTiempoDeEntrega() + " minutos\n");
        pedido3.mostrarResumen();
        System.out.println("Tiempo de entrega: " +
                pedido3.calcularTiempoDeEntrega() + " minutos\n");
    }
}