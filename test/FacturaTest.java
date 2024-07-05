import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {
    Factura pruebaFactura = new Factura("1b", "una descripcion chida", 20, 10);

    @Test
    void getNumero() {
        String numero = "23zb";
        pruebaFactura.setNumero(numero);
        assertEquals(numero, pruebaFactura.getNumero());
    }

    @Test
    void getDescripcion() {
        String descripcion = "Descripcion de prueba";
        pruebaFactura.setDescripcion(descripcion);
        assertEquals(descripcion, pruebaFactura.getDescripcion());
    }

    @Test
    void getCantidadComprada() {
        int cantidad = 15;
        pruebaFactura.setCantidadComprada(cantidad);
        assertEquals(cantidad, pruebaFactura.getCantidadComprada());
    }

    @Test
    void getPrecio() {
        double precio = 15.5;
        pruebaFactura.setPrecio(precio);
        assertEquals(precio, pruebaFactura.getPrecio());
        System.out.println("holi");
    }

    @Test
    void getTotalFactura() {
        double precio = 12.5;
        int cantidad =  10;
        pruebaFactura.setCantidadComprada(cantidad);
        pruebaFactura.setPrecio(precio);
        assertEquals(precio * cantidad, pruebaFactura.getTotalFactura());
    }
}