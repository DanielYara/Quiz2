/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaarchivos;
import java.util.*;
import quiz2.*;

/**
 *
 * @author Estudiante
 */
public class cargaArchivo {
    public static String leerArchivo(){
        String archivo = "Datos.csv";
        return archivo;
    }
    
    public static void verObras(String Artist, ArrayList<Artist> datos){
        ArrayList<Obra> o = null;
        for(Artist art : datos){
            if(art.getName().equals(Artist)){
                o = art.getObras();
            }
        }
    }
    
}
