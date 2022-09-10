package code.clientes;
import code.Libro;
import java.util.ArrayList;

public abstract class Clientela {
    private ArrayList<Libro> librosComprados;

    public Clientela(){
        this.librosComprados = new ArrayList<>();
    }
    public abstract boolean acepta(Libro libro);

    public abstract Integer getAntiguedad();

    public abstract Integer getCantCompras();

    public abstract Double getGastoTotal();

    public void addLibroComprado(Libro libro){
        this.librosComprados.add(libro);
    }

    public ArrayList<Libro> getLibrosComprados(){
        return this.librosComprados;
    }
}
