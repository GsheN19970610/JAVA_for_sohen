package Day_9;

import javax.swing.*;

public class FormatFrame extends JFrame{
    JRadioButton[] teams = new JRadioButton[4];

    public FormatFrame(){
        super("Choose an Output Format");           //title
        setSize(320,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teams[0] = new JRadioButton("Atom");                        //四个选项
        teams[1] = new JRadioButton("RSS 0.92");
        teams[2] = new JRadioButton("RSS 1.0");
        teams[3] = new JRadioButton("RSS 2.0",true);        //默认选中这个

        JPanel panel = new JPanel();
        JLabel chooseLabel = new JLabel(
                "Choose an output format for syndicated news items."
        );
        panel.add(chooseLabel);
        ButtonGroup group = new ButtonGroup();                          //将选项分组 使选项互斥;
        for(JRadioButton team : teams){                                 //for循环将每个元素加入到按钮中，再加入到面板中
            group.add(team);
            panel.add(team);
        }
        add(panel);                                                     //最后将面板加入到框架中
        setVisible(true);
    }

    public static void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}
