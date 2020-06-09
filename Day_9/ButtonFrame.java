package Day_9;

import javax.swing.*;

public class ButtonFrame extends JFrame {
    JButton load = new JButton("load");
    JButton save = new JButton("save");
    JButton unsubscribe = new JButton("unsubscribe");

    public ButtonFrame(){                                   //
        super("Button Frame");
        setSize(340,170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //关闭框架时退出
        JPanel pane = new JPanel();
        pane.add(load);                 //加入三个按钮
        pane.add(save);
        pane.add(unsubscribe);
        add(pane);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        ButtonFrame buttonFrame = new ButtonFrame();
    }
}
