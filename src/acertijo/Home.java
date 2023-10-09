/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acertijo;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 *
 * @author Juan David Patarroyo
 */
public class Home {
    
    Random aleatorio;
    int x;
    int y;
    Color color = new Color(0, 0, 0);
    private final Color respuesta  = new Color(128, 235, 161);;
    public Home(){
    }
    
    
     public void CBDemostracion(JFrame root){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
        
        JLabel lRojo = new JLabel("Rojo:");
        lRojo.setBounds(10, 10, 100, 30);
        panel.add(lRojo);
        
        JComboBox cbRojo = new JComboBox<String>();
        cbRojo.setBounds(120, 10, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbRojo.addItem(String.valueOf(i));
        }
        panel.add(cbRojo);
        
        JButton btnPista1 = new JButton("Pista");
        btnPista1.setBounds(200, 10, 100, 30);
        panel.add(btnPista1);
        
        JLabel lVerde = new JLabel("Verde:");
        lVerde.setBounds(10, 50, 100, 30);
        panel.add(lVerde);
        
        JComboBox cbVerde = new JComboBox<String>();
        cbVerde.setBounds(120, 50, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbVerde.addItem(String.valueOf(i));
        }
        panel.add(cbVerde);
        
        JButton btnPista2 = new JButton("Pista");
        btnPista2.setBounds(200, 50, 100, 30);
        panel.add(btnPista2);
        
        JLabel lAzul = new JLabel("Azul:");
        lAzul.setBounds(10, 90, 100, 30);
        panel.add(lAzul);
        
        JComboBox cbAzul = new JComboBox<String>();
        cbAzul.setBounds(120, 90, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbAzul.addItem(String.valueOf(i));
        }
        panel.add(cbAzul);
        
        JButton btnPista3 = new JButton("Pista");
        btnPista3.setBounds(200, 90, 100, 30);
        panel.add(btnPista3);
        
        JButton btnInsertarColor = new JButton("Cambiar Color");
        btnInsertarColor.setBounds(10, 130, 200, 30);
        panel.add(btnInsertarColor);
        
        JButton btnObtener = new JButton("Obtener Mensaje!");
        btnObtener.setBounds(10, 170, 150, 25);
        panel.add(btnObtener);
        
        aleatorio = new Random();
        
        MouseListener mouseListener = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e)  { }
            @Override
            public void mousePressed(MouseEvent e)  { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!color.equals(respuesta)){
                    x = aleatorio.nextInt(400);
                    y = aleatorio.nextInt(170, 400);
                    btnObtener.setBounds(x,y,150,25);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) { }
        };
        
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String strColor1 = (String)cbVerde.getSelectedItem();
                int Color1 = Integer.parseInt(strColor1);
                String strColor2 = (String)cbRojo.getSelectedItem();
                int Color2 = Integer.parseInt(strColor2);
                String strColor3 = (String)cbAzul.getSelectedItem();
                int Color3 = Integer.parseInt(strColor3);
                
                color = new Color(Color2, Color1, Color3);
                btnObtener.setBackground(color);
            }
        };
        
        ActionListener listenerPista1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Pistas.Pista1();
            }
        };
        
        ActionListener listenerPista2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Pistas.Pista2();
            }
        };
        
        ActionListener listenerPista3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Pistas.Pista3();
            }
        };
        
        JLabel confirmacion = new JLabel("Se ha copiado el mensaje en el portapapeles,");
        confirmacion.setBounds(320, 10, 400, 20);
        confirmacion.setVisible(false);
        panel.add(confirmacion);
        
        JLabel confirmacion2 = new JLabel("pegalo en tu navegador.");
        confirmacion2.setBounds(320, 40, 400, 20);
        confirmacion2.setVisible(false);
        panel.add(confirmacion2);
        ActionListener listenerResultado = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String str = "https://r.mtdv.me/articles/0N46sVZlUF";
                Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strSel = new StringSelection(str);
                cb.setContents(strSel, null);
                confirmacion.setVisible(true);
                confirmacion2.setVisible(true);
            }
        };
        
        btnPista1.addActionListener(listenerPista1);
        btnPista2.addActionListener(listenerPista2);
        btnPista3.addActionListener(listenerPista3);
        
        btnObtener.addMouseListener(mouseListener);
        btnObtener.addActionListener(listenerResultado);
        btnInsertarColor.addActionListener(actionListener);
        
        root.setVisible(true);
    }
}
