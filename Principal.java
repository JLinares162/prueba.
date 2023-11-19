import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kayac kayac = new Kayac(); // Asumiendo que ya has creado esta clase
        kayac.leerUsuario();
        kayac.leerReserva();

        int opcion;
        do {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Modo Registro");
            System.out.println("2. Ingresar/Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    System.out.println("---- Modo Registro ----");
                    System.out.print("Ingrese un nombre de usuario: ");
                    String username = scanner.nextLine();
                    System.out.print("Ingrese una contraseña: ");
                    String password = scanner.nextLine();
                    System.out.print("Seleccione un plan (1. Gratis / 2. Premium): ");
                    int plan = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    String tipo = (plan == 1) ? "gratis" : "premium";
                    kayac.registroUsuario(username, password, tipo);
                    break;
                case 2:
                    System.out.println("---- Modo Ingresar/Salir ----");
                    System.out.println("1. Ingresar");
                    System.out.println("2. Salir");
                    System.out.print("Selecciona una opción: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion) {
                        case 1:
                            boolean menuOp = true;
                            System.out.println("---- Modo Ingresar ----");
                            System.out.print("Ingrese su nombre de usuario: ");
                            String nombre= scanner.nextLine();
                            System.out.print("Ingrese su contraseña: ");
                            String contraseña = scanner.nextLine();
                            Usuario usuario = kayac.login(username = nombre, password = contraseña);
                            
                            if (usuario != null) {
                                System.out.println("¡Bienvenido, " + usuario.getUsername() + "!");
                                kayac.UsernameActual(username); //LINA DE CAMBIO
                                do{
                                    System.out.println("---- Menú Principal ----");
                                    System.out.println("1. Modo Reservas");
                                    System.out.println("2. Modo Confirmación");
                                    System.out.println("3. Modo Perfil");
                                    System.out.println("4. Salir");
                                    System.out.print("Selecciona una opción: ");
                                    
                                    opcion = scanner.nextInt();
                                    scanner.nextLine(); // Consumir el salto de línea

                                    switch (opcion) {
                                        case 1:
                                            System.out.println("---- Modo Reservas ----");
                                            System.out.print("Ingrese la fecha del vuelo (formato dd/mm/yyyy): ");
                                            String fechaVuelo = scanner.nextLine();

                                            System.out.print("Seleccione un plan (1. Solo Ida / 2. Ida y Vuelta): ");
                                            int tivoDeVuelo = scanner.nextInt();
                                            scanner.nextLine(); // Consumir el salto de línea
                                            boolean tipoVuelo = (tivoDeVuelo == 1) ? true : false;

                                            System.out.print("Ingrese la cantidad de boletos: ");
                                            int cantidadBoletos = scanner.nextInt();
                                            scanner.nextLine(); // Consumir el salto de línea
                                            System.out.print("Ingrese la aerolínea: ");
                                            String aerolinea = scanner.nextLine();
                                            username = nombre;
                                            kayac.reservacion(fechaVuelo, tipoVuelo, cantidadBoletos, aerolinea, username);
                                            break;
                                        case 2:
                                            System.out.println("---- Modo Confirmación ----");
                                            System.out.print("Ingrese el número de tarjeta: ");
                                            String numeroTarjeta = scanner.nextLine();
                                            System.out.print("Ingrese la cantidad de cuotas: ");
                                            int cuotas = scanner.nextInt();
                                            scanner.nextLine(); // Consumir la nueva línea pendiente
                                            
                                            Usuario usuarioActual = usuario;
                                            if (usuarioActual.getTipo().equals("premium")) {
                                                System.out.print("Ingrese el número de asiento: ");
                                                int numeroAsiento = scanner.nextInt();
                                                scanner.nextLine();
                                                System.out.print("Ingrese la cantidad de maletas: ");
                                                int cantidadMaletas = scanner.nextInt();
                                                scanner.nextLine(); // Consumir la nueva línea pendiente
                                                kayac.confirmación(numeroTarjeta, cuotas, "Primera Clase", numeroAsiento, cantidadMaletas);
                                            } else {
                                                // Usuario gratis, menos información requerida
                                                System.out.println("Cantidad de maletas para clientes Gratis: 1");
                                                System.out.print("Ingrese la clase de vuelo (Coach o Primera Clase): ");
                                                String claseVuelo = scanner.nextLine();
                                                System.out.print("Ingrese el número de asiento: ");
                                                int numeroAsiento = scanner.nextInt();
                                                kayac.confirmación(numeroTarjeta, cuotas, claseVuelo, numeroAsiento, 1);
                                            }
                                            break;
                                        case 3:
                                            boolean op = true;
                                            do {
                                                System.out.println("---- Modo Perfil ----");
                                                System.out.println("1. Modificar el tipo de cliente");
                                                System.out.println("2. Aplicar cupón de 10% de descuento");
                                                System.out.println("3. Cambiar contaseña");
                                                System.out.println("4. Volver");
                                                System.out.print("Selecciona una opción: ");
                                        
                                                opcion = scanner.nextInt();
                                                scanner.nextLine(); // Consumir el salto de línea
                                            
                                                switch (opcion) {
                                                    case 1:
                                                        kayac.cambiarTipoUsuario();
                                                        break;
                                                    case 2:
                                                        System.out.println("Cupón del 10% aplicado con exito.");
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingresa la nueva password:");
                                                        String nuevaPassword = scanner.nextLine();
                                                        kayac.cambiarPassword(nuevaPassword);
                                                        System.out.println();
                                                        break;
                                                    case 4:
                                                        System.out.println("Volviendo al Menun principal.");
                                                        op = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                                                        break;
                                                }
                                            } while (op);
                                            break;
                                        case 4:
                                            menuOp = false;
                                            break;
                                        default:
                                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                                            break;
                                    }
                                } while (menuOp);
                            } else {
                                System.out.println("Credenciales incorrectas. Volviendo al menú principal");
                            }
                            break;
                        case 2:
                                opcion = 3;
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    opcion = 0;
                    break;
            }
        } while (opcion < 3);
        System.out.println("Saliendo del programa... ¡Hasta luego!");
    }
}