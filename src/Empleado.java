public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
   static private int empleados = 0;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        this.empleados ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    static public int getNumEmpleados() {
        return empleados;
    }

    public double getSalarioAnual(){
        return getSalarioMensual() * 12;
    }

    public void aumentarSalarioMensual(double percentage){
        double aumento = percentage / 100 + 1;
        this.setSalarioMensual(this.getSalarioMensual() * aumento );
    }
}
