package Naves_espaciales;

public class Tripuladas {

    private String personas;
    private String numeroHabitats;

    public Tripuladas() {
    }

    public String getNumeroHabitats() {
        return "El numero de habitats que posee es: "+numeroHabitats;
    }

    public void setNumeroHabitats(String numeroHabitats) {
        this.numeroHabitats = numeroHabitats;
    }

    public String numeroPersonas(String personas){
        this.personas = personas;
        return "La cantidad de personas que puede trasportar es: "+personas;
    }

}
