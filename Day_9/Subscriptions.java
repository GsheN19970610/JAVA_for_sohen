package Day_9;

import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"Burningbird","Freeform Goodness",
    "Ideoplex","Inessential","Interwingly","Now This",
    "Rasterweb","RC3","Whole Lotta Nothing","Workbench"};

    JList<String>subList = new JList<>(subs);               //创建一个指定类的数组

    public Subscriptions(){
        super("Subscriptions");
        setSize(150,335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscriptions: ");
        panel.add(subLabel);
        subList.setVisibleRowCount(5);                      //一次显示五项
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        add(panel);
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
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}
