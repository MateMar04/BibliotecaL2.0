public abstract class Publicacion {
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;
    private final Categoria categoria;
    private int cantidadDePrestamos;

    public Publicacion(String titulo, Autor autor, Editorial editorial, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidadDePrestamos() {
        return cantidadDePrestamos;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                ", categoria=" + categoria +
                ", cantidadDePrestamos=" + cantidadDePrestamos +
                '}';
    }
}
