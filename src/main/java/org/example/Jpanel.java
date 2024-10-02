package org.example;
import javax.swing.*;
import java.awt.*;

public class Jpanel {
    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public Jpanel() {
        // Configurar el GridLayout con 1 fila y 5 columnas
        rootPanel.setLayout(new GridLayout(1, 5));

        // Asignar texto a los botones (si no lo has hecho en el archivo .form)
        button1.setText("Botón 1");
        button2.setText("Botón 2");
        button3.setText("Botón 3");
        button4.setText("Botón 4");
        button5.setText("Botón 5");
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
