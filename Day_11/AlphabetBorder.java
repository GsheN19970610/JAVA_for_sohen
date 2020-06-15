package Day_11;

import javax.swing.*;
import java.awt.*;

public class AlphabetBorder extends JFrame {
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton east = new JButton("East");
    JButton west = new JButton("West");
    AlphabetPanel alpha = new AlphabetPanel();

    AlphabetBorder(){
        super("AlphebetBorder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240,280);
        JPanel pane = new JPanel();

        pane.setLayout(new BorderLayout());

        pane.add("North",north);
        pane.add("South",south);
        pane.add("East",east);
        pane.add("West",west);
        pane.add("Center",alpha);
        setContentPane(pane);
    }

    public static void main(String[] args) {
        JFrame frame = new AlphabetBorder();
        frame.show();
    }
}

class AlphabetPanel extends JPanel {
    JButton a = new JButton("Alibi");
    JButton b = new JButton("Burglar");
    JButton c = new JButton("Corpse");
    JButton d = new JButton("Deadbeat");
    JButton e = new JButton("Evidence");
    JButton f = new JButton("Fugitive");

    AlphabetPanel(){
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
    }
}
