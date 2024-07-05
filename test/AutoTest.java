import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    Direccion direccionPropietario = new Direccion("Calle siempre viva","un barrio","Springfield");
    Propietario propietario = new Propietario("Josue", "21 de noviembre", direccionPropietario);
    Marca marcaCarro = new Marca("Rolls-Royce", 5, 2024, "12vj");
    Auto auto = new Auto(marcaCarro, propietario, "un chasis", 200,80, true,5,true);

    @Test
    void acelerar() {
        int velocidadActual = auto.getVelocidadActual();
        auto.acelerar();
        assertEquals(auto.getVelocidadActual(), velocidadActual+ 1) ;
    }

    @Test
    void frenar() {
        auto.frenar();
        assertEquals(auto.getVelocidadActual(), 0) ;
    }



    @Test
    void getMarchaActual() {
        auto.cambiarMarcha(2);
        assertEquals(2,auto.getMarchaActual());
    }

    @Test
    void reducirMarcha() {
        auto.setVelocidadActual(200);
        int velocidadActual = auto.getVelocidadActual();
        auto.reducirMarcha();
        assertEquals(velocidadActual - 1,auto.getVelocidadActual());
    }

    @Test
    void marchaAtras() {
        assertEquals("No se puede echar marcha atras mientras estas en movimiento", auto.marchaAtras());
    }

    @Test
    void getAutonomia() {
        double consumoMedio = 20;
        double kilometrosRecorridos = 100;
        assertEquals( (consumoMedio / kilometrosRecorridos) * 100,auto.getAutonomia(consumoMedio,kilometrosRecorridos));
    }






}