package Day_11;

import javax.swing.*;
import java.awt.*;

public class ThreeButtons extends JFrame {
    public ThreeButtons(){
        super("Program");
        setSize(350,225);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton alpha = new JButton();
        JButton beta = new JButton();
        JButton gamma = new JButton();

        getContentPane().setLayout(new FlowLayout());

        add(alpha);
        add(beta);
        add(gamma);

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        ThreeButtons b3 = new ThreeButtons();
    }
}
