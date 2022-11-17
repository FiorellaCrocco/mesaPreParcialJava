import java.util.Date;

public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Yate yate) {
        if (this.cantCamarotes > yate.cantCamarotes){
            return 1;
        } else if (this.cantCamarotes < yate.cantCamarotes) {
            return -1;
        } else {
            return 0;
        }

    }

//    if (promedioThis > promedioParam){
//        return 1;
//    } else if (promedioThis < promedioParam){
//        return -1;
//    } else {
//        return 0;
//    }
}
