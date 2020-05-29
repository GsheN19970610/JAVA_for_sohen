package Day_6;

import java.util.*;

public class Storefront {
    private LinkedList catalog = new LinkedList();                      //创建一个私有链表 catalog

    public void addItem(String id,String name,String price, String quant){
        Item it = new Item(id , name , price , quant);
        catalog.add(it);
    }

    public Item getItem(int i){
        return (Item) catalog.get(i);
    }

    public int getSize(){
        return catalog.size();                                          //返回尺寸
    }

    public void sort(){
        Collections.sort(catalog);                                      //sort，按照折扣后售价排序
    }
}
