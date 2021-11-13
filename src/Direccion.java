public class Direccion {
    private final String calle;
    private final Barrio barrio;

    public Direccion(String calle, Barrio barrio) {
        this.calle = calle;
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return calle + ", " + barrio;
    }
}
