/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artist extends Over{
    private ArrayList<Obra> obras;
    private int cantObras;

    public Artist(String name, int cantObras) {
        super(name);
        this.obras = new ArrayList<>();
        this.cantObras = cantObras;
    }
    
    public boolean addObra(ArrayList<Obra> obra){
        this.obras = obra;
        return true;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public int getCantObras() {
        return cantObras;
    }

    public void setCantObras(int cantObras) {
        this.cantObras = cantObras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
