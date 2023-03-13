package surf;

public abstract class Surfista {
    private String nombre;
    private Patrocinador patrocinador;
    private int posicionRanking ;
    private int energia;

    public void surfear(){
        setEnergia(getEnergia()-5);
    }
    public void descansar(){
        setEnergia(getEnergia()+10);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getPosicionRanking() {
        return posicionRanking;
    }

    public void setPosicionRanking(int posicionRanking) {
        this.posicionRanking = posicionRanking;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
