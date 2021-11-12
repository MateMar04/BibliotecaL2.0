import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

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

        Vector comboBoxItems = new Vector();
        ArrayList<Cliente> clientes = biblioteca.getClientes();

        for (Cliente cliente : clientes) {
            comboBoxItems.add(cliente.getNombre());
        }

        cb_clientes.setModel(new DefaultComboBoxModel(comboBoxItems));
        cb_clientes.setSelectedIndex(-1);


        cb_clientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clientes.get(cb_clientes.getSelectedIndex());
                lb_nombre.setText(cliente.getNombre());
                lb_telefono.setText(cliente.getNumeroTelefono());
                lb_direccion.setText(cliente.getDireccion().toString());
                lb_mail.setText(cliente.getMail());

                Vector comboBoxItems = new Vector();

                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    ArrayList<Publicacion> publicacionesEnPoder = prestamo.getPublicaciones();
                    if (prestamo.getCliente().equals(cliente)) {
                        for (Publicacion publicacion : publicacionesEnPoder) {
                            comboBoxItems.add(publicacion.getTitulo());
                        }
                    }
                }
                cb_publicaciones.setModel(new DefaultComboBoxModel(comboBoxItems));
                cb_publicaciones.setSelectedIndex(-1);
            }
        });
    }
}
