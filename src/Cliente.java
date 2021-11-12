public class Cliente {
    private final String nombre;
    private final String numeroTelefono;
    private final String mail;
    private final Direccion direccion;

    public Cliente(String nombre, String numeroTelefono, String mail, Direccion direccion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.mail = mail;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getMail() {
        return mail;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
