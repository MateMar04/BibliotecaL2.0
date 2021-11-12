import javax.swing.*;

public class VBiblioteca extends javax.swing.JFrame {
    private JButton librosButton;
    private JButton revistasButton;
    private JButton clientesButton;
    private JLabel lb_cantPublicaciones;
    private JLabel lb_cantLibros;
    private JLabel lb_cantRevistas;
    private JLabel lb_cantClientes;
    private JPanel panel1;

    public VBiblioteca(Biblioteca biblioteca) {
        setTitle("Biblioteca de Damian");
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);

        lb_cantPublicaciones.setText(String.valueOf(biblioteca.cantidadPublicaciones()));
        lb_cantLibros.setText(String.valueOf(biblioteca.cantLibros()));
        lb_cantRevistas.setText(String.valueOf(biblioteca.cantRevistas()));
        lb_cantClientes.setText(String.valueOf(biblioteca.cantidadClientes()));
    }
}
