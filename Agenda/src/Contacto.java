import java.util.Objects;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        if (!esNombreValido(nombre)) {
            throw new IllegalArgumentException("El nombre no es válido o contiene números.");
        }
        if (!esTelefonoValido(telefono)) {
            throw new IllegalArgumentException("El teléfono debe tener exactamente 10 dígitos.");
        }
        this.nombre = nombre.trim();
        this.telefono = telefono;
    }

    public static boolean esNombreValido(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isDigit(nombre.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean esTelefonoValido(String telefono) {
        if (telefono == null || telefono.length() != 10) {
            return false;
        }
        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!esNombreValido(nombre)) {
            throw new IllegalArgumentException("El nombre no es válido o contiene números.");
        }
        this.nombre = nombre.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (!esTelefonoValido(telefono)) {
            throw new IllegalArgumentException("El teléfono debe tener exactamente 10 dígitos.");
        }
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto otro = (Contacto) o;
        if (nombre == null || otro.nombre == null) {
            return Objects.equals(nombre, otro.nombre);
        }
        return nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public int hashCode() {
        return nombre == null ? 0 : nombre.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }
}