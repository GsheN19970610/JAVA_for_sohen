package Day_9;

import javax.swing.*;

public class Authenticator extends javax.swing.JFrame {
    JTextField username = new JTextField(15);                       //空文本编辑框
    JPasswordField password = new JPasswordField(15);               //密码框（输入的字符会被隐藏）
    JTextArea comments = new JTextArea(4,15);                  //一个大的文本编辑框（此处4行）
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator(){
        super("Account Information");
        setSize(300,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        comments.setLineWrap(true);                     //自动换行
        comments.setWrapStyleWord(true);                //一个单词长度过长的时候自动把这个单词移到下一行

        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentsLabel);
        pane.add(comments);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
        password.setEchoChar('#');                      //密码框输入的以“#”代替，默认为*
        setVisible(true);           //显示窗体
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exception){
            System.out.println("exc.getMessage");
        }
    }

    public static void main(String[] args) {
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}

