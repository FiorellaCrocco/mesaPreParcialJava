import java.util.Date;

public class Velero extends Embarcacion {
    private int cantMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantMastiles = cantMastiles;
    }

    public boolean evaluarEsGrande() {
        if (this.cantMastiles >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}