package app.gui;

import com.google.gson.JsonIOException;
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
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Liliana Parada Sanchez
 * @author Flor Paulina Rodriguez Borja
 * @author Margarita del Carmen Sierra Muñoz
 * @author Arantxa Patricia Ibarra Muñoz
 */
public class Interfaz extends javax.swing.JFrame {
    //Variables Globales
    private String descripcion, path, texto, familia;
    private int valor, mouseX, mouseY, xInicial, xFinal, yInicial, yFinal, modo;
    private int grosor, rojo, verde, azul, estilo, size;
    private FileNameExtensionFilter filtro;
    private File archivoElegido;
    private JLabel label;
    private Color color;
    private boolean inicio, text, fig;
    private Font fuente;
    private JSONArray jsonArray;
    private JOptionPane j;
    
    public Interfaz() {
        initComponents();
        //Inicializacion variables globales
        modo = 0;
        grosor = 0;
        inicio = true;
        text = false;
        fig = false;
        jsonArray = new JSONArray();
        //Acomodo componentes
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        jPanel1.setVisible(true);
        //Llamada a metodos
        loadFont(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        BtnBorrar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        cbFont = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbSize = new javax.swing.JComboBox<>();
        Negrita = new javax.swing.JCheckBox();
        Cursiva = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoAbrir = new javax.swing.JMenuItem();
        ArchivoGuardar = new javax.swing.JMenuItem();
        MenuFormas = new javax.swing.JMenu();
        SinRellenoMenu = new javax.swing.JMenu();
        FormaLinea = new javax.swing.JMenuItem();
        FormaRectang = new javax.swing.JMenuItem();
        FormaOvalo = new javax.swing.JMenuItem();
        FormaElipse = new javax.swing.JMenuItem();
        ConRellenoMenu = new javax.swing.JMenu();
        RectangRelleno = new javax.swing.JMenuItem();
        OvaloRelleno = new javax.swing.JMenuItem();
        ElipseRelleno = new javax.swing.JMenuItem();
        MenuTexto = new javax.swing.JMenu();
        TextoAgregar = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
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

        Negrita.setText("Negrita");
        Negrita.setFocusable(false);
        Negrita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Negrita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Negrita.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NegritaItemStateChanged(evt);
            }
        });
        jToolBar1.add(Negrita);

        Cursiva.setText("Cursiva");
        Cursiva.setFocusable(false);
        Cursiva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cursiva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cursiva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CursivaItemStateChanged(evt);
            }
        });
        jToolBar1.add(Cursiva);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        MenuArchivo.setText("Archivo");

        ArchivoAbrir.setText("Abrir");
        ArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(ArchivoAbrir);

        ArchivoGuardar.setText("Guardar");
        ArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(ArchivoGuardar);

        jMenuBar1.add(MenuArchivo);

        MenuFormas.setText("Formas");

        SinRellenoMenu.setText("Sin relleno");

        FormaLinea.setText("Linea");
        FormaLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaLineaMousePressed(evt);
            }
        });
        SinRellenoMenu.add(FormaLinea);

        FormaRectang.setText("Rectangulo");
        FormaRectang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaRectangMousePressed(evt);
            }
        });
        SinRellenoMenu.add(FormaRectang);

        FormaOvalo.setText("Ovalo");
        FormaOvalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaOvaloMousePressed(evt);
            }
        });
        SinRellenoMenu.add(FormaOvalo);

        FormaElipse.setText("Elipse");
        FormaElipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormaElipseMousePressed(evt);
            }
        });
        SinRellenoMenu.add(FormaElipse);

        MenuFormas.add(SinRellenoMenu);

        ConRellenoMenu.setText("Con relleno");

        RectangRelleno.setText("Rectángulo");
        RectangRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangRellenoActionPerformed(evt);
            }
        });
        ConRellenoMenu.add(RectangRelleno);

        OvaloRelleno.setText("Óvalo");
        OvaloRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvaloRellenoActionPerformed(evt);
            }
        });
        ConRellenoMenu.add(OvaloRelleno);

        ElipseRelleno.setText("Elipse");
        ElipseRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElipseRellenoActionPerformed(evt);
            }
        });
        ConRellenoMenu.add(ElipseRelleno);

        MenuFormas.add(ConRellenoMenu);

        jMenuBar1.add(MenuFormas);

        MenuTexto.setText("Texto");

        TextoAgregar.setText("Agregar texto");
        TextoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoAgregarActionPerformed(evt);
            }
        });
        MenuTexto.add(TextoAgregar);

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

    private void ArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoAbrirActionPerformed
        descripcion = "*.Grafico";
        filtro = new FileNameExtensionFilter(descripcion,
                "graf");
        fileChooser.addChoosableFileFilter(filtro);
        fileChooser.setFileFilter(filtro);
        valor = fileChooser.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fileChooser.getSelectedFile();
            System.out.println(archivoElegido);
           try {
                JSONParser parse = new JSONParser();
                String data = new String (Files.readAllBytes(Paths.get
                                        (archivoElegido.getAbsolutePath())));
                System.out.println(data);
                Object obj = parse.parse(data);
                JSONObject newJson = (JSONObject) obj;
                JSONArray jsonArrayNew = (JSONArray) newJson.get("data");
                Graphics g = getGraphics();
                Graphics2D g2 = (Graphics2D) g;
                for(int i = 0; i < jsonArrayNew.size(); i++) {
                    JSONObject json = (JSONObject) jsonArrayNew.get(i);
                    modo = Integer.parseInt(json.get("Modo").toString());
                    rojo = Integer.parseInt(json.get("Rojo").toString());
                    verde = Integer.parseInt(json.get("Verde").toString());
                    azul = Integer.parseInt(json.get("Azul").toString());
                    color = new Color(rojo, verde, azul);
                    grosor = Integer.parseInt(json.get("Grosor").toString());
                    xInicial = Integer.parseInt(json.get("xInicial").
                                toString());
                    xFinal = Integer.parseInt(json.get("xFinal").toString());
                    yInicial = Integer.parseInt(json.get("yInicial").
                                toString());
                    yFinal = Integer.parseInt(json.get("yFinal").toString());
                    mouseX = Integer.parseInt(json.get("MouseX").toString());
                    mouseY = Integer.parseInt(json.get("MouseY").toString());
                    texto = json.get("Texto").toString();
                    familia = json.get("Familia").toString();
                    estilo = Integer.parseInt(json.get("Estilo").toString());
                    size = Integer.parseInt(json.get("Size").toString());
                    fuente = new Font(familia, estilo, size);
                    dibujaFigura(g);
                }
            } catch(Exception e) {
                System.err.println("Error lectura archivo:" + e);
            }
        }
    }//GEN-LAST:event_ArchivoAbrirActionPerformed
    
    private void FormaLineaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaLineaMousePressed
        modo = 0;
        fig = true;
        text = false;
    }//GEN-LAST:event_FormaLineaMousePressed

    private void FormaRectangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaRectangMousePressed
        modo = 2;
        fig = true;
        text = false;
    }//GEN-LAST:event_FormaRectangMousePressed

    private void FormaOvaloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaOvaloMousePressed
        modo = 1;
        fig = true;
        text = false;
    }//GEN-LAST:event_FormaOvaloMousePressed

    //Eliminar
    private void FormaTriangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaTriangMousePressed
        
    }//GEN-LAST:event_FormaTriangMousePressed
    
    private void FormaElipseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormaElipseMousePressed
        modo = 3;
        fig = true;
        text = false;
    }//GEN-LAST:event_FormaElipseMousePressed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
       jPanel1.removeAll();
       jsonArray = new JSONArray();
       jPanel1.repaint();     
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void OpcColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcColorActionPerformed
        //Abre en un cuadro de dialogo el color chooser y lo guarda
        color = JColorChooser.showDialog(null, "Choose a Color", Color.BLUE);     
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

    private void cbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontActionPerformed
        fuente = new Font(cbFont.getSelectedItem().toString(),
        Font.PLAIN, Integer.parseInt(cbSize.getSelectedItem().toString()));
    }//GEN-LAST:event_cbFontActionPerformed

    private void cbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSizeActionPerformed
        fuente = new Font(cbFont.getSelectedItem().toString(),
        Font.PLAIN, Integer.parseInt(cbSize.getSelectedItem().toString()));
    }//GEN-LAST:event_cbSizeActionPerformed

    private void RectangRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangRellenoActionPerformed
        modo = 4;
        fig = true;
        text = false;
    }//GEN-LAST:event_RectangRellenoActionPerformed

    private void OvaloRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvaloRellenoActionPerformed
        modo = 5;
        fig = true;
        text = false;
    }//GEN-LAST:event_OvaloRellenoActionPerformed

    private void ElipseRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElipseRellenoActionPerformed
        modo = 6;
        fig = true;
        text = false;
    }//GEN-LAST:event_ElipseRellenoActionPerformed

    private void NegritaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NegritaItemStateChanged
        if (Negrita.isSelected() && Cursiva.isSelected()) {
            //cambie el texto a negrita y cursiva
            fuente = new Font(cbFont.getSelectedItem().toString(),
                    Font.BOLD | Font.ITALIC,
                    Integer.parseInt(cbSize.getSelectedItem().toString()));

        } else if (Negrita.isSelected()) {
            fuente = new Font(cbFont.getSelectedItem().toString(), Font.BOLD,
                    Integer.parseInt(cbSize.getSelectedItem().toString()));
        } else if (Cursiva.isSelected()) {
            //Cambie el texto a cursiva
            fuente = new Font(cbFont.getSelectedItem().toString(), Font.ITALIC,
                    Integer.parseInt(cbSize.getSelectedItem().toString()));

        } else {
            fuente = new Font(cbFont.getSelectedItem().toString(), Font.PLAIN,
                    Integer.parseInt(cbSize.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_NegritaItemStateChanged

    private void CursivaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CursivaItemStateChanged
        if (Negrita.isSelected() && Cursiva.isSelected()) {
            //cambie el texto a negrita y cursiva
            fuente = new Font(cbFont.getSelectedItem().toString(),
                    Font.BOLD | Font.ITALIC, 
                    Integer.parseInt(cbSize.getSelectedItem().toString()));

        } else if (Cursiva.isSelected()) {
            //Cambie el texto a cursiva
            fuente = new Font(cbFont.getSelectedItem().toString(), Font.ITALIC, 
                    Integer.parseInt(cbSize.getSelectedItem().toString()));

        } else if (Negrita.isSelected()) {
            fuente = new Font(cbFont.getSelectedItem().toString(), Font.BOLD,
                    Integer.parseInt(cbSize.getSelectedItem().toString()));
        } else {
            fuente = new Font(cbFont.getSelectedItem().toString(),Font.PLAIN, 
                    Integer.parseInt(cbSize.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_CursivaItemStateChanged

    private void TextoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoAgregarActionPerformed
        fig = false;
        modo = 7;
        text = true;
    }//GEN-LAST:event_TextoAgregarActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();

        Graphics g = jPanel1.getGraphics();
        escribirTexto(g);
        if (fig == true) {
            if (inicio) {
                xInicial = evt.getX();
                yInicial = evt.getY();
                inicio = false;
            } else {
                xFinal = evt.getX();
                yFinal = evt.getY();
                dibujaFigura(g);
                inicio = true;
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void ArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoGuardarActionPerformed
        int save;
        
        fileChooser.setCurrentDirectory(new File("C:\\"));
        save = fileChooser.showSaveDialog(null);
        if (save == JFileChooser.APPROVE_OPTION) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject json = (JSONObject) jsonArray.get(i);
                System.out.println(json);
            }
            try {
                JSONObject finalJ = new JSONObject();
                finalJ.put("data", jsonArray);
                FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + 
                                                ".graf");
                fw.write(finalJ.toString());
                fw.flush();
                fw.close();
            } catch (JsonIOException | IOException e) {
                j.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_ArchivoGuardarActionPerformed
    
    public void escribirTexto(Graphics g){
        Graphics2D gText = (Graphics2D) g;
        
        if(text == true){
            texto = JOptionPane.showInputDialog("");
            if(texto != null){
                if (fuente == null){
                    fuente = new Font("Arial", Font.PLAIN, 12);
                }
                gText.setFont(fuente);
                //Obtiene parametros de la fuente
                familia = fuente.getFamily();
                estilo = fuente.getStyle();
                size = fuente.getSize();
                if(color == null){
                    color = new Color(0, 0, 0);
                }
                gText.setColor(color);
                rojo = color.getRed();
                verde = color.getGreen();
                azul = color.getBlue();
                gText.drawString(texto, mouseX, mouseY);
                saveJson(modo, texto, mouseX, mouseY, rojo, verde, azul,
                        familia, estilo, size, gText);
            }
        }
    }
    
    public void desplegarTexto(Graphics g){
        Graphics2D gText = (Graphics2D) g;
        
        if(texto != null){
            gText.setFont(fuente);
            gText.setColor(color);
            gText.drawString(texto, mouseX, mouseY);
        }
    }
    
    public ImageIcon redimension(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), 
                        label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private void loadFont() {
        GraphicsEnvironment gEnv = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        //Obtiene todas las fuentes
        String[] fontNames = gEnv.getAvailableFontFamilyNames();
        // Las agrega al ComboBox
        ComboBoxModel model = new DefaultComboBoxModel(fontNames);
        cbFont.setModel(model);
    }

    public void dibujaFigura(Graphics g) {
        //Convierte Graphics a Graphics2D para poder cambiar grosor
        Graphics2D g2 = (Graphics2D) g;
        Shape elipse;
        int ancho, alto;
        
        ancho = xFinal - xInicial;
        alto = yFinal - yInicial;
        
        //Si no escogen color, el predeterminado es negro
        if(color == null){
            color = new Color(0, 0, 0);
        }
        g.setColor(color);
        //Obtiene colores para redibujar
        rojo = color.getRed();
        verde = color.getGreen();
        azul = color.getBlue();

        //Segun el RadioButton elegido cambia el grosor de linea
        switch (grosor) {
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
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, rojo, verde,
                        azul, grosor, g2);
                break;
            case 1:
                g2.drawOval(xInicial, yInicial, ancho, alto);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto, 
                        rojo, verde, azul, grosor, g2);
                break;
            case 2:
                g2.drawRect(xInicial, yInicial, ancho, alto);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto, 
                        rojo, verde, azul, grosor, g2);
                break;
            case 3:
                elipse = new Ellipse2D.Float(xInicial, yInicial, ancho, alto);
                g2.draw(elipse);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto, 
                        rojo, verde, azul, grosor, g2);
                break;
            case 4:
                g2.fillRect(xInicial, yInicial, ancho, alto);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto,
                        rojo, verde, azul, grosor, g2);
                break;
            case 5:
                g2.fillOval(xInicial, yInicial, ancho, alto);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto, 
                        rojo, verde, azul, grosor, g2);
                break;
            case 6:
                elipse = new Ellipse2D.Float(xInicial, yInicial, ancho, alto);
                g2.fill(elipse);
                saveJson(modo, xInicial, yInicial, xFinal, yFinal, ancho, alto,
                        rojo, verde, azul, grosor, g2);
                break;
            case 7:
                if (texto.isEmpty()){
                    escribirTexto(g);
                } else {
                    desplegarTexto(g);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private void saveJson(int modo, int xInicial, int yInicial, 
            int xFinal, int yFinal, int rojo, int verde, int azul, int grosor,
            Graphics2D g2) {
        JSONObject json = new JSONObject();
        
        json.put("Modo", modo);
        json.put("xInicial" ,xInicial);
        json.put("yInicial", yInicial);
        json.put("xFinal", xFinal);
        json.put("yFinal", yFinal);
        json.put("Rojo", rojo);
        json.put("Verde", verde);
        json.put("Azul", azul);
        json.put("Grosor", grosor);
        jsonArray.add(json);
    }
    
    private void saveJson(int modo, int xInicial, int yInicial, 
            int xFinal, int yFinal, int ancho, int alto, int rojo, int verde, 
            int azul, int grosor, Graphics2D g2) {
        JSONObject json = new JSONObject();
        
        json.put("Modo", modo);
        json.put("xInicial" ,xInicial);
        json.put("yInicial", yInicial);
        json.put("xFinal", xFinal);
        json.put("yFinal", yFinal);
        json.put("Ancho", ancho);
        json.put("Alto", alto);
        json.put("Rojo", rojo);
        json.put("Verde", verde);
        json.put("Azul", azul);
        json.put("Grosor", grosor);
        jsonArray.add(json);
    }
    
    private void saveJson(int modo, String texto, int mouseX, int mouseY,
            int rojo, int verde, int azul, String familia, int estilo, int size,
            Graphics2D g2){
        JSONObject json = new JSONObject();
        
        json.put("Modo", modo);
        json.put("Texto", texto);
        json.put("MouseX" ,mouseX);
        json.put("MouseY", mouseY);
        json.put("Rojo", rojo);
        json.put("Verde", verde);
        json.put("Azul", azul);
        json.put("Familia", familia);
        json.put("Estilo", estilo);
        json.put("Size", size);
        jsonArray.add(json);
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
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JMenu ConRellenoMenu;
    private javax.swing.JCheckBox Cursiva;
    private javax.swing.JMenuItem ElipseRelleno;
    private javax.swing.JMenuItem FormaElipse;
    private javax.swing.JMenuItem FormaLinea;
    private javax.swing.JMenuItem FormaOvalo;
    private javax.swing.JMenuItem FormaRectang;
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
    private javax.swing.JCheckBox Negrita;
    private javax.swing.JMenuItem OpcColor;
    private javax.swing.JMenu OpcGrosor;
    private javax.swing.JMenuItem OvaloRelleno;
    private javax.swing.JMenuItem RectangRelleno;
    private javax.swing.JMenu SinRellenoMenu;
    private javax.swing.JMenuItem TextoAgregar;
    private javax.swing.JComboBox<String> cbFont;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}