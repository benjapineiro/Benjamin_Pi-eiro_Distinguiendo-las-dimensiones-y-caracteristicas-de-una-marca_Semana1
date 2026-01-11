package ui;

import model.pedido;
import model.pedidoComida;
import model.pedidoEncomienda;
import model.pedidoExpress;


public class Main {
    public static void main(String[] args) {

        pedido pedido1 = new pedidoComida(
            "COO1",
            "Calle Egipto 620",
                "Pedido de Comida",
                true
        );

        pedido pedido2 = new pedidoEncomienda(
                "E001",
                "Av. Las lagunas 783",
                "Encomienda",
                true
        );

        pedido pedido3 = new pedidoExpress(
          "EX001",
          "Av. Los troncos 889",
          "Pedido Express",
          true
        );

        pedido1.asignarRepartidor("Juan");
        pedido2.asignarRepartidor("Carlos");
        pedido3.asignarRepartidor("María");






    }
}