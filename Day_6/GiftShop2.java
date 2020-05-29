package Day_6;

public class GiftShop2 {
    public static void main(String[] args) {
        Storefront2 store = new Storefront2();     //此处注意，Item方法结构变化，如果仍调用之前的，会报错
        store.addItem("C01","MUG","9.99","150","TRUE");        //相比之下，增加了一个条目discount
        store.addItem("C02","LG MUG","12.99","82","FALSE");
        store.addItem("C03","MOUSEPAD","10.49","800","FALSE");
        store.addItem("D01","T SHIRT","16.99","90","TRUE");
        store.sort();

        for(int i = 0; i < store.getSize() ; i++)
        {
            Item2 show = (Item2)store.getItem(i);                     //此处Item2
            System.out.println("\nItem ID: " + show.getId() +
                    "\nName: " + show.getName() +
                    "\nRetail Price: " + show.getRetail() +
                    "\nprice: " + show.getPrice() +
                    "\nquant: " + show.getQuantity());
        }
    }
}
