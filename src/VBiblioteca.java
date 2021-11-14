import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        setSize(500, 300);

        mostrarBiblioteca(biblioteca);

        clientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                VClientes vClientes = new VClientes(biblioteca);
                vClientes.setVisible(true);
            }
        });
        librosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                VLibros vLibros = new VLibros(biblioteca);
                vLibros.setVisible(true);
            }
        });
        revistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                VRevistas vRevistas = new VRevistas(biblioteca);
                vRevistas.setVisible(true);
            }
        });
    }

    private void mostrarBiblioteca(Biblioteca biblioteca) {
        lb_cantPublicaciones.setText(String.valueOf(biblioteca.cantidadPublicaciones()));
        lb_cantLibros.setText(String.valueOf(biblioteca.cantLibros()));
        lb_cantRevistas.setText(String.valueOf(biblioteca.cantRevistas()));
        lb_cantClientes.setText(String.valueOf(biblioteca.cantidadClientes()));
    }
}
