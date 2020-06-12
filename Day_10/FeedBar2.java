package Day_10;

import com.sun.jmx.mbeanserver.JmxMBeanServer;

import javax.swing.*;
import java.awt.*;

public class FeedBar2 extends JFrame {
    public FeedBar2(){
        super("FeedBar2");
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

        JMenuItem j1 = new JMenuItem("Load");
        JMenuItem j2 = new JMenuItem("Save");
        JMenuItem j3 = new JMenuItem("Subscribe");
        JMenuItem j4 = new JMenuItem("Unsubscribe");

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Feeds");

        menu.add(j1);
        menu.add(j2);

        menu.addSeparator();                        //分隔条

        menu.add(j3);
        menu.add(j4);
        menubar.add(menu);

        JTextArea edit = new JTextArea(8,40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North",bar);
        add("Center",scroll);

        setJMenuBar(menubar);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e){
            System.err.println("Couldn't use the system "
                    + "look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        FeedBar2 frame = new FeedBar2();
    }
}
