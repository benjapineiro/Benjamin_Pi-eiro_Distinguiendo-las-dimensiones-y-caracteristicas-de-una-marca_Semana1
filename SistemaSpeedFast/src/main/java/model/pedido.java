package model;

public class pedido {
    private String idPedido;
    private String direccionPedido;
    private String tipoPedido;


    public pedido(String idPedido, String direccionPedido, String tipoPedido){
        this.idPedido = idPedido;
        this.direccionPedido = direccionPedido;
        this.tipoPedido = tipoPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(String idPedido){
        this.idPedido = idPedido;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }
    public String getTipoPedido(){
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

  public void asignarRepartidor(){
      System.out.println("Asignando repartidor... ");
  }

 public void asignarRepartidor(String nombreRepartidor){
     System.out.println("Asignando repartidor... ");
     System.out.println("Pedido asignado a: " + nombreRepartidor);

 }


}

