package Day_8;

import java.util.HashMap;

public class ComicBooks2 {
    public ComicBooks2() {
    }


    public static void main(String[] args) {
        HashMap quality = new HashMap();
        quality.put("pristine mint", 5.00F);        //加入的
        quality.put("mint", 3.00F);
        quality.put("near mint", 2.00F);
        quality.put("very fine", 1.50F);
        quality.put("fine", 1.00F);
        quality.put("good", 0.50F);
        quality.put("poor", 0.25F);
        quality.put("coverless", 0.10F);            //加入的
        Comic[] comix = new Comic[5];
        comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",
                5_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",
                240.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2] = new Comic("Cerebus", "1A", "good", 144.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        comix[3] = new Comic("Prez", "1", "pristine mint", 30.00F);
        comix[3].setPrice((Float) quality.get(comix[3].condition));
        comix[4] = new Comic("Night Nurse", "1", "coverless", 22.00F);
        comix[4].setPrice((Float) quality.get(comix[4].condition));
        for (Comic comix1 : comix) {
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");

        }

    }
}
