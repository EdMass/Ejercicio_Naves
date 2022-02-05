package Naves_espaciales;

public class NoTripuladas extends Naves{

    private boolean orbital;
    private boolean exploracion;

    public NoTripuladas() {
    }

    public boolean isOrbital() {
        return orbital;
    }

    public void setOrbital(boolean orbital) {
        this.orbital = orbital;
    }

    public boolean isExploracion() {
        return exploracion;
    }

    public void setExploracion(boolean exploracion) {
        this.exploracion = exploracion;
    }
}
