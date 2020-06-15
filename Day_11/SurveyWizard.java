package Day_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyWizard extends JPanel implements ActionListener {
    int currentCard = 0;
    CardLayout cards = new CardLayout();
    SurveyPanel[] ask = new SurveyPanel[3];

    public SurveyWizard() {
        super();
        setSize(240, 140);
        setLayout(cards);
        // set up survey
        String question1 = "What is your gender?";
        String[] resp1 = { "female", "male", "not telling" };
        ask[0] = new SurveyPanel(question1, resp1, 2);
        String question2 = "What is your age?";
        String[] resp2 = { "Under 25", "25-34", "35-54",
                "Over 54" };
        ask[1] = new SurveyPanel(question2, resp2, 1);
        String question3 = "How often do you exercise each week?";
        String[] resp3 = { "Never", "1-3 times", "More than 3" };
        ask[2] = new SurveyPanel(question3, resp3, 1);
        ask[2].setFinalQuestion(true);
        addListeners();
    }

    private void addListeners() {
        for(int i = 0; i < ask.length; i++) {
            ask[i].nextButton.addActionListener(this);
            ask[i].finalButton.addActionListener(this);
            add(ask[i],"Card " + i);
            //这个代码这行巨坑爹，Card后面不能少空格，要跟下面actionPerformede里面的name对应

        }
    }



    public void actionPerformed(ActionEvent evt){
        currentCard++;
        if (currentCard >= ask.length){
            System.exit(0);
        }
        cards.show(this,"Card "+ currentCard);
    }
}

class SurveyPanel extends JPanel{
    JLabel question;
    JRadioButton[] response;
    JButton nextButton = new JButton("Next");
    JButton finalButton = new JButton("Finish");

    SurveyPanel(String ques,String[] resp,int def){
        super();
        setSize(160,110);
        question = new JLabel(ques);
        response = new JRadioButton[resp.length];
        JPanel sub1 = new JPanel();
        ButtonGroup group = new ButtonGroup();
        JLabel quesLabel = new JLabel(ques);
        sub1.add(quesLabel);
        JPanel sub2 = new JPanel();
        for (int i = 0;i < resp.length ; i++){
            if(def == i){
                response[i] = new JRadioButton(resp[i],true);
            }else {
                response[i] = new JRadioButton(resp[i],false);
            }
            group.add(response[i]);
            sub2.add(response[i]);
        }

        JPanel sub3 = new JPanel();
        nextButton.setEnabled(true);
        sub3.add(nextButton);
        finalButton.setEnabled(false);
        sub3.add(finalButton);
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        add(sub1);
        add(sub2);
        add(sub3);
    }

    void setFinalQuestion(boolean finalQuestion){
        if(finalQuestion){
            nextButton.setEnabled(false);
            finalButton.setEnabled(true);
        }
    }
}