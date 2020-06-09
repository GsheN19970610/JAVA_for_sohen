package Day_9;

import javax.swing.*;

public class IconFrame extends JFrame {
    JButton load ,save, subscribe , unsubscribe;

    public IconFrame(){
        super("Icon Frame");                        //标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                 //关闭框架时退出
        JPanel panel = new JPanel();            //创建一个新容器

        ImageIcon loadIcon = new ImageIcon("load.gif");                     //创建标签,图片需要自己在文件夹里面添加
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");

        load = new JButton("Load",loadIcon);                    //创建按钮
        save = new JButton("Save",saveIcon);
        subscribe = new JButton("Subscribe",subscribeIcon);
        unsubscribe = new JButton("Unsubscribe",unsubscribeIcon);

        panel.add(load);                            //将按钮加入容器
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);

        add(panel);                                 //加入容器
        pack();
        setVisible(true);                           //框架可见

    }

    public static void main(String[] args) {
        IconFrame ike = new IconFrame();
    }
}
