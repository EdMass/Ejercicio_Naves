package Naves_espaciales;

public class NavesPropulsoras extends Naves {

    private String empuje;
    private int propulsores;
    private int carga;

    public NavesPropulsoras(){
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(int propulsores) {
        this.propulsores = propulsores;
    }

    public String getEmpuje() {
        return empuje;
    }

    public void setEmpuje(String empuje) {
        this.empuje = empuje;
    }
}
