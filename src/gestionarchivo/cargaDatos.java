/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivo;
import java.io.*;
import java.util.*;

import quiz2.Obra;
import quiz2.Artist;
import quiz2.Over;

/**
 *
 * @author Estudiante
 */
public class cargaDatos {
    
    public static Obra leerObras(Scanner sc){
        Obra nObra = null;
        
        String name = sc.next().trim();
        String style = sc.next().trim();
        String techs = sc.next().trim();
        String price = sc.next().trim();
        Double p = Double.parseDouble(price);
        
        nObra = new Obra(name, style, techs, p);
        return nObra;
    }
    
    public static Artist leerArtist(Scanner sc){
        Artist nArtist = null;
        ArrayList<Obra> obras = null;
                
        String artista = sc.next().trim();
        String cantObras = sc.next().trim();
        int o = Integer.parseInt(cantObras);
        for(int i = 0; i < 0; i++){
            sc.useDelimiter("");
            if(sc.hasNext()){
                sc.nextLine();
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    obras.add(leerObras(sc));
                }
            }
        }
        nArtist = new Artist(artista, o);
        nArtist.addObra(obras);
        
        return nArtist;
    }
    
    
    public static ArrayList<Artist> leerDatos(String nombre){
                ArrayList<Artist> datos = new ArrayList<>();
		Scanner sc;
		try {
			sc = new Scanner(new File(nombre));
			sc.useDelimiter(",");
                        while (sc.hasNext()) {
                            datos.add(leerArtist(sc));
                        }
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + nombre);
			e.printStackTrace();
		}
                return datos;
    }  
}
