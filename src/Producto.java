public class Producto {
    enum Categoria{TELÉFONO, TABLET, PORTÁTIL, TELEVISOR, CÁMARA};

    private String nombre;
    private Categoria categoria;

    public  Producto(){

    }

    public Producto(String nombre, Categoria categoria){
        this.nombre = nombre;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoría" + categoria +
                '}';
    }
}
