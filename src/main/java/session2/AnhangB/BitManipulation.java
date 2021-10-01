package session2.AnhangB;

public class BitManipulation {

    public static void main(String[] args) {

        int x = 10;
        System.out.println(x);
        binaerDarstellenVonInt("x: ", x);
        x = ~x;

        System.out.println(x);
        //binaerDarstellenVonByte("x: ", x);
        binaerDarstellenVonInt("x: ", x);

        int y = 6;
        // Und
        int aml = x & y;
        System.out.println("Und:");
        binaerDarstellenVonInt("x: ", x);
        binaerDarstellenVonInt("y: ", y);
        binaerDarstellenVonInt("a: ", aml);

        // Oder
        int bml = x | y;
        System.out.println("Oder:");
        binaerDarstellenVonInt("x: ", x);
        binaerDarstellenVonInt("y: ", y);
        binaerDarstellenVonInt("a: ", bml);

        // XOder - exklusives Oder
        int cml = x ^ y;
        System.out.println("XOder:");
        binaerDarstellenVonInt("x: ", x);
        binaerDarstellenVonInt("y: ", y);
        binaerDarstellenVonInt("a: ", cml);



        System.out.print(">>>===================================<<<");
        System.out.print(">>>===================================<<<");
        System.out.println(">>>===================================<<<");


        byte a = 0b00101011, b = (byte) 0b10110111;
        byte e;
        int e2;

        System.out.println("\na = " + a);
        binaerDarstellenVonByte("a = ", a);
        System.out.println("\nb = " + b);
        binaerDarstellenVonByte("b = ", b);

        e = (byte) ~a;
        System.out.println("\nEinerkomplement von a: ~a = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("~a         = ", e);

        e = (byte) (a & b);
        System.out.println("\nBitweises Und von a und b: a & b = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("b als Byte = ", b);
        binaerDarstellenVonByte("a & b      = ", e);

        e = (byte) (a | b);
        System.out.println("\nBitweises Oder von a und b: a | b = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("b als Byte = ", b);
        binaerDarstellenVonByte("a | b      = ", e);

        e = (byte) (a ^ b);
        System.out.println("\nBitweises Exklusiv-Oder von a und b: a ^ b = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("b als Byte = ", b);
        binaerDarstellenVonByte("a ^ b      = ", e);

        e = (byte) (a << 3);
        System.out.println("\nLinksschieben a um 3 Positionen: a << 3 = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("a << 3     = ", e);

        e = (byte) (a >> 3);
        System.out.println("\nArithm. Rechtsschieben a um 3 Pos.: a >> 3 = " + e);
        binaerDarstellenVonByte("a als Byte = ", a);
        binaerDarstellenVonByte("a >> 3     = ", e);

        e2 = a >>> 3;
        System.out.println("\nLog. Rechtsschieben a um 3 Pos.: a >>> 3 = " + e2);
        binaerDarstellenVonInt("a als Int  = ", a);
        binaerDarstellenVonInt("a >>> 3    = ", e2);

        System.out.println("\n ---");

        e = (byte) (b >> 3);
        System.out.println("\nArithm. Rechtsschieben b um 3 Pos.: b >> 3 = " + e);
        binaerDarstellenVonByte("b als Byte = ", b);
        binaerDarstellenVonByte("b >> 3     = ", e);

        e2 = b >> 3;
        System.out.println("\nArithm. Rechtsschieben b um 3 Pos.: b >> 3 = " + e2);
        binaerDarstellenVonInt("b als Int  = ", b);
        binaerDarstellenVonInt("b >> 3     = ", e2);

        e = (byte) (b >>> 3);
        System.out.println("\nLog. Rechtsschieben b um 3 Pos.: b >>> 3 = " + e);
        binaerDarstellenVonByte("b als Byte = ", b);
        binaerDarstellenVonByte("b >>> 3    = ", e);

        e2= b >>> 3 ;
        System.out.println("\nLog. Rechtsschieben b um 3 Pos.: b >>> 3 = " + e2);
        binaerDarstellenVonInt("b als Int  = ", b);
        binaerDarstellenVonInt("b >>> 3    = ", e2);

    }

    public static void binaerDarstellenVonByte (String text, byte zahl) {

        byte maske = 0b00000001;
        char[] bitfolge = new char[8];

        for (int i = 0; i < 8; i++)
        {
            bitfolge[7 - i] = (zahl & maske) == 0 ? '0' : '1';
            maske = (byte) (maske << 1);
        }

        System.out.print(text);
        System.out.println(bitfolge);
    }

    public static void binaerDarstellenVonInt (String text, int zahl) {

        int maske = 0b00000000000000000000000000000001;
        char[] bitfolge = new char[32];

        for (int i = 0; i < 32; i++)
        {
            bitfolge[31 - i] = (zahl & maske) == 0 ? '0' : '1';
            maske = maske << 1;
        }

        System.out.print(text);
        System.out.println(bitfolge);
    }




}
