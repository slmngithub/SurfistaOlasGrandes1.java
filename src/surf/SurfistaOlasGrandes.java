package surf;

public class SurfistaOlasGrandes extends Surfista {
    private int Tamano;
    private boolean motor;
    public SurfistaOlasGrandes(int Tamano , boolean motor ,  String nombre,  Patrocinador patrocinador,  int posicionRanking ,  int energia ){
        this.motor=motor;
        this.Tamano=Tamano;
        setEnergia(energia);
        setNombre(nombre);
        setPatrocinador(patrocinador);
        setPosicionRanking(posicionRanking);

    }

    @Override
    public void surfear() {
        setEnergia(getEnergia()-15);
    }
    public String display(){
        return  getNombre() + " , " + getEnergia() + " , " + getTamano() + " , " + getPatrocinador() + " , " + getPosicionRanking()+ " , " + isMotor();
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int tamano) {
        Tamano = tamano;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
