package Day_6;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront2 {
    private LinkedList catalog = new LinkedList();                      //创建一个私有链表 catalog

    public void addItem(String id,String name,String price, String quant,String discount){
        Item2 it = new Item2(id , name , price , quant , discount);
        catalog.add(it);
    }

    public Item2 getItem(int i){
        return (Item2) catalog.get(i);
    }

    public int getSize(){
        return catalog.size();                                          //返回尺寸
    }

    public void sort(){
        Collections.sort(catalog);                                      //sort，按照折扣后售价排序
    }
}
