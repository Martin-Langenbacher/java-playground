package session5;

public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("Builder-Pattern");

        // Complex Builder API (nicht zu verwechseln mit dem Builder-Pattern)
        Car einAuto = Car.newBuilder().brand("VW").color("rot").build();
        Car zweitesAuto = Car.newBuilder().model("911").price(200000).brand("Porsche").color("grasgrün").build();

        // Important!
        // We have no car instance - therefore it has to be a static method!
        System.out.println("Mein Auto ist von: " + einAuto.getBrand());
        System.out.println("Unser Auto hat die Farbe: " +zweitesAuto.getColor());
        System.out.println(zweitesAuto.toString());

    }
}
