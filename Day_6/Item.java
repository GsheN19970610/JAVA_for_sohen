package Day_6;

import java.lang.Comparable.*;

public class Item implements Comparable{            //Item类实现了一个接口Comparable，这个接口只有一个方法就是compareTo（Object），返回一个整数（在27行之后）
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;

    Item(String idIn , String nameIn , String retailIn ,String qIn){       //Item接受四个String参数，用来设置实例变量，后两个使用类方法转化为数值
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);

        if(quantity > 400)
            price = retail * .5D;       //五折 D为Double
        else if (quantity > 200)
            price = retail * .6D;       //六折
        else
            price = retail * .7D;       //7折
        price = Math.floor( price * 100 + .5)/100;                          //Math.floor去小数，向下取整
    }

    public int compareTo(Object obj){                                       // Object类是所有类的父类
        Item temp =(Item)obj;                                               //设置实例变量temp
        if(this.price < temp.price){                                        //排序对象比较方法,以price排序
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
