public class Auto {
    private Marca marca;
    private Propietario propietario;
    private String chasis;
    private int velocidadMaxima;
    private int velocidadActual;
    private boolean tieneTechoSolar;
    private int numMarchas;
    private boolean tieneTransmisionAutomatica;
    private int marchaActual;
    private int litrosCombustible;

    public Auto(Marca marca, Propietario propietario, String chasis, int velocidadMaxima, int velocidadActual, boolean tieneTechoSolar, int numMarchas, boolean tieneTransmisionAutomatica) {
        this.marca = marca;
        this.propietario = propietario;
        this.chasis = chasis;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numMarchas = numMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public void acelerar (){
        if (this.velocidadActual == velocidadMaxima) {
            return;
        }
        this.velocidadActual ++;
    }

    public void frenar(){
        this.velocidadActual = 0;
    }

    public void cambiarMarcha(int marcha){
        this.marchaActual = marcha;
    }

    public int getMarchaActual(){
        return marchaActual;
    }

    public void reducirMarcha(){
        this.velocidadActual--;
    }

    public String marchaAtras(){
        if(velocidadActual >0){
            return "No se puede echar marcha atras mientras estas en movimiento";
        }
       return"Vas en reversa";
    }

    //
    public double getAutonomia(double consumoMedio, double kilometrosRecorridos){
        return((consumoMedio / kilometrosRecorridos) * 100);
    }

    public void setVolumenCombustible(int litros){
        this.litrosCombustible = litros;
    }

    public int getVolumenCombustible(){
        return litrosCombustible;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }
}
