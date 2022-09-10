package code;

import java.util.ArrayList;

public class Libro {
    String nombre;
    String autor;
    String resumen;
    Double precio;
    ArrayList<String> generos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void addGenero(String genero){
        this.generos.add(genero);
    }

    public boolean contieneGenero(String genero){
        return this.generos.contains(genero);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Libro(String nombre, String autor, String resumen, Double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.precio = precio;
        this.generos = new ArrayList<>();
    }
}
