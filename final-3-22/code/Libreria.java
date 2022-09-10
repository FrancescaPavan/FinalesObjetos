package code;

import code.clientes.Clientela;
import code.descuentos.Descuento;

import java.util.ArrayList;

public class Libreria {

    ArrayList<Libro> libros;
    ArrayList<Clientela> clientes;
    ArrayList<Descuento> dtos;

    public ArrayList<String> getRecomendaciones(Clientela c){
        ArrayList<String> aceptados = new ArrayList<>();
        for (Libro l : libros){
            if (c.acepta(l))
                aceptados.add(l.nombre);
        }
        return aceptados;
    }

    public Float calcularPrecio(Clientela c, Libro l){
        Descuento aAplicar;
        for (Descuento d : dtos) {

        }
    }
    public static void main(String[] args) {
        System.out.print("Hello world!");
    }
}
