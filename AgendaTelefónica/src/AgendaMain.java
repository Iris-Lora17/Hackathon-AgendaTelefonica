import java.util.Scanner;

public class AgendaMain {

    private static boolean bandera;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            bandera = true;
            System.out.println("==========Bienvenido a la Agenda Telefónica==========\n");
            System.out.println("Elige una opción del 1 al 7 para ejecutar una acción\n");
            System.out.println("MENU:");
            System.out.println("1. AñadirContacto\n" +
                    "2. Verificar sí existe contacto\n" +
                    "3. Listar Contactos\n" +
                    "4. Buscar Contactos\n" +
                    "5. Eliminar contacto\n" +
                    "6. Verficar sí la agenda está llena\n" +
                    "7. Verificar cuantos espacios hay libres"
            );
            System.out.println("Entrada: ");
            opcion = sc.nextInt();
            menu(opcion);
        }
        while (!bandera);

        sc.close();


    }
    public static void menu(int option){
        switch (option){
            case 1:
                System.out.println("añadirContacto()");
                break;
            case 2:
                System.out.println("VerificarContacto()");
                break;
            case 3:
                System.out.println("listarContacto()");
                break;
            case 4:
                System.out.println("buscarContacto()");
                break;
            case 5:
                System.out.println("eliminarContacto()");
                break;
            case 6:
                System.out.println("agendaLlena()");
                break;
            case 7:
                System.out.println("espaciosLibres()");
                break;
            default:
                System.out.println("Opción inválida, intenta de nuevo\n");
                bandera = false;
                break;
        }
    }
}
