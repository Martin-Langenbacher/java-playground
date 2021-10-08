package Entwurfsmuster.Observer;

public class WetterStation {

    public static void main(String[] args) {
        WetterDaten wetterDaten = new WetterDaten();

        AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);
        // StatistikAnzeige statistikAnzeige = new StatistikAnzeige(wetterDaten);
        // VorhersageAnzeige vorhersageAnzeige = new VorhersageAnzeige(wetterDaten);

        wetterDaten.setMesswerte(30, 65, 30.4f);
        wetterDaten.setMesswerte(32, 70, 29.2f);
        wetterDaten.setMesswerte(28, 90, 29.2f);

        //System.out.println(aktuelleAnzeige.toString());

    }



}
