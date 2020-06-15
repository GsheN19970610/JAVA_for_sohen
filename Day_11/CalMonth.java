package Day_11;


import com.sun.java.swing.plaf.motif.MotifInternalFrameTitlePane;

import javax.swing.*;
import java.awt.*;

public class CalMonth extends JFrame {
    JLabel[] days = new  JLabel[31];
    JLabel[] datTitles = new JLabel[7];
    JLabel monthTitle = new JLabel("June 2020");

    CalMonth(){
        super("Ocotber 2000");
        setSize(260,260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        JPanel titlePane = new JPanel();
        titlePane.setLayout(flow);
        titlePane.add(monthTitle);
        add(titlePane);
        JPanel monthPane = new JPanel();
        GridLayout calLayout =new GridLayout(6,7);
        monthPane.setLayout((calLayout));
        String[] datNames = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        for(int i = 0 ; i < days.length ; i++){
            days[i] = new JLabel(""+ (i+1));
            monthPane.add(days[i]);
        }
        add(monthPane);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] args) {
        CalMonth.setLookAndFeel();
        CalMonth cal = new CalMonth();
    }
}
