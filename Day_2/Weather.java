package Day_2;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ..."); // 摄氏度转华氏度 先减去32
        fah = fah - 32;     //先减去32
        fah = fah / 9;      //然后除以9
        fah = fah * 5;      //然后乘以5         （F-32）/1.8
        System.out.println(fah + " degrees Celsius\n");


        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;      //   C*1.8+32
        System.out.println(cel + " degrees Fahrenheit");
    }
}