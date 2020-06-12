package Day_10;


import javax.swing.*;
import java.awt.*;

public class FeedInfo extends JFrame {
    private JLabel nameLabel = new JLabel("Name: ",
            SwingConstants.RIGHT);
    private JTextField name;
    private JLabel urlLabel = new JLabel("URL: ",
            SwingConstants.RIGHT);
    private JTextField url;
    private JLabel typeLabel = new JLabel("Type: ",
            SwingConstants.RIGHT);

    private JTextField type;

    public FeedInfo(){
        super("Feed Information");
        setSize(400,145);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        String response1 = JOptionPane.showInputDialog(null,"Enter the site address:");
        //null指框架显示在中央
        name = new JTextField(response1,20);        //输入框

        String response2 = JOptionPane.showInputDialog(null,
                "Enter the site address: ");
        url = new JTextField(response2,20);

        String[] choices = {"Persinal","Commercial","Unknown" };
        int response3 = JOptionPane.showOptionDialog(null,
                "What type of site is it?",
                "Site Type",
                0,           //设置三个按钮
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,                //选项
                choices[0]);            //指进入后默认选项为第一个
        type = new JTextField(choices[response3],20);

        setLayout(new GridLayout(3,2));
        add(nameLabel);
        add(name);
        add(urlLabel);
        add(url);
        add(typeLabel);
        add(type);
        setLookAndFeel();
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
        FeedInfo frame = new FeedInfo();
    }
}
