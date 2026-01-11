package model;

public class pedidoEncomienda extends pedido{
    private boolean pesoEmbalajeValido;

    public pedidoEncomienda (String idPedido, String direccionPedido, String tipoPedido, boolean pesoEmbalajeValido){
        super(idPedido, direccionPedido, tipoPedido);
        this.pesoEmbalajeValido = pesoEmbalajeValido;
    }

    public boolean getPesoEmbalajeValido(){
        return pesoEmbalajeValido;
    }
    public void setPesoEmbalajeValido(boolean pesoEmbalajeValido){
        this.pesoEmbalajeValido = pesoEmbalajeValido;
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("\n[Pedido Encomienda] ");
        System.out.println("Asignando repartidor... ");
        if (pesoEmbalajeValido){
            System.out.println("El peso y embalaje del pedido son validos.");
        }
        else{
            System.out.println("ERROR: No se puede asignar repartidor.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("\n[Pedido Encomienda] ");
        System.out.println("Asignando repartidor... ");
        System.out.println("Pedido asignado a: " + nombreRepartidor);
        if (pesoEmbalajeValido){
            System.out.println("El peso y embalaje del pedido son validos.");
        }
        else{
            System.out.println("ERROR: No se puede asignar repartidor.");
        }
    }



}
