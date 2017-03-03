/**
 * Created by omayib on 04/03/17.
 */
public class OnlineShop {
    Book book;
    Guitar guitar;

    public OnlineShop() {
        book = new Book("Mengejar Matahari",45000);
        guitar = new Guitar("Gibson XG45",3000000);
    }

    public void sumOfBoughtItems(){
        double total = book.price+guitar.price;
        System.out.println("total of bought items are "+total);
    }
}
