import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contacto> contactos;
    private int limite;

    public Agenda(int limite) {
        this.limite = limite;
        this.contactos = new HashSet<>();
    }

    public boolean anadirContacto(Contacto c) {
        if (c == null) {
            System.out.println("El contacto no es válido.");
            return false;
        }
        if (agendaLlena()) {
            System.out.println("La agenda ya está llena, no se puede agregar.");
            return false;
        }
        if (existeContacto(c)) {
            System.out.println("Ya existe un contacto con ese nombre.");
            return false;
        }

        contactos.add(c);
        System.out.println("Contacto agregado.");
        return true;
    }

    public boolean existeContacto(Contacto c) {
        if (c == null) {
            return false;
        }
        return contactos.contains(c);
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos guardados.");
            return;
        }
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    public String buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre() != null && c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono de " + c.getNombre() + ": " + c.getTelefono());
                return c.getTelefono();
            }
        }
        System.out.println("Contacto no encontrado.");
        return null;
    }

    public boolean eliminarContacto(Contacto c) {
        if (c == null) {
            return false;
        }
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado.");
            return true;
        } else {
            System.out.println("No se encontró el contacto para eliminar.");
            return false;
        }
    }

    public boolean agendaLlena() {
        return contactos.size() >= limite;
    }

    public int espacioLibres() {
        return limite - contactos.size();
    }
}