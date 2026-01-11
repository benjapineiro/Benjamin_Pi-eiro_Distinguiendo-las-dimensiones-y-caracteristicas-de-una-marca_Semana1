package model;

public class pedidoExpress extends pedido{
    private boolean esPrioritario;

    public pedidoExpress (String idPedido, String direccionPedido, String tipoPedido, boolean esPrioritario){
        super(idPedido, direccionPedido, tipoPedido);
        this.esPrioritario = esPrioritario;
    }

    public boolean getEsPrioritario(){
        return esPrioritario;
    }
    public void setEsPrioritario(boolean esPrioritario){
        this.esPrioritario = esPrioritario;
    }


    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido Express] ");
        System.out.println("Asignando repartidor... ");
        if (esPrioritario){
            System.out.println("Se ha asignado un repartidor a su pedido.");
            System.out.println("Tiempo Maximo de entrega: 30 minutos.");
        }
        else{
            System.out.println("ERROR: No se puede encontrar un repartidor.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("\n[Pedido Express] ");
        System.out.println("Asignando repartidor... ");
        System.out.println("Pedido asignado a: " + nombreRepartidor);
        if (esPrioritario){
            System.out.println("Tiempo Maximo de entrega: 30 minutos.");
        }
        else{
            System.out.println("ERROR: No se puede encontrar un repartidor.");
        }
    }





}
