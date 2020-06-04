package Day_8;

import java.util.HashMap;

public class ComicBooks {
    public ComicBooks(){
    }



    public static void main(String[] args) {
        HashMap quality = new HashMap();            //设置新的哈希表
        float price1 = 3.00F;
        quality.put("mint",price1);                 //通过quality，新旧程度，计算价格（基价basePrice的N倍）
        float price2 = 2.00F;
        quality.put("near mint",price2);
        float price3 = 1.50F;
        quality.put("very fine",price3);
        float price4 = 1.00F;
        quality.put("fine",price4);
        float price5 = 0.50F;
        quality.put("good",price5);
        float price6 = 0.25F;
        quality.put("poor",price6);
        Comic[] comix = new Comic[3];
        comix[0] = new Comic("Amazing Sprder-Man","1A","VERY FINE",12_000.00F);
        comix[1].setPrice( (Float) quality.get(comix[1].condition) );       //设置价格方法（基价乘以质量倍数）
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice( (Float) quality.get(comix[2].condition) );
    }
}


class Comic{
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic(String inTitle,String inIssueNumber , String inCondition,
          float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor){
        price = basePrice * factor;
    }
}
