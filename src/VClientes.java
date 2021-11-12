import javax.swing.*;

public class VClientes extends javax.swing.JFrame {
    private JComboBox cb_clientes;
    private JComboBox cb_publicaciones;
    private JLabel lb_nombre;
    private JLabel lb_telefono;
    private JLabel lb_direccion;
    private JLabel lb_mail;
    private JPanel panel1;

    public VClientes(Biblioteca biblioteca) {
        setTitle("Clientes");
        add(panel1);
        setSize(400, 300);

    }
}
