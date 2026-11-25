import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamano = 0;
        while (tamano <= 0) {
            System.out.print("¿De qué tamaño quieres la agenda?: ");
            if (teclado.hasNextInt()) {
                tamano = teclado.nextInt();
                teclado.nextLine();
                if (tamano <= 0) {
                    System.out.println("Escribe un número mayor a 0.");
                }
            } else {
                System.out.println("Ingresa un número válido.");
                teclado.nextLine();
            }
        }

        Agenda agenda = new Agenda(tamano);
        int opcion = 0;

        do {
            System.out.println("\n--- MENU AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Comprobar si existe un contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Ver si la agenda está llena");
            System.out.println("7. Ver espacios libres");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            if (!teclado.hasNextInt()) {
                System.out.println("Por favor ingresa un número.");
                teclado.nextLine();
                continue;
            }

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    String nombre = "";
                    while (!Contacto.esNombreValido(nombre)) {
                        System.out.print("Nombre (sin números): ");
                        nombre = teclado.nextLine();
                        if (!Contacto.esNombreValido(nombre)) {
                            System.out.println("Nombre no válido. No debe estar vacío ni tener números.");
                        }
                    }

                    String telefono = "";
                    while (!Contacto.esTelefonoValido(telefono)) {
                        System.out.print("Teléfono (10 dígitos, solo números): ");
                        telefono = teclado.nextLine();
                        if (!Contacto.esTelefonoValido(telefono)) {
                            System.out.println("Teléfono no válido. Debe tener 10 dígitos y sin letras.");
                        }
                    }

                    agenda.anadirContacto(new Contacto(nombre, telefono));
                    break;

                case 2:
                    System.out.print("Nombre a revisar: ");
                    String nombreExiste = teclado.nextLine();
                    if (agenda.existeContacto(new Contacto(nombreExiste, "0000000000"))) {
                        System.out.println("Sí existe el contacto.");
                    } else {
                        System.out.println("No existe el contacto.");
                    }
                    break;

                case 3:
                    agenda.listarContactos();
                    break;

                case 4:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscar = teclado.nextLine();
                    agenda.buscaContacto(nombreBuscar);
                    break;

                case 5:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = teclado.nextLine();
                    agenda.eliminarContacto(new Contacto(nombreEliminar, "0000000000"));
                    break;

                case 6:
                    if (agenda.agendaLlena()) {
                        System.out.println("La agenda está llena.");
                    } else {
                        System.out.println("Todavía hay espacio.");
                    }
                    break;

                case 7:
                    System.out.println("Espacios libres: " + agenda.espacioLibres());
                    break;

                case 8:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);

        teclado.close();
    }
}