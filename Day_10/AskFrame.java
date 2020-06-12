package Day_10;

import javax.swing.*;

public class AskFrame extends JFrame {
    public AskFrame(){
        super("shabi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider value = new JSlider(0,255,100);
        add(value);
        setSize(450,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        AskFrame af = new AskFrame();
    }
}
