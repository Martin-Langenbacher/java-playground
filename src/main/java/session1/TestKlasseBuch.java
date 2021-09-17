package session1;

public class TestKlasseBuch {

    public static void main(String[] args) {

        Book book1 = new Book(1259, "The Hitchhikers Guide to the Galaxy", new String[]{"Douglas Adams"}, "978-0575115347", 192);
        Book book2 = new Book(2967, "Seven Languages in Seven Weeks", new String[]{"Bruce A. Tate"}, "978-1934356593", 330);


        System.out.println("Book1: " + book1.getTitle());
        System.out.println("Anzahl der Seiten von Book2: " + book2.getPages());

        book1.doSomething();
        //Book.doSomething();  // Funktionert nur, falls die Methode static ist!

        System.out.println("Anzahl der Bücker (main): " + Book.anzahlBücker);

        Book.anzahlBücker++;
        System.out.println("Anzahl der Bücker (main): " + Book.anzahlBücker);

        // This in der Methode ist, was links steht!
        book1.reduceHitchikerPrice(book2);
    }


}
