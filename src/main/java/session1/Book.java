package session1;

public class Book {

    private int priceInEurCent;
    private String title;
    private String [] authors;
    private String isbn13;
    private int pages;
    public static int anzahlBücker = 0;

    // Konstruktor
    public Book(int priceInEurCent, String title, String[] authors, String isbn13, int pages) {
        this.priceInEurCent = priceInEurCent;
        this.title = title;
        this.authors = authors;
        this.isbn13 = isbn13;
        this.pages = pages;

        anzahlBücker++;

        System.out.println("this" +anzahlBücker +": " + this.getTitle().toString());
    }


    // Getter & Setter
    public int getPriceInEurCent() {
        return priceInEurCent;
    }

    public void setPriceInEurCent(int priceInEurCent) {
        this.priceInEurCent = priceInEurCent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void doSomething () {
        System.out.println("this in Methode doSomething" +anzahlBücker +": " + this.getTitle().toString());
    }

    public void reduceHitchikerPrice (Book book) {
        // Wir wollen den Preis auf 1€ reduzieren
        book.setPriceInEurCent(1);
        System.out.println("Book: " +book.title);
        System.out.println(book.priceInEurCent);
        System.out.println("this: " +this.title);
        System.out.println(this.priceInEurCent);



    }



}
