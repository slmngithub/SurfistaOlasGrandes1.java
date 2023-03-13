package Tornro;

import surf.Patrocinador;
import surf.SurfistaOlasGrandes;
import surf.SurfistaOlasPequenas;

public class Main {
    public static void main(String [] arg){
        Patrocinador p1=new Patrocinador("p1" , "10/15/2001" , true);
        Patrocinador p2=new Patrocinador("p2" , "10/15/2002" , false);
        Patrocinador p3=new Patrocinador("p3" , "10/15/2003" , true);
        Patrocinador p4=new Patrocinador("p4" , "10/15/2004" , false);
        Patrocinador p5=new Patrocinador("p5" , "10/15/2005" , false);
        SurfistaOlasPequenas s1 = new SurfistaOlasPequenas(4 , "oussama" , p1, 14 ,62);
        SurfistaOlasPequenas s2 = new SurfistaOlasPequenas(6 , "zakaria" , p2, 25 ,30);
        SurfistaOlasGrandes sg1 =new SurfistaOlasGrandes(10 , true , "messi" , p3 , 65 , 80);
        SurfistaOlasGrandes sg2 =new SurfistaOlasGrandes(16 , false , "mj" , p4 , 45 , 79);
        Torneo t= new Torneo();
        t.anadirSubfista(s1);
        t.anadirSubfista(s2);
        t.anadirSubfista(sg1);
        t.anadirSubfista(sg2);
        Patrocinador [] p = new Patrocinador[]{p1 , p3 , p5};
        t.setPatrocinadores(p);
        t.guandaEnFichero();
        System.out.println(t.surfistaConPatrocinador(p4));
        System.out.println(t.surfistaConPatrocinadorDelTorneo().toString());
        t.subirCategoria();

    }
}
