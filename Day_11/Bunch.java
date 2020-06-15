package Day_11;


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Bunch extends JFrame {
    public Bunch(){
        super("Bunch");
        setSize(260,260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JPanel pane = new JPanel();
        GridLayout family = new GridLayout(3,3,10,10);
        pane.setLayout(family);
        JButton marcia = new JButton("Marcia");
        JButton carol = new JButton("Carol");
        JButton greg = new JButton("Greg");
        JButton jan = new JButton("Jan");
        JButton alice = new JButton("Alice");
        JButton peter = new JButton("Peter");
        JButton cindy = new JButton("Cindy");
        JButton mike = new JButton("Mike");
        JButton bobby = new JButton("Bobby");
        pane.add(marcia);
        pane.add(carol);
        pane.add(greg);
        pane.add(jan);
        pane.add(alice);
        pane.add(peter);
        pane.add(cindy);
        pane.add(mike);
        pane.add(bobby);
        add(pane);
        setVisible(true);
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exception){
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exception);
        }
    }

    public static void main(String[] args) {
        Bunch frame = new Bunch();
    }
}
