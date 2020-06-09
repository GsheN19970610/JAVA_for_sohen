package Day_9;

import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame() {
        super("Frame Title");                       //标题
        setSize(300, 100);                  //设置窗口大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //框架关闭的时候退出程序
        setDefaultLookAndFeelDecorated();
        setVisible(true);                       //设置框架可见

    }

    private static void setDefaultLookAndFeelDecorated(){
            try{
                UIManager.setLookAndFeel(                                               //设置UI，框架格式
                        "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                );
            }catch (Exception exc){

            }
    }


    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated();
        SimpleFrame sf = new SimpleFrame();
    }
}
