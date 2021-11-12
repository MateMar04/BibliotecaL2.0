import java.util.ArrayList;

public class Biblioteca {
    private final String nombre;
    private final ArrayList<Publicacion> publicaciones;
    private final ArrayList<Prestamo> prestamos;
    private final ArrayList<Cliente> clientes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        publicaciones = new ArrayList<Publicacion>();
        prestamos = new ArrayList<Prestamo>();
        clientes = new ArrayList<Cliente>();
    }

    void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    void prestarPublicacion(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public int cantidadPrestamos() {
        return prestamos.size();
    }

    public int cantidadPublicaciones() {
        return publicaciones.size();
    }

    public int cantidadClientes() {
        return clientes.size();
    }

    public int cantLibros() {
        int cantLibros = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                cantLibros++;
            }
        }
        return cantLibros;
    }

    public int cantRevistas() {
        int cantRevistas = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Revista) {
                cantRevistas++;
            }
        }
        return cantRevistas;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Cliente> clientesConPrestamoLibro() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for (Prestamo prestamo : prestamos) {
            for (Publicacion publicacion : prestamo.getPublicaciones()) {
                if (publicacion instanceof Libro) {
                    clientes.add(prestamo.getCliente());
                    break;
                }
            }
        }
        return clientes;
    }

    public ArrayList<Barrio> barriosConPrestamos() {
        ArrayList<Barrio> barrios = new ArrayList<Barrio>();
        for (Prestamo prestamo : prestamos) {
            barrios.add(prestamo.getCliente().getDireccion().getBarrio());
        }
        return barrios;
    }
}
