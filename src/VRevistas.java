import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class VRevistas extends javax.swing.JFrame {
    private JComboBox cb_revistas;
    private JLabel lb_titulo;
    private JLabel lb_autor;
    private JLabel lb_editorial;
    private JLabel lb_categoria;
    private JPanel panel1;

    public VRevistas(Biblioteca biblioteca) {
        setTitle("Biblioteca de Damian");
        add(panel1);
        setSize(500, 300);

        ArrayList<Revista> revistas = biblioteca.getRevistas();
        Vector comboBoxItems = new Vector();
        for (Revista revista : revistas) {
            comboBoxItems.add(revista.getTitulo());
        }
        cb_revistas.setModel(new DefaultComboBoxModel(comboBoxItems));
        cb_revistas.setSelectedIndex(-1);


        cb_revistas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb_revistas.getSelectedIndex() != -1) {
                    obtenerRevista(revistas);
                }
            }
        });
    }

    private void obtenerRevista(ArrayList<Revista> revistas) {
        Revista revista = revistas.get(cb_revistas.getSelectedIndex());
        lb_titulo.setText(revista.getTitulo());
        lb_autor.setText(revista.getAutor().getNombre());
        lb_editorial.setText(revista.getEditorial().getNombre());
        lb_categoria.setText(revista.getCategoria().getNombre());
    }
}
