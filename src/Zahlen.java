public class Zahlen {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("==========>>>   Zahlen   <<<==============");
        System.out.println("==========================================");
        System.out.println();

        String number = "5";
        int arraySize = Integer.parseInt(number);
        int[] array = new int[arraySize];

        for (int i=0; i<arraySize; i++) {
            int zufallsZahl = (int)(Math.random() * 5) + 1;
            System.out.println("Position " +i +": " +zufallsZahl);
            array[i] = zufallsZahl;
        }

        System.out.println("Array-Length: " + array.length);
        int position = arraySize -1;
        System.out.println("The number at position " + position + " is " + array[position] + ".");

        int w = 0;
        for (int zelle : array ) {
            System.out.print("---" +zelle + "--->");
            System.out.print(zelle + ";; ==>");
            // FALSCH: System.out.print(array[zelle] + "; ");
            System.out.println(array[w]);
            w++;
        }
        System.out.println();
        System.out.print(array[0]);
        System.out.println();

        System.out.println("Cars: -->");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars ) {
            System.out.println(car);
        }



    }

}

