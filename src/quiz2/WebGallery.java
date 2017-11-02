/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.*;
import lecturaarchivos.cargaArchivo;
import gestionarchivo.cargaDatos;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    public static ArrayList<Artist> consDatos;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String archivo = cargaArchivo.leerArchivo();
        consDatos = cargaDatos.leerDatos(archivo);
        String name = null;
        System.out.println("Ingrese el nombre del artista a consultar");
        name = sc.next();
        cargaArchivo.verObras(name, ConsDatos);
    }
    
}
