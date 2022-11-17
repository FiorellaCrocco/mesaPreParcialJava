import java.util.Date;

public abstract class Embarcacion {
    protected double precioBase;
    protected double valorAdicional;
    protected int anioFabricacion;
    protected double eslora;
    protected Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = new Capitan();
    }
    public double calcularMontoAlquiler(){
        double monto = precioBase;

        if (anioFabricacion > 2020) {
             monto += valorAdicional;
        }
        return monto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
}
