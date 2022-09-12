package code;

import code.elemento.Elemento;

import java.util.ArrayList;

public class Pedido {
    private String nombreCliente;
    private String direccion;
    private ArrayList<Elemento> elementos;
    private Long nroLocal;

    public Pedido(String nombreCliente, String direccion, ArrayList<Elemento> elementos, Long nroLocal) {
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.elementos = elementos;
        this.nroLocal = nroLocal;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    public Long getNroLocal() {
        return nroLocal;
    }

    public void setNroLocal(Long nroLocal) {
        this.nroLocal = nroLocal;
    }
}
