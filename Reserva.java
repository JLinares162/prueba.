public class Reserva {

    protected String fechaVuelo;
    protected boolean tipoVuelo;
    protected int cantidadBoletos;
    protected String aerolinea;
    protected String numeroTarjeta;
    protected int cuotas;
    protected String claseVuelo;
    protected int numeroAsiento;
    protected int cantidadMaletas;
    protected Usuario usuario;
    
    public Reserva(String fechaVuelo, boolean tipoDeVuelo, int cantidadBoletos, String aerolinea, String numeroTarjeta,
            int cuotas, String claseVuelo, int numeroAsiento, int cantidadMaletas, Usuario usuario) {
        this.fechaVuelo = fechaVuelo;
        this.tipoVuelo = tipoDeVuelo;
        this.cantidadBoletos = cantidadBoletos;
        this.aerolinea = aerolinea;
        this.numeroTarjeta = numeroTarjeta;
        this.cuotas = cuotas;
        this.claseVuelo = claseVuelo;
        this.numeroAsiento = numeroAsiento;
        this.cantidadMaletas = cantidadMaletas;
        this.usuario = usuario;
    }

    public Reserva(String fechaVuelo2, boolean tipoVuelo2, int cantidadBoletos2, String aerolinea2, int numeroTarjeta2,
            int cuotas2, int claseVuelo2, int cantidadMaletas2, Usuario usuario2) {
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public boolean isTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(boolean tipoDeVuelo) {
        this.tipoVuelo = tipoDeVuelo;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public String getClaseVuelo() {
        return claseVuelo;
    }

    public void setClaseVuelo(String claseVuelo) {
        this.claseVuelo = claseVuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Reserva [fechaVuelo=" + fechaVuelo + ", tipoVuelo=" + tipoVuelo + ", cantidadBoletos="
                + cantidadBoletos + ", aerolinea=" + aerolinea + ", numeroTarjeta=" + numeroTarjeta + ", cuotas="
                + cuotas + ", claseVuelo=" + claseVuelo + ", numeroAsiento=" + numeroAsiento + ", cantidadMaletas="
                + cantidadMaletas + ", usuario=" + usuario + "]";
    }

    public void definirNumeroDeTarjeta(String numeroTarjeta){
        setNumeroTarjeta(numeroTarjeta);
    }

    public void definirCantidadCuotas(int cuotas){
        setCuotas(cuotas);
    }

    public String imprimirItinerario(){
        return "Fecha de vuelo: " + fechaVuelo +
           "\nTipo de vuelo: " + (tipoVuelo ? "Ida y vuelta" : "Solo ida") +
           "\nCantidad de boletos: " + cantidadBoletos +
           "\nAerolínea: " + aerolinea +
           // Otros atributos según sea necesario
           "\nUsuario: " + (usuario != null ? usuario.getUsername() : "Desconocido");
    }
}
