//Example of Getter
 class Book {
    private String title;
    private String author;
    private int pages;
    private int price;

    public Book(String title, String author, int pages, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public int getPrice() {
        return price;
    }
}
 class Main{
public static void main(String[] args) {

    Book book = new Book("12th fail", "Anurag Pathak", 224, 130 );
 System.out.println(book.getTitle());
System.out.println(book.getAuthor());
System.out.println(book.getPages());
System.out.println(book.getPrice());
}
}