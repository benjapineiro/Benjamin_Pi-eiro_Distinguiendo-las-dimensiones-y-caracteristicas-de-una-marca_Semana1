package model;

public class pedidoEncomienda extends pedido{

    public pedidoEncomienda(String idPedido, String direccionPedido, double distanciaKm){
        super(idPedido, direccionPedido, distanciaKm);
    }

    @Override
    public double calcularTiempoDeEntrega(){
        double tiempo = 20 + (1.5 * getDistanciaKm());
     return Math.round(tiempo);
    }


}