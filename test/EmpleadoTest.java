import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
     Empleado empleado1 = new Empleado("Josue", "Cano", 20000);
     Empleado empleado2 = new Empleado("Sebastian", "Sanchez", 22000);


    @Test
    void getSalarioAnual() {
        System.out.println("El sueldo anual del empleado 1 es: " + empleado1.getSalarioAnual());
        System.out.println("El sueldo anual del empleado 2 es: " + empleado2.getSalarioAnual());
        assertAll(
                () -> Assertions.assertEquals(empleado1.getSalarioMensual() * 12, empleado1.getSalarioAnual()),
                () -> Assertions.assertEquals(empleado2.getSalarioMensual() * 12, empleado2.getSalarioAnual())
        );
    }
    @Test
    void aumentarSalarioMensual() {
        empleado1.aumentarSalarioMensual(10);
        empleado2.aumentarSalarioMensual(10);
        System.out.println(" Despues del aumento el sueldo anual del empleado 1 es: " + empleado1.getSalarioAnual());
        System.out.println("Despues del aumento el sueldo anual del empleado 2 es: " + empleado2.getSalarioAnual());
        assertAll(
                () -> Assertions.assertEquals(empleado1.getSalarioMensual() * 12, empleado1.getSalarioAnual()),
                () -> Assertions.assertEquals(empleado2.getSalarioMensual() * 12, empleado2.getSalarioAnual())
        );
    }
    @Test
    void getNumEmpleados() {
        System.out.println("Actualmente " + Empleado.getNumEmpleados());
        assertTrue(Empleado.getNumEmpleados() > 0);
    }


}