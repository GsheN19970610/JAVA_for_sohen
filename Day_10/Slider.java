package Day_10;

import javax.swing.*;

public class Slider extends JFrame {
    public Slider(){
        super("Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pick = new JSlider(JSlider.HORIZONTAL,0,30,5);      //滑块方向：水平，最小值，最大值，初始值

        pick.setMajorTickSpacing(10);                   //主刻度线间隔
        pick.setMinorTickSpacing(1);                    //次刻度线间隔
        pick.setPaintTicks(true);                       //是否显示刻度线
        pick.setPaintLabels(true);                      //是否显示数字标签

        add(pick);
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
        Slider frame = new Slider();
    }
}
