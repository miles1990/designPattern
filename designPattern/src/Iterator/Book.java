package Iterator;

public class Book {
    private String ISBN;
    private String name;
    private double price;

    public Book(String ISBN, String name, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("ISBN="+ISBN+",name="+name+",price="+price);
    }
}
