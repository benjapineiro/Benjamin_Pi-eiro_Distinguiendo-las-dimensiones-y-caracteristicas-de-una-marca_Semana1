package model;

public class pedidoComida extends pedido{

    public pedidoComida(String idPedido, String direccionPedido, double distanciaKm){
        super(idPedido, direccionPedido, distanciaKm);
    }

    @Override
    public double calcularTiempoDeEntrega(){
        return 15 + (2 * getDistanciaKm());
    }


}
