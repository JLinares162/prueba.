interface iKayac {

    public Usuario login(String username, String password);
    public void registroUsuario(String username, String password, String tipo );
    public void cambiarPassword(String nuevaPassword);
    public void cambiarTipoUsuario();
    public void reservacion(String fechaVuelo, boolean tipoVuelo, int cantidadBoletos, String areolinea, String username);
    public void confirmación(String numeroTarjeta, int cuotas, String claseVuelo, int numeroAsiento, int cantidadMaletas);
    public String itinerario();
    public void guardarUsuario();
    public void guardarReserva();
    public void leerUsuario();
    public void leerReserva();
}