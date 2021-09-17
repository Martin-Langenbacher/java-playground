public class BottleOfBeer {

    public static void main(String[] args) {

        System.out.println("Lyrics of the song 99 Bottles of Beer");

        for(int i=99; i > 1; i--) {
            System.out.println();
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            int b = i-1;

            if ( i > 2 ) {
                System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
            } else {
                System.out.println("Take one down and pass it around, " + b + " bottle of beer on the wall.");
            }
        }

        System.out.println();
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

    }

}
