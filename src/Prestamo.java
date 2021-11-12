import java.util.ArrayList;

public class Prestamo {
    private final String fechaInicio;
    private final String fechaDevolucion;
    private final Cliente cliente;
    private final ArrayList<Publicacion> lista;

    public Prestamo(String fechaInicio, String fechaDevolucion, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.lista = new ArrayList<>();
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return lista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    void agregarPublicacion(Publicacion p) {
        lista.add(p);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", cliente=" + cliente +
                ", lista=" + lista +
                '}';
    }
}
