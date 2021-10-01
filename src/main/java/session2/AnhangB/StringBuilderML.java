package session2.AnhangB;

public class StringBuilderML {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Wärme");
        sb = sb.delete(3,5).insert(2, "inte").deleteCharAt(1);
        System.out.println("sb = " + sb);
        // Ergebnis ist sb = Winter

        System.out.println("Step by step:");
        StringBuilder sb2 = new StringBuilder("Wärme");
        System.out.println("Start: " + sb2);
        StringBuilder sb3 = sb2.delete(3,5);
        System.out.println("sb3: delete(3,5) --> " + sb3);
        StringBuilder sb4 = sb3.insert(2, "inte");
        System.out.println("sb4: insert(2,'inte') --> " + sb4);
        StringBuilder sb5 = sb4.deleteCharAt(1);
        System.out.println("sb5: deleteCharAt(1) --> " + sb5);

    }
}
