public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int releaseDate;
    private String idCode;

    public Marca(String nombre, int nrDeModelos, int releaseDate, String idCode) {
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.releaseDate = releaseDate;
        this.idCode = idCode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }
}
