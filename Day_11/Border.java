package Day_11;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    public Border(){
        super("Border");
        setSize(240,280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setLayout(new BorderLayout());

        JButton nButton = new JButton("North");
        JButton sButton = new JButton("South");
        JButton eButton = new JButton("East");
        JButton wButton = new JButton("West");
        JButton cButton = new JButton("Center");

        add(nButton,BorderLayout.NORTH);
        add(sButton,BorderLayout.SOUTH);
        add(eButton,BorderLayout.EAST);
        add(wButton,BorderLayout.WEST);
        add(cButton,BorderLayout.CENTER);

        setVisible(true);

    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exception){
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exception);
        }
    }

    public static void main(String[] args) {
        Border Frame = new Border();
    }
}
