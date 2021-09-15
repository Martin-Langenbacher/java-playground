public class ExceptionMyCode {

    public static void daumenDrücken() {

        try {
            einObjekt.risikoEingehen();
        } catch (SchlimmeException ex) {
            System.out.println("Aaaargh!");
            ex.pritStackTrace();
        }
    }
}
