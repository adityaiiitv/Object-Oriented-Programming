package pmj.ds.bst.bstbook;

public class Book implements Cloneable{

    Book(int isbn, String title, double price) {

    }
    public int getISBN(){
        return this.isbn;
    }

    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
    public void setISBN(int new_isbn){
        this.isbn = new_isbn;
    }
    public void setTitle(String new_title){
        this.title = new_title;
    }
    public void setPrice(double new_price){
        this.price = new_price;
    }

    @Override
    public String toString() {        
        return "[" + isbn + ", " + title + ", " + price +"]";
    }

    @Override
    public Book clone() {
       try {
            return (Book) super.clone();
       }
       catch (CloneNotSupportedException e) {
           return null;
       }
    }
    private int isbn;
    private String title;
    private double price;

}
