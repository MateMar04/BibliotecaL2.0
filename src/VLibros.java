import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

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
        setSize(500, 300);

        ArrayList<Libro> libros = biblioteca.getLibros();
        Vector comboBoxItems = new Vector();
        for (Libro libro : libros) {
            comboBoxItems.add(libro.getTitulo());
        }
        cb_libros.setModel(new DefaultComboBoxModel(comboBoxItems));
        cb_libros.setSelectedIndex(-1);
        cb_libros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cb_libros.getSelectedIndex() != -1) {
                    Libro libro = libros.get(cb_libros.getSelectedIndex());
                    lb_titulo.setText(libro.getTitulo());
                    lb_autor.setText(libro.getAutor().getNombre());
                    lb_editorial.setText(libro.getEditorial().getNombre());
                    lb_categoria.setText(libro.getCategoria().getNombre());
                }
            }
        });
    }
}
