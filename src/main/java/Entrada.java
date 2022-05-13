import javax.swing.*;
import java.awt.*;

public class Entrada {
    public static void main(String[] args) {
        MainEvent pantalla = new MainEvent();
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MainEvent extends JFrame{

    JPanel panel;
    JPanel panel2;

    JButton BotonCF = new JButton("Chef", new ImageIcon("src/main/imagenes/chef.png"));
    JButton BotonWR = new JButton("Waiter", new ImageIcon("src/main/imagenes/waiter.png"));
    JButton BotonCT = new JButton("Client", new ImageIcon("src/main/imagenes/team.png"));
    JButton BotonAR = new JButton("Administrator", new ImageIcon("src/main/imagenes/working.png"));
    JLabel MainText = new JLabel("Kiezen");
    JLabel BothSideText = new JLabel(" © 5TAR RESTAURANT");

    public MainEvent(){
        setTitle("RE5TAURANT");
        setResizable(false);
        setBounds(280,175, 850, 400);
        setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
        setLayout(null);
        Toolkit miborde = Toolkit.getDefaultToolkit();
        Image micono = miborde.getImage("src/main/imagenes/restaurant.png");
        setIconImage(micono);

        //Texto superior & inferior
        MainText.setForeground(Color.decode("#D4AC0D"));
        MainText.setBounds(425, 5, 200, 70);
        MainText.setFont(new Font("Cinzel Decorative", Font.BOLD, 25));
        add(MainText);

        BothSideText.setForeground(Color.decode("#D4AC0D"));
        BothSideText.setBounds(425, 305, 200, 70);
        BothSideText.setFont(new Font("Arial", Font.BOLD, 10));
        add(BothSideText);

        //Paneles

        panel = new JPanel();
        panel.setBounds(0, 0, 850, 80);
        panel.setBackground(Color.decode("#17202A"));
        add(panel);

        panel2 = new JPanel();
        panel2.setBounds(0, 325, 850, 40);
        panel2.setBackground(Color.decode("#17202A"));
        add(panel2);

        //AJUSTES BOTONES

        BotonCF.setBounds(0, 85, 400, 130);
        BotonCF.setFont(new Font("Cinzel Decorative", Font.BOLD, 21));
        BotonCF.setBackground(Color.decode("#212F3C"));
        BotonCF.setForeground(Color.decode("#D4AC0D"));
        add(BotonCF);

        BotonWR.setBounds(0, 195, 400, 130);
        BotonWR.setBackground(Color.decode("#212F3C"));
        BotonWR.setFont(new Font("Cinzel Decorative", Font.BOLD, 21));
        BotonWR.setForeground(Color.decode("#D4AC0D"));
        add(BotonWR);


        BotonCT.setBounds(425, 85, 400, 130);
        BotonCT.setBackground(Color.decode("#212F3C"));
        BotonCT.setFont(new Font("Cinzel Decorative", Font.BOLD, 21));
        BotonCT.setForeground(Color.decode("#D4AC0D"));
        add(BotonCT);


        BotonAR.setBounds(425, 195, 400, 130);
        BotonAR.setBackground(Color.decode("#212F3C"));
        BotonAR.setFont(new Font("Cinzel Decorative", Font.BOLD, 21));
        BotonAR.setForeground(Color.decode("#D4AC0D"));
        add(BotonAR);



    }

}
