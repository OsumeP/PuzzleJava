/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acertijo;

import javax.swing.JFrame;

/**
 *
 * @author Juan David Patarroyo
 */
public class Acertijo {

    public static void main(String[] args) {
        JFrame root = CreacionFrame();
        Home home = new Home();
        home.CBDemostracion(root);
    }
    public static JFrame CreacionFrame(){
        JFrame root = new JFrame("Acertijo");
        root.setBounds(100, 100, 600, 500);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return root;
    }
}
