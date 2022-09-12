package code.elemento;

public abstract class Elemento {
    private String nombre;
    private String clasificacion;

    public Elemento(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public abstract Integer getPeso();
    public abstract Float getPrecio(); //TODO aca tiene que pasar por param un criterioPrecio
    public abstract Integer getCantidad();
}
