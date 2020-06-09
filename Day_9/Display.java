package Day_9;

import javax.swing.*;

public class Display extends JFrame {
    public Display(){
        super("Display");
        setSize(300,200);
        JLabel hello = new JLabel("Hello");
        JPanel pane = new JPanel();
        add(hello);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Display ds = new Display();
    }
}
