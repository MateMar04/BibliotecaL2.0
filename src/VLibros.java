import javax.swing.*;

public class VLibros extends javax.swing.JFrame {
    private JComboBox cb_libros;
    private JLabel lb_titulo;
    private JLabel lb_autor;
    private JLabel lb_editorial;
    private JLabel lb_categoria;
    private JPanel panel1;

    public VLibros(Biblioteca biblioteca) {
        setTitle("Biblioteca de Damian");
        add(panel1);
        setSize(400, 300);

    }
}
