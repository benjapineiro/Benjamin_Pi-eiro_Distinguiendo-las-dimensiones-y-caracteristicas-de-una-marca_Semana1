package model;

public abstract class pedido {
    private String idPedido;
    private String direccionPedido;
    private double distanciaKm;

    public pedido(String idPedido, String direccionPedido, double distanciaKm){
        this.idPedido = idPedido;
        this.direccionPedido = direccionPedido;
        this.distanciaKm = distanciaKm;
    }

    public String getIdPedido(){
        return idPedido;
    }
    public void setIdPedido(String idPedido){
        this.idPedido = idPedido;
    }
    public String getDireccionPedido(){
        return direccionPedido;
    }
    public void setDireccionPedido(String direccionPedido){
        this.direccionPedido = direccionPedido;
    }
    public double getDistanciaKm(){
        return distanciaKm;
    }
    public void setDistanciaKm(double distanciaKm){
        this.distanciaKm = distanciaKm;
    }

    public void mostrarResumen(){
        System.out.println("--- INFORMACION DEL PEDIDO ---");
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Direccion: " + direccionPedido);
        System.out.println("Distancia: " + distanciaKm + " Km");
        System.out.println();
    }


    public abstract double calcularTiempoDeEntrega();

}

