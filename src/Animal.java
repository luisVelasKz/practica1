public class Animal {
    private String nombre;
    private Integer vecesAlimentacion;

    public Animal(){

    }

    public Animal(String nombre, Integer vecesAlimentacion){
        this.nombre = nombre;
        this.vecesAlimentacion = vecesAlimentacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVecesAlimentacion() {
        return vecesAlimentacion;
    }

    public void setVecesAlimentacion(Integer vecesAlimentacion) {
        this.vecesAlimentacion = vecesAlimentacion;
    }

    public static void main(String[] args) {
        Animal[] animales = {
                new Animal("Tigre",10),
                new Animal("Pez", 3)
        };

        int contador;

        for(Animal animal: animales){
            contador = 1;
            while (contador <= animal.vecesAlimentacion){
                System.out.println("Alimentar al " + animal.getNombre());
                contador++;
            }
        }
    }
}
