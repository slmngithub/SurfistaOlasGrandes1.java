package surf;

public class SurfistaOlasPequenas extends Surfista {
    private int Tamanotabla;

    public SurfistaOlasPequenas(int Tamanotabla  ,  String nombre,  Patrocinador patrocinador,  int posicionRanking ,  int energia ){
        this.Tamanotabla=Tamanotabla;
        setEnergia(energia);
        setNombre(nombre);
        setPatrocinador(patrocinador);
        setPosicionRanking(posicionRanking);
    }
    public String display(){
        return  getNombre() + " , " + getEnergia() + " , " + getTamanotabla() + " , " + getPatrocinador() + " , " + getPosicionRanking()+ " , " ;
    }

    public int getTamanotabla() {
        return Tamanotabla;
    }

    public void setTamanotabla(int tamanotabla) {
        Tamanotabla = tamanotabla;
    }
}
