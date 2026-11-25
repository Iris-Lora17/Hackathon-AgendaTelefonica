public class Agenda {
    /*ATRIBUTOS*/
    private String nombre;
    private String telefono;

    /*CONSTRUCTOR*/
    public Agenda (String nombre, String numero){
        this.nombre = nombre;
        this.telefono = numero;
    }

    /*GET Y SET*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /*TO STRING

    @Override
    public String toString() {}*/
}
