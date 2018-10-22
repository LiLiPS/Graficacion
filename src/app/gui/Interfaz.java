package app.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.io.File;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Liliana Parada Sanchez
 * @author Flor Paulina Rodriguez Borja
 * @author Margarita del Carmen Sierra Muñoz
 * @author Arantxa Patricia Ibarra Muñoz
 */

public class Interfaz extends javax.swing.JFrame {
    //Variables Globales
    private String descripcion, path;
    private int valor;
    private FileNameExtensionFilter filtro;
    private File archivoElegido;
    JLabel label;
    private Color color;
    private int mouseX;
    private int mouseY;
    private int xInicial;
    private int xFinal;
    private int yInicial;
    private int yFinal;
    private int xpos[];
    private int ypos[];
    private boolean inicio = true;
    private int modo = 0;
    private int grosor = 0;
    
    public Interfaz() {
        initComponents();
        
        jPanel1.setVisible(false);//Se mostrara al dar clic en 'nuevo'
        //Acomodo JFrame
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        loadFont(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        BtnBorrar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        cbFont = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbSize = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoNuevo = new javax.swing.JMenuItem();
        ArchivoAbrir = new javax.swing.JMenuItem();
        ArchivoGuardar = new javax.swing.JMenuItem();
        MenuFormas = new javax.swing.JMenu();
        FormaLinea = new javax.swing.JMenuItem();
        FormaRectang = new javax.swing.JMenuItem();
        FormaOvalo = new javax.swing.JMenuItem();
        FormaElipse = new javax.swing.JMenuItem();
        MenuTexto = new javax.swing.JMenu();
        TextoAgregar = new javax.swing.JMenuItem();
        SubMFuente = new javax.swing.JMenu();
        FuenteTam = new javax.swing.JMenu();
        FuenteTipo = new javax.swing.JMenu();
        MenuImagen = new javax.swing.JMenu();
        ImagenAgrega = new javax.swing.JMenuItem();
        MenuOpciones = new javax.swing.JMenu();
        OpcGrosor = new javax.swing.JMenu();
        Grosor1 = new javax.swing.JRadioButtonMenuItem();
        Grosor2 = new javax.swing.JRadioButtonMenuItem();
        Grosor3 = new javax.swing.JRadioButtonMenuItem();
        Grosor4 = new javax.swing.JRadioButtonMenuItem();
        OpcColor = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Explorador de Archivos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor 2D");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 379));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 296, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        BtnBorrar.setText("Borrar");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBorrar, java.awt.BorderLayout.SOUTH);

        jToolBar1.setRollover(true);

        jLabel3.setText("Font");
        jToolBar1.add(jLabel3);

        cbFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFontActionPerformed(evt);
            }
        });
        jToolBar1.add(cbFont);

        jLabel4.setText("Size");
        jToolBar1.add(jLabel4);

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "16", "20", "24", "28", "32", "36", "40", "44", "48", "52", "56", "60" }));
        cbSize.setToolTipText("Select font size");
        cbSize.setMinimumSize(new java.awt.Dimension(400, 20));
        cbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSizeActionPerformed(evt);
            }
        });
        jToolBar1.add(cbSize);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        MenuArchivo.setText("Archivo");

        ArchivoNuevo.setText("Nuevo");
        ArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(ArchivoNuevo);

        ArchivoAbrir.setText("Abrir");
        MenuArchivo.add(ArchivoAbrir);

        ArchivoGuardar.setText("Guardar");
        MenuArchivo.add(ArchivoGuardar);

        jMenuBar1.add(MenuArchivo);

        MenuFormas.setText("Formas");

        FormaLinea.setText("Linea");
        FormaLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaLineaMousePressed(evt);
            }
        });
        MenuFormas.add(FormaLinea);

        FormaRectang.setText("Rectangulo");
        FormaRectang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaRectangMousePressed(evt);
            }
        });
        MenuFormas.add(FormaRectang);

        FormaOvalo.setText("Ovalo");
        FormaOvalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaOvaloMousePressed(evt);
            }
        });
        MenuFormas.add(FormaOvalo);

        FormaElipse.setText("Elipse");
        FormaElipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaElipseMousePressed(evt);
            }
        });
        MenuFormas.add(FormaElipse);

        jMenuBar1.add(MenuFormas);

        MenuTexto.setText("Texto");

        TextoAgregar.setText("Agregar texto");
        MenuTexto.add(TextoAgregar);

        SubMFuente.setText("Fuente");

        FuenteTam.setText("Tamano");
        SubMFuente.add(FuenteTam);

        FuenteTipo.setText("Tipo");
        SubMFuente.add(FuenteTipo);

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

        Grosor1.setSelected(true);
        Grosor1.setText("1.0");
        Grosor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grosor1ActionPerformed(evt);
            }
        });
        OpcGrosor.add(Grosor1);

        Grosor2.setText("2.0");
        Grosor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grosor2ActionPerformed(evt);
            }
        });
        OpcGrosor.add(Grosor2);

        Grosor3.setText("3.0");
        Grosor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grosor3ActionPerformed(evt);
            }
        });
        OpcGrosor.add(Grosor3);

        Grosor4.setText("4.0");
        Grosor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grosor4ActionPerformed(evt);
            }
        });
        OpcGrosor.add(Grosor4);

        MenuOpciones.add(OpcGrosor);

        OpcColor.setText("Color");
        OpcColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcColorActionPerformed(evt);
            }
        });
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

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX(); 
        mouseY = evt.getY(); 
        
        Graphics g = this.jPanel1.getGraphics();
        if (inicio){
            xInicial = evt.getX();
            yInicial = evt.getY();
            inicio = false;
        }else {
            xFinal = evt.getX();
            yFinal = evt.getY();
            dibujaFigura(g);
            inicio = true;
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void FormaLineaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaLineaMousePressed
        modo = 0;
    }//GEN-LAST:event_FormaLineaMousePressed

    private void FormaRectangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaRectangMousePressed
        modo = 2;
    }//GEN-LAST:event_FormaRectangMousePressed

    private void FormaOvaloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaOvaloMousePressed
        modo = 1;
    }//GEN-LAST:event_FormaOvaloMousePressed

    private void FormaElipseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaElipseMousePressed
        modo = 4;
    }//GEN-LAST:event_FormaElipseMousePressed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
       // jPanel1.removeAll();
        jPanel1.repaint();     
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void OpcColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcColorActionPerformed
        //Abre en un cuadro de dialogo el color chooser y lo guarda
        color = JColorChooser.showDialog(null, "Choose a Color", Color.BLUE);
        
        if (color !=null){
            jTextPane1.setForeground(color);
        }        
    }//GEN-LAST:event_OpcColorActionPerformed

    private void Grosor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grosor1ActionPerformed
        grosor=0;  
        Grosor2.setSelected(false);
        Grosor3.setSelected(false);
        Grosor4.setSelected(false);
    }//GEN-LAST:event_Grosor1ActionPerformed

    private void Grosor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grosor2ActionPerformed
        grosor=1;
        Grosor1.setSelected(false);
        Grosor3.setSelected(false);
        Grosor4.setSelected(false);
    }//GEN-LAST:event_Grosor2ActionPerformed

    private void Grosor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grosor3ActionPerformed
        grosor=2;
        Grosor1.setSelected(false);
        Grosor2.setSelected(false);
        Grosor4.setSelected(false);
    }//GEN-LAST:event_Grosor3ActionPerformed

    private void Grosor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grosor4ActionPerformed
        grosor=3;
        Grosor1.setSelected(false);
        Grosor2.setSelected(false);
        Grosor3.setSelected(false);
    }//GEN-LAST:event_Grosor4ActionPerformed

    private void ArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoNuevoActionPerformed
        jPanel1.setVisible(true);
    }//GEN-LAST:event_ArchivoNuevoActionPerformed

    private void cbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontActionPerformed
        jTextPane1.setFont(new Font(cbFont.getSelectedItem().toString(),
        Font.PLAIN, Integer.parseInt(cbSize.getSelectedItem().toString())));
    }//GEN-LAST:event_cbFontActionPerformed

    private void cbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSizeActionPerformed
       jTextPane1.setFont(new Font(cbFont.getSelectedItem().toString(),
        Font.PLAIN, Integer.parseInt(cbSize.getSelectedItem().toString())));
    }//GEN-LAST:event_cbSizeActionPerformed
    
    //Metodo para redimensionar imagenes
    public ImageIcon redimension(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), 
                        label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void loadFont() {
    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    //Otiene todas las fuentes
    String[] fontNames = gEnv.getAvailableFontFamilyNames();
    // Las agrega al ComboBox
    ComboBoxModel model = new DefaultComboBoxModel(fontNames);
    cbFont.setModel(model);
    } 

    public void dibujaFigura(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //Convierte Graphics a Graphics2D para poder cambiar grosor
        int ancho, alto;
        ancho = xFinal - xInicial;
        alto = yFinal - yInicial;
        
        g.setColor(color); //Pone el color seleccionado en el color chooser
        
        switch(grosor){ //Segun el RadioButton elegido cambia el grosor de linea
            case 0: 
                g2.setStroke(new BasicStroke(1));
                break;
            case 1:
                g2.setStroke(new BasicStroke(2));
                break;
            case 2:
                g2.setStroke(new BasicStroke(3));
                break;
            case 3:
                g2.setStroke(new BasicStroke(4));
                break;
        }
        
        switch (modo) {
            case 0:
                g2.drawLine(xInicial, yInicial, xFinal, yFinal);
                break;
            case 1:
                g2.drawOval(xInicial, yInicial, ancho, alto);
                break;
            case 2:
                g2.drawRect(xInicial, yInicial, ancho, alto);
                break;
            case 3:
                getGraphics().drawLine(mouseX, mouseY, xFinal, yFinal);
                repaint();
            case 4:
                Shape elipse = new Ellipse2D.Float(xInicial, yInicial, ancho, alto);
                g2.draw(elipse);
                break;
            default:
                throw new AssertionError();
        }
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
    private javax.swing.JMenuItem FormaElipse;
    private javax.swing.JMenuItem FormaLinea;
    private javax.swing.JMenuItem FormaOvalo;
    private javax.swing.JMenuItem FormaRectang;
    private javax.swing.JMenu FuenteTam;
    private javax.swing.JMenu FuenteTipo;
    private javax.swing.JRadioButtonMenuItem Grosor1;
    private javax.swing.JRadioButtonMenuItem Grosor2;
    private javax.swing.JRadioButtonMenuItem Grosor3;
    private javax.swing.JRadioButtonMenuItem Grosor4;
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
    private javax.swing.JComboBox<String> cbFont;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
