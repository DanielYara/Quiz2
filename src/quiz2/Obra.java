/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Estudiante
 */
public class Obra extends Over{
    private String style;
    private String tech;
    private double price;
    private Artist artista;

    public Obra(String name, String style, String tech, double price) {
        super(name);
        this.style = style;
        this.tech = tech;
        this.price = price;
        this.artista = artista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Artist getArtista() {
        return artista;
    }

    public void setArtista(Artist artista) {
        this.artista = artista;
    }
    
    
    
}
