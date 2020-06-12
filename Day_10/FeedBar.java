package Day_10;

import javax.swing.*;
import java.awt.*;

public class FeedBar extends JFrame {
    public FeedBar(){
        super("FeedBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        ImageIcon loadIcon = new ImageIcon("load.gif");                 //添加四个标签
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubIcon = new ImageIcon("unsubscribe.gif");

        JButton load = new JButton("load",loadIcon);                          //增加四个按钮
        JButton save = new JButton("save",saveIcon);
        JButton sub = new JButton("subscribe",subIcon);
        JButton unsub = new JButton("unsubscribe",unsubIcon);

        JToolBar bar = new JToolBar();

        bar.add(load);
        bar.add(save);
        bar.add(sub);
        bar.add(unsub);

        JTextArea edit = new JTextArea(8,40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North",bar);
        add("Center",scroll);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e){
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e );
        }
    }

    public static void main(String[] args) {
        FeedBar frame = new FeedBar();
    }
}
