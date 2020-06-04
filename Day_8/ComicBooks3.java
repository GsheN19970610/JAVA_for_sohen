package Day_8;

import java.util.HashMap;

public class ComicBooks3 {

    public ComicBooks3() {
    }

    public static void main(String[] arguments) {
        
        HashMap quality = new HashMap();
        quality.put(Condition.PRISTINE_MINT, 5.00F);            //枚举引用
        quality.put(Condition.MINT, 3.00F);
        quality.put(Condition.NEAR_MINT, 2.00F);
        quality.put(Condition.VERY_FINE, 1.50F);
        quality.put(Condition.FINE, 1.00F);
        quality.put(Condition.GOOD, 0.50F);
        quality.put(Condition.POOR, 0.25F);
        quality.put(Condition.COVERLESS, 0.10F);
        
        Comic3[] comix = new Comic3[5];
        comix[0] = new Comic3("Amazing Spider-Man", "1A", Condition.VERY_FINE,
                5_000.00F);
        comix[0].setPrice( (Float) quality.get(comix[0].condition) );
        comix[1] = new Comic3("Incredible Hulk", "181", Condition.NEAR_MINT,
                240.00F);
        comix[1].setPrice( (Float) quality.get(comix[1].condition) );
        comix[2] = new Comic3("Cerebus", "1A", Condition.GOOD, 144.00F);
        comix[2].setPrice( (Float) quality.get(comix[2].condition) );
        comix[3] = new Comic3("Prez", "1", Condition.PRISTINE_MINT, 30.00F);
        comix[3].setPrice( (Float) quality.get(comix[3].condition) );
        comix[4] = new Comic3("Night Nurse", "1", Condition.COVERLESS, 22.00F);
        comix[4].setPrice( (Float) quality.get(comix[4].condition) );
        for (Comic3 comix1 : comix) {                             //comix1 接收每个comic的值
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
        }
    }
}

class Comic3 {
    String title;
    String issueNumber;
    Condition condition;
    float basePrice;
    float price;

    Comic3(String inTitle, String inIssueNumber, Condition inCondition,
           float inBasePrice) {

        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

enum Condition {        //枚举方法
    PRISTINE_MINT,
    MINT,
    NEAR_MINT,
    VERY_FINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS
}
