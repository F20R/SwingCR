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

    JButton BotonCF = new JButton("Chef", new ImageIcon("src/main/imagenes/chef.png"));
    JButton BotonWR = new JButton("Waiter", new ImageIcon("src/main/imagenes/waiter.png"));
    JButton BotonCT = new JButton("Client", new ImageIcon("src/main/imagenes/team.png"));
    JButton BotonAR = new JButton("Administrator", new ImageIcon("src/main/imagenes/working.png"));
    JLabel MainText = new JLabel("Kiezen");

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

        MainText.setForeground(Color.decode("#CFB617"));
        MainText.setBounds(425, 20, 200, 70);
        MainText.setFont(new Font("Cinzel Decorative", Font.BOLD, 18));
        add(MainText);

        panel = new JPanel();
        panel.setBounds(0, 0, 850, 80);
        panel.setBackground(Color.decode("#900C36"));
        add(panel);

        BotonCF.setBounds(225, 97, 200, 70);
        BotonCF.setFont(new Font("Cinzel Decorative", Font.BOLD, 18));
        BotonCF.setBackground(Color.decode("#263F87"));
        BotonCF.setForeground(Color.decode("#F0F3F4"));
        add(BotonCF);

        BotonWR.setBounds(225, 177, 200, 70);
        BotonWR.setFont(new Font("Cinzel Decorative", Font.BOLD, 18));
        BotonWR.setForeground(Color.decode("#10599E"));
        add(BotonWR);


        BotonCT.setBounds(500, 97, 200, 70);
        BotonCT.setFont(new Font("Cinzel Decorative", Font.BOLD, 18));
        BotonCT.setForeground(Color.decode("#10599E"));
        add(BotonCT);


        BotonAR.setBounds(500, 177, 200, 70);
        BotonAR.setFont(new Font("Cinzel Decorative", Font.BOLD, 18));
        BotonAR.setForeground(Color.decode("#10599E"));
        add(BotonAR);



    }

}
