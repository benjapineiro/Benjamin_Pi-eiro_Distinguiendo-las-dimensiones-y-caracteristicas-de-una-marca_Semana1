package model;

public class pedidoExpress extends pedido{

    public pedidoExpress(String idPedido, String direccionPedido, double distanciaKm){
        super(idPedido, direccionPedido, distanciaKm);
    }

    @Override
      public double calcularTiempoDeEntrega(){
        double tiempo = 10;

        if (getDistanciaKm() > 5){
            tiempo += 5;
        }
        return tiempo;

    }



}
