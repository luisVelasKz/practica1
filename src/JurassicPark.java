public class JurassicPark {
    private String[] dinosaurioCarnivoro;
    private String[] dinosaurioHerbívoro;
    private String[] dinosaurioVolador;


    public JurassicPark() {
        this.dinosaurioCarnivoro = new String[] {"T-Rex","Velocirraptor"};
        this.dinosaurioHerbívoro = new String[] {"Pteranodon","Triceraptor"};
        this.dinosaurioVolador   = new String[] {"Architoryx","Quetzalcoatl"};
    }

    public void listarDinosaurios(String recinto){
        String[] dinosaurios = new String[0];

        if(recinto.equals("Carnívoro")){
            dinosaurios = dinosaurioCarnivoro;
        } else if (recinto.equals("Herbívoro")) {
            dinosaurios = dinosaurioHerbívoro;
        } else if (recinto.equals("Voladores")) {
            dinosaurios = dinosaurioVolador;
        }else {
            dinosaurios = null;
        }

        System.out.println("Dinosaurios");
        if(dinosaurios != null){
            for(String dinosaurio: dinosaurios) {
                System.out.println(dinosaurio);
            }
        }
        else {
            System.out.println("El recinto no está habilitado");
        }

    }

}
