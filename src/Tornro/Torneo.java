package Tornro;

import surf.Patrocinador;
import surf.Surfista;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Torneo {
    private List <Surfista> surfistas ;
    private Patrocinador [] Patrocinadores;
    private String nombre;
    public Torneo(){
        this.surfistas=new ArrayList<>();
    }
    public void anadirSubfista(Surfista s){
        if (s.getPosicionRanking()>20){
            surfistas.add(s);
        }
        else {
            try {
                throw new noEstaEnPrimeros("no esta en los 20 premeros.");
            } catch (noEstaEnPrimeros e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void guandaEnFichero(){
        DataOutputStream file = null;
        try {
            file=new DataOutputStream(new FileOutputStream("src/ficheros" , true));
            Iterator <Surfista> it = surfistas.iterator();
            Surfista su;
            while (it.hasNext()){
                su=it.next();
                file.writeBytes(su.getNombre() + " , ");
            }

        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        finally {
            try {
                file.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
    public List surfistaConPatrocinador(Patrocinador p){
        List <Surfista> s = new ArrayList<>();
        Iterator <Surfista> it = surfistas.iterator();
        Surfista su;
        while (it.hasNext()){
            su=it.next();
            if (p.equals(su.getPatrocinador())){
                s.add(su);
            }
        }
        return s;
    }
    public List surfistaConPatrocinadorDelTorneo(){
        List <Surfista> s = new ArrayList<>();
        Iterator <Surfista> it = surfistas.iterator();
        Surfista su;
        while (it.hasNext()){
            su=it.next();
            for (int i=0 ; i<Patrocinadores.length; i++){
                if (su.getPatrocinador().equals(Patrocinadores[i])){
                    s.add(su);
                }
            }
        }
        return s;
    }
    public void subirCategoria(){
        Iterator <Surfista> it = surfistas.iterator();
        Surfista su;
        while (it.hasNext()){
            su=it.next();
            if (su.getPosicionRanking()<15){
                surfistas.remove(su);
            }
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Patrocinador[] getPatrocinadores() {
        return Patrocinadores;
    }

    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        Patrocinadores = patrocinadores;
    }

    public List<Surfista> getSurfistas() {
        return surfistas;
    }

    public void setSurfistas(List<Surfista> surfistas) {
        this.surfistas = surfistas;
    }
}
