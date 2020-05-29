package Day_6;

public class Item2 implements Comparable{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private final boolean noDiscount;                 //布尔常量noDiscount

    Item2(String idIn , String nameIn , String retailIn , String qIn,String discountIn){       //增加noDiscount
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);
        noDiscount = discountIn.equals("TRUE");                 //noDiscount变量的值为（布尔值discountIn是否等于”TRUE“）

        if(quantity > 400)
            price = retail * .5D;       //五折 D为Double
        else if (quantity > 200)
            price = retail * .6D;       //六折
        else
            price = retail * .7D;       //7折
        price = Math.floor( price * 100 + .5)/100;
        if (noDiscount){                                        //增加noDiscount变量的判断（即discount是否为TRUE）
            price = retail;
        }
    }

    public int compareTo(Object obj){
        Item2 temp =(Item2)obj;                                //此处引用Item2
        if(this.price < temp.price){
            return 1;
        }else if(this.price > temp.price){
            return -1;
        }
        return 0;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getRetail(){
        return retail;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}
