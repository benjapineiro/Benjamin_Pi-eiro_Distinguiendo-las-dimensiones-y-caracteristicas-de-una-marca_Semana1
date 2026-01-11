package model;

public class pedidoComida extends pedido{
    private boolean mochilaTermica;

    public pedidoComida(String idPedido, String direccionPedido, String tipoPedido, boolean mochilaTermica){
        super(idPedido, direccionPedido, tipoPedido);
        this.mochilaTermica = mochilaTermica;
    }

    public boolean getMochilaTermica(){
        return mochilaTermica;
    }
    public void setMochilaTermica(boolean mochilaTermica){
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido Comida] ");
        System.out.println("Asignando repartidor... ");
        if (mochilaTermica){
            System.out.println("Repartidor asignado con mochila térmica.");
        }
        else{
            System.out.println("ERROR: No se puede asignar repartidor sin mochila térmica.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("\n[Pedido de Comida] ");
        System.out.println("Asignando repartidor... ");
        System.out.println("Pedido asignado a: " + nombreRepartidor);
        if (mochilaTermica){
            System.out.println("Repartidor asignado con mochila térmica.");
        }
        else{
            System.out.println("ERROR: No se puede asignar repartidor sin mochila térmica.");
        }

    }



}
