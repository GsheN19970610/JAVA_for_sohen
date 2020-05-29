package Day_6;

public class GiftShop {
    public static void main(String[] args) {
        Storefront store = new Storefront();                                  //添加一个Storefront类 store
        store.addItem("C01","MUG","9.99","150");        //添加了四个Item
        store.addItem("C02","LG MUG","12.99","82");
        store.addItem("C03","MOUSEPAD","10.49","800");
        store.addItem("D01","T SHIRT","16.99","90");
        store.sort();                                               //排序，在Item中设置，以price的值进行排序

        for(int i = 0; i < store.getSize() ; i++)
        {
            Item show = (Item)store.getItem(i);                     //getItem在Storefront十三行有定义
            System.out.println("\nItem ID: " + show.getId() +       //Item 37 行后定义
                    "\nName: " + show.getName() +
                    "\nRetail Price: " + show.getRetail() +
                    "\nprice: " + show.getPrice() +
                    "\nquant: " + show.getQuantity());
        }
    }
}
