import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComunidadStream {
    private HashMap <String , List<Stremers>> hash;
    public ComunidadStream(){

    }
    public void anadirStrimer(String name , List<Stremers> s){
        hash.put(name,s);
    }
    public List<String> StrimerA(){
        List <String> str=new ArrayList<>();
        List <String>names= (List<String>) this.hash.keySet();
        for (int i=0 ; i<names.size();i++){
            List<Stremers> s = this.hash.get(names.get(i));
            for (int j=0 ; j<s.size() ; i++){
                if (s.get(i).getNombre().startsWith("A")){
                    str.add(names.get(i));
                }
            }

        }
        return str;
    }
    public List<Stremers> stremersJuegan( String namej){
        List <Stremers> str=new ArrayList<>();
        List <String>names= (List<String>) this.hash.keySet();
        for (int i=0 ; i<names.size();i++){
            List<Stremers> s = this.hash.get(names.get(i));
            for (int j=0 ; j<s.size() ; i++){
                String [] juegos=s.get(j).getJuegos();
                for (int k =0 ; k<juegos.length ; k++){
                    if (juegos[k].equals(namej)){
                        str.add(s.get(i));
                    }
                }
            }

        }
        return str;
    }
    public void dispay(){
        List <String>names= (List<String>) this.hash.keySet();
        for (int i=0 ; i<names.size();i++){
            System.out.println(names.get(i));
            List<Stremers> s = this.hash.get(names.get(i));
            for (int j=0 ; j<s.size() ; i++){
                s.get(j).toString();
            }

        }
    }



}
