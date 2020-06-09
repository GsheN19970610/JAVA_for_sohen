package Day_9;

import javax.swing.*;

public class DVR extends JFrame {
    JButton play = new JButton("播放");
    JButton stopEject = new JButton("停止/弹出");
    JButton rewind = new JButton("倒带");
    JButton fastForward =new JButton("快进");
    JButton pause = new JButton("暂停");

    public DVR(){                                   //
        super("DVR");
        setSize(540,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //关闭框架时退出
        JPanel pane = new JPanel();
        pane.add(play);                 //加入三个按钮
        pane.add(stopEject);
        pane.add(rewind);
        pane.add(fastForward);
        pane.add(pause);
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
        DVR dvr = new DVR();
    }
}
