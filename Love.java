package Java.Love;

import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class Love
{
    public Love()
    {
        Random randomizador = new Random();


        JFrame primeiro = new JFrame("Primeiro");
        JLabel primeiroLabel = new JLabel(new ImageIcon("C:\\Users\\Pichau\\Pictures\\Love\\images (1).png"));
        primeiro.add(primeiroLabel);
        primeiro.setSize(300, 240);
        primeiro.setResizable(false);
        primeiro.setLocation(randomizador.nextInt(0, 1440), randomizador.nextInt(0, 900));
        primeiro.setUndecorated(true);
        primeiro.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        primeiro.setVisible(true);

        JFrame principal = new JFrame("Principal");
        JLabel principalLabel = new JLabel("Namora Comigo?");
        principal.add(principalLabel);
        principalLabel.setFont(new Font("Arial", Font.BOLD, 40));
        principal.setSize(400,100);
        principal.setLocationRelativeTo(null);
        principal.setUndecorated(true);
        principal.setVisible(true);
    }
}