package org.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplicación con jpanel.form y GridLayout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Jpanel formulario = new Jpanel();


            frame.setContentPane(formulario.getRootPanel());


            frame.pack();
            frame.setVisible(true);
        });
    }
}
