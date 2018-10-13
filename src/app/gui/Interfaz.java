package app.gui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Liliana Parada Sanchez
 * @author Flor Paulina Rodriguez Borja
 * @author Margarita del Carmen Sierra Mgit pull oruñoz
 * @author Arantxa Patricia Ibarra Muñoz
 * @author lili9
 */

public class Interfaz extends javax.swing.JFrame {
    //Variables Globales
    private String descripcion, path;
    private int valor;
    private FileNameExtensionFilter filtro;
    private File archivoElegido;
    JLabel label;
    
    public Interfaz() {
        initComponents();
        
        //Acomodo JFrame
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        BtnBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoNuevo = new javax.swing.JMenuItem();
        ArchivoAbrir = new javax.swing.JMenuItem();
        ArchivoGuardar = new javax.swing.JMenuItem();
        MenuFormas = new javax.swing.JMenu();
        FormaLinea = new javax.swing.JMenuItem();
        FormaRectang = new javax.swing.JMenuItem();
        FormaOvalo = new javax.swing.JMenuItem();
        FormaTriang = new javax.swing.JMenuItem();
        MenuTexto = new javax.swing.JMenu();
        TextoAgregar = new javax.swing.JMenuItem();
        SubMFuente = new javax.swing.JMenu();
        FuenteTipo = new javax.swing.JMenu();
        FuenteTam = new javax.swing.JMenu();
        MenuImagen = new javax.swing.JMenu();
        ImagenAgrega = new javax.swing.JMenuItem();
        MenuOpciones = new javax.swing.JMenu();
        OpcGrosor = new javax.swing.JMenu();
        OpcColor = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Explorador de Archivos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor 2D");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 379));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        BtnBorrar.setText("Borrar");
        getContentPane().add(BtnBorrar, java.awt.BorderLayout.SOUTH);

        MenuArchivo.setText("Archivo");

        ArchivoNuevo.setText("Nuevo");
        MenuArchivo.add(ArchivoNuevo);

        ArchivoAbrir.setText("Abrir");
        MenuArchivo.add(ArchivoAbrir);

        ArchivoGuardar.setText("Guardar");
        MenuArchivo.add(ArchivoGuardar);

        jMenuBar1.add(MenuArchivo);

        MenuFormas.setText("Formas");

        FormaLinea.setText("Linea");
        MenuFormas.add(FormaLinea);

        FormaRectang.setText("Rectangulo");
        MenuFormas.add(FormaRectang);

        FormaOvalo.setText("Ovalo");
        MenuFormas.add(FormaOvalo);

        FormaTriang.setText("Triangulo");
        MenuFormas.add(FormaTriang);

        jMenuBar1.add(MenuFormas);

        MenuTexto.setText("Texto");

        TextoAgregar.setText("Agregar texto");
        MenuTexto.add(TextoAgregar);

        SubMFuente.setText("Fuente");

        FuenteTipo.setText("Tipo");
        SubMFuente.add(FuenteTipo);

        FuenteTam.setText("Tamano");
        SubMFuente.add(FuenteTam);

        MenuTexto.add(SubMFuente);

        jMenuBar1.add(MenuTexto);

        MenuImagen.setText("Imagen");

        ImagenAgrega.setText("Agregar imagen");
        ImagenAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenAgregaActionPerformed(evt);
            }
        });
        MenuImagen.add(ImagenAgrega);

        jMenuBar1.add(MenuImagen);

        MenuOpciones.setText("Opciones");

        OpcGrosor.setText("Grosor de linea");
        MenuOpciones.add(OpcGrosor);

        OpcColor.setText("Color");
        MenuOpciones.add(OpcColor);

        jMenuBar1.add(MenuOpciones);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento para abrir FileChooser desde MenuItem
    private void ImagenAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenAgregaActionPerformed
        descripcion = "*.Imagenes";
        filtro = new FileNameExtensionFilter(descripcion,
                "bmp", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(filtro);
        fileChooser.setFileFilter(filtro);
        valor = fileChooser.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            label = new JLabel();
            label.setBounds(10, 10, 600, 579);
            jPanel1.add(label);
            archivoElegido = fileChooser.getSelectedFile();
            path = archivoElegido.getAbsolutePath();
            try {
                label.setIcon(redimension(path));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ImagenAgregaActionPerformed
    
    //Metodo para redimensionar imagenes
    public ImageIcon redimension(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), 
                        label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ArchivoAbrir;
    private javax.swing.JMenuItem ArchivoGuardar;
    private javax.swing.JMenuItem ArchivoNuevo;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JMenuItem FormaLinea;
    private javax.swing.JMenuItem FormaOvalo;
    private javax.swing.JMenuItem FormaRectang;
    private javax.swing.JMenuItem FormaTriang;
    private javax.swing.JMenu FuenteTam;
    private javax.swing.JMenu FuenteTipo;
    private javax.swing.JMenuItem ImagenAgrega;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuFormas;
    private javax.swing.JMenu MenuImagen;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JMenu MenuTexto;
    private javax.swing.JMenuItem OpcColor;
    private javax.swing.JMenu OpcGrosor;
    private javax.swing.JMenu SubMFuente;
    private javax.swing.JMenuItem TextoAgregar;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}