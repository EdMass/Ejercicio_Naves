package Naves_espaciales;

public class Naves {

    public Naves() {
    }

    private String combustible;
    private String nombre;
    private int peso;
    private String nacionalidad;
    private boolean recuperable;
    private String destino;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isRecuperable() {
        return recuperable;
    }

    public String tieneAlas(boolean tiene){
       boolean alas;
       alas = isRecuperable();
       if (alas){
           if (tiene){
               return "Tiene alas";
           }else{
               return "No tiene alas";
           }
       }else { return "Debe ser recuperable para definir si tiene alas";}
    }

    public void setRecuperable(boolean recuperable) {
        this.recuperable = recuperable;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean despegar(boolean rta) {
        return rta;
    }

    public boolean aterrizar(boolean rta) {
        return rta;
    }

    public boolean maniobrar(boolean rta) {
        return rta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String tipoCombustible(String combustible) {
        this.combustible = combustible;
        return combustible;
    }
}
