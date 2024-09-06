public class Empleado {
    public enum Rol{GUARDIA, BIÓLOGO, CUIDADOR, ADMINISTRADOR}
    private String nombre;
    private Rol rol;

    public Empleado(){

    }

    public Empleado(String nombre, Rol rol){
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void mostrarInfoEmpleado(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rol=" + rol +
                '}';
    }
}
