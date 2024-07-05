public class Factura {
    private String numero;
    private String descripcion;
    private int cantidadComprada;
    private double precio;

    public Factura(String numero, String descripcion, double precio, int cantidadComprada) {
       this.numero = numero;
       this.descripcion = descripcion;
       this.precio = precio;
       this.cantidadComprada = cantidadComprada;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        if(cantidadComprada <0 ) this.cantidadComprada = 0;
        this.cantidadComprada = cantidadComprada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0) this.precio = 0.0;
        this.precio = precio;
    }

    public double getTotalFactura(){
        return getCantidadComprada() * getPrecio();
    }
}
