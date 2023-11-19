import java.util.Scanner;

public class Premium extends Reserva implements iReserva{

    public Premium(String fechaVuelo, boolean tipoDeVuelo, int cantidadBoletos, String aerolinea, String numeroTarjeta,
            int cuotas, String claseVuelo, int numeroAsiento, int cantidadMaletas, Usuario usuario) {
        super(fechaVuelo, tipoDeVuelo, cantidadBoletos, aerolinea, numeroTarjeta, cuotas, claseVuelo, numeroAsiento,
                cantidadMaletas, usuario);
    }

    @Override
    public void seleccionarNumeroDeAsiento() {
        Scanner scanner = new Scanner(System.in);
        int numeroAsiento;

        do {
            System.out.print("Ingrese el número de asiento de clase Premium (1 al 80): ");
            numeroAsiento = scanner.nextInt();

            if (numeroAsiento < 1 || numeroAsiento > 80) {
                System.out.println("Número de asiento no válido. Por favor, ingrese un número entre 1 y 80.");
            }
        } while (numeroAsiento < 1 || numeroAsiento > 80);
        System.out.println("Número de asiento seleccionado: " + numeroAsiento);
    }

    @Override
    public void cantidadDeMaletas() {
        Scanner scanner = new Scanner(System.in);
        int cantidadMaletas;

        System.out.print("Ingrese la cantidad de maletas: ");
        cantidadMaletas = scanner.nextInt();
        System.out.println("Cantidad de maletas ingresada: " + cantidadMaletas);
    }

    @Override
    public void seleccionarClase(String claseVuelo) {
        setClaseVuelo(claseVuelo);
        System.out.println("Clase de vuelo seleccionada: " + claseVuelo);
    }

    public Premium(String fechaVuelo, boolean tipoVuelo, int cantidadBoletos, String aerolinea, String username, int numeroTarjeta, int cuotas, int claseVuelo, int cantidadMaletas, Usuario usuario) {
        super(fechaVuelo, tipoVuelo, cantidadBoletos, aerolinea, numeroTarjeta, cuotas, claseVuelo, cantidadMaletas, usuario);
    }
    
    public String getClaseVuelo() {
        claseVuelo = "Primera Clase" ;
        return claseVuelo;
    }
}
