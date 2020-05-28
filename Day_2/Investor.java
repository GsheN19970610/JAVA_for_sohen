package Day_2;

public class Investor {
    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Original investment: $" + total);   //投资本金为14000美金
        total = total + (total * .4F);      //第一年增值百分之40  .4F指浮点数0.4
        System.out.println("After one year: $" + total);
        total = total - 1500F;              //减去1500（浮点数）
        System.out.println("After two years: $" + total);
        total = total + (total * .12F);     //两年之后，第三年增值百分之12
        System.out.println("After three years: $" + total);
    }
}