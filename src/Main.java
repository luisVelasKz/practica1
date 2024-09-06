
public class Main {
    public static void main(String[] args) {
        /*
        Empleado[] empleados = {
                new Empleado("Luis", Empleado.Rol.ADMINISTRADOR),
                new Empleado("Gaby", Empleado.Rol.BIÓLOGO),
                new Empleado("Teresa", Empleado.Rol.CUIDADOR),
                new Empleado("Jaime", Empleado.Rol.GUARDIA)
        };

        for(Empleado empleado: empleados){
            empleado.mostrarInfoEmpleado();
        }

         */

        /*
        Producto[] productos = {
                new Producto("Iphone 15", Producto.Categoria.TELÉFONO),
                new Producto("Laptop Huawei", Producto.Categoria.PORTÁTIL)
        };

        for(Producto producto: productos){
            System.out.println(producto.toString());
        }

         */

        JurassicPark jurassicPark = new JurassicPark();
        jurassicPark.listarDinosaurios("Carnívoro");
    }
}
