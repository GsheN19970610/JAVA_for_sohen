package Day_11;

import javax.swing.*;
import java.awt.*;

public class Alphabet extends JFrame {
    public Alphabet(){
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360,120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Burglar");
        JButton c = new JButton("Corpse");
        JButton d = new JButton("Deadbeat");
        JButton e = new JButton("Evidence");
        JButton f = new JButton("Fugitive");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
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
        Alphabet frame = new Alphabet();
    }
}
