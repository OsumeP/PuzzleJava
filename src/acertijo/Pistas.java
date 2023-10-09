/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acertijo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan David Patarroyo
 */
public class Pistas {
    public static void Pista1(){
        JFrame frame = new JFrame("Pista 1");
        frame.setBounds(150,150, 500, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        JLabel lbAcertijo1 = new JLabel("1. Es el átomo más simple, en todos los lares lo ven.");
        lbAcertijo1.setBounds(10, 30, 400, 30);
        panel.add(lbAcertijo1);
        
        JLabel lbAcertijo2 = new JLabel("2. En estrellas nacientes y globos de fiesta suele aparecer.");
        lbAcertijo2.setBounds(10, 80, 400, 30);
        panel.add(lbAcertijo2);
        
        JLabel lbAcertijo3 = new JLabel("3. En agua y en aire hay mucho de él, sin él nunca veríamos el amanecer.");
        lbAcertijo3.setBounds(10, 130, 450, 30);
        panel.add(lbAcertijo3);
        
        frame.setVisible(true);
    }
    
    public static void Pista2(){
        JFrame frame = new JFrame("Pista 1");
        frame.setBounds(150,150, 500, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        JLabel lbAcertijo1 = new JLabel("Encuentra los tres anteriores números de esta secuencia:");
        lbAcertijo1.setBounds(10, 30, 400, 30);
        panel.add(lbAcertijo1);
        
        JLabel lbAcertijo2 = new JLabel("...7, 11, 13, 15.");
        lbAcertijo2.setBounds(10, 80, 400, 30);
        panel.add(lbAcertijo2);
        
        frame.setVisible(true);
    }
    
    public static void Pista3(){
        JFrame frame = new JFrame("Pista 1");
        frame.setBounds(150,150, 500, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        JLabel lbAcertijo1 = new JLabel("En la naturaleza y el arte, me puedes encontrar,");
        lbAcertijo1.setBounds(10, 30, 400, 30);
        panel.add(lbAcertijo1);
        
        JLabel lbAcertijo2 = new JLabel("una proporción especial, difícil de igualar.");
        lbAcertijo2.setBounds(10, 60, 400, 30);
        panel.add(lbAcertijo2);
        
        JLabel lbAcertijo3 = new JLabel("Divide un segmento en dos partes, de manera exacta,");
        lbAcertijo3.setBounds(10, 90, 400, 30);
        panel.add(lbAcertijo3);
        
        JLabel lbAcertijo4 = new JLabel("la relación perfecta, una forma abstracta.");
        lbAcertijo4.setBounds(10, 120, 400, 30);
        panel.add(lbAcertijo4);
        
        JLabel lbAcertijo5 = new JLabel("¿Quién soy, enigma dorado, puedes adivinar?");
        lbAcertijo5.setBounds(10, 150, 400, 30);
        panel.add(lbAcertijo5);
        
        JLabel lbAcertijo6 = new JLabel("Una proporción mágica, difícil de igualar.");
        lbAcertijo6.setBounds(10, 180, 400, 30);
        panel.add(lbAcertijo6);
        
        frame.setVisible(true);
    }
}
