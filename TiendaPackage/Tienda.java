package TiendaPackage;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Tienda extends JFrame {
    private JPanel mainPanel;
    private JFrame ventana;
    private JLabel imagenFondo;

    public Tienda(){

        ventana = new JFrame("TiendaOnline");
        imagenFondo = new JLabel();
        imagenFondo.setIcon(new ImageIcon("fondo2.jpg"));

        ventana.setSize(300,400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setImage(imagenFondo);

        ventana.add(imagenFondo);

    }

    public void setImage(JLabel x){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double h = screen.getHeight();
        double w = screen.getWidth();
        int he = (int)h;
        int wi = (int)w;
        ImageIcon fondo = new ImageIcon("fondo2.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(wi,he,400));
        x.setIcon(icono);
        this.repaint();
    }

    public static void main(String[] args){
        Tienda x = new Tienda();
    }

}
