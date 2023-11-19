import java.util.Random;

class Gratis extends Reserva implements iReserva {

    public Gratis(String fechaVuelo, boolean tipoDeVuelo, int cantidadBoletos, String aerolinea, String numeroTarjeta,
            int cuotas, String claseVuelo, int numeroAsiento, int cantidadMaletas, Usuario usuario) {
        super(fechaVuelo, tipoDeVuelo, cantidadBoletos, aerolinea, numeroTarjeta, cuotas, claseVuelo, numeroAsiento,
                cantidadMaletas, usuario);
    }

    /*Numero promedio de asientos en un avion comercial
        clase Coach 200
        clase Premium 20 a 80
    */ 

    @Override
    public void seleccionarNumeroDeAsiento(){
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 200
        int numeroAsiento = random.nextInt(200) + 80;
        System.out.println("Número de asiento seleccionado: " + numeroAsiento);
    }

    @Override
    public void cantidadDeMaletas() {
        int cantidadDeMaletas = 1;
        setCantidadMaletas(cantidadDeMaletas);
        System.out.println("El numero de maletas para usuarios No Premium es 1");
    }

    public void seleccionarClase(String nuevaClase) {
        // Establecer la nueva clase
        setClaseVuelo(nuevaClase);
        System.out.println("Clase de vuelo seleccionada: " + nuevaClase);
    }

    public Gratis(String fechaVuelo, boolean tipoVuelo, int cantidadBoletos, String aerolinea, String username, int numeroTarjeta, int cuotas, int claseVuelo, int cantidadMaletas, Usuario usuario) {
        super(fechaVuelo, tipoVuelo, cantidadBoletos, aerolinea, numeroTarjeta, cuotas, claseVuelo, cantidadMaletas, usuario);
    }

    public String getClaseVuelo() {
        return claseVuelo;
    }
}