public class Stremers {
    private String nombre;
    private int edad;
    private String fechaDenac;
    private int NumDeSus;
    private String [] juegos;
    public Stremers(String nombre , String fechaDenac , int numDeSus , String [] juegos){
        this.nombre=nombre;
        this.fechaDenac=fechaDenac;
        this.juegos=juegos;
        this.NumDeSus=numDeSus;
        this.edad=Integer.parseInt(fechaDenac.substring(6 , 9));
    }
    public void anadirjuego(String juego){
        for (int i=0 ; i<juegos.length ; i++){
            if (juegos[i]==null){
                juegos[i]=juego;
                break;
            }
        }
    }
    public String ToString(){
        return "[" + getNombre() + ", " + getFechaDenac() + ", " + getEdad() + ", " +getNumDeSus() + ", " +getJuegos().toString()+"]";
    }


    public String[] getJuegos() {
        return juegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaDenac() {
        return fechaDenac;
    }

    public void setFechaDenac(String fechaDenac) {
        this.fechaDenac = fechaDenac;
    }

    public int getNumDeSus() {
        return NumDeSus;
    }

    public void setNumDeSus(int numDeSus) {
        NumDeSus = numDeSus;
    }
}
