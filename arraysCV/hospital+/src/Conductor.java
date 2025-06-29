public class Conductor {
    String nombre;
    String telefono;

    public Conductor() {
        this.nombre = "";
        this.telefono = "";
    }

    @Override
    public String toString() {
        return "[nombre: " + nombre + " | telefono: " + telefono + "]";
    }
}
