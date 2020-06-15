package Day_11;

import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame(){
        super("Survey");
        setSize(290,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        SurveyWizard wiz =new SurveyWizard();
        add(wiz);
        setVisible(true);
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exception){
            System.err.println("Couldn't use the system "
                    + "look and feel: " + exception);
        }
    }

    public static void main(String[] args) {
        SurveyFrame surv = new SurveyFrame();
    }
}
