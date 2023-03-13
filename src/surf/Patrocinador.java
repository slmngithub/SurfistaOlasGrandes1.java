package surf;

public class Patrocinador {
    private String nombre;
    private String fechaCreacion;
    private boolean multinacional;
    public Patrocinador(String nombre , String fechaCreacion , boolean multinacional){
        this.nombre=nombre;
        this.fechaCreacion=fechaCreacion;
        this.multinacional=multinacional;
    }

    public boolean Equals(Patrocinador p){
        if (this.nombre.equals(p.getNombre()) && this.fechaCreacion.equals(p.getFechaCreacion()) && this.multinacional==p.getMultinacional()){
            return true;
        }
        return false;
    }
    public String display(){
        String state;
        if (this.multinacional==true){
            state="si";
        }
        else {state="no";}
        return "[" + getNombre() + " " + getFechaCreacion() + " " + state + "]";

    }


    public boolean getMultinacional() {
        return multinacional;
    }

    public void setMultinacional(boolean multinacional) {
        this.multinacional = multinacional;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
