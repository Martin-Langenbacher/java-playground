package Entwurfsmuster.Observer;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {
    private float temperature;
    private float feuchtigkeit;
    private Subjekt wetterDaten;

    public AktuelleBedingungenAnzeige(Subjekt wetterDaten) {
        this.wetterDaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }



    @Override
    public void aktualisieren(float temp, float feucht, float druck) {
        this.temperature = temp;
        this.feuchtigkeit = feucht;
        anzeigen();
    }


    @Override
    public void anzeigen() {
        System.out.println("Aktuelle Wetterbedingungen. " + temperature + " Grad C und " + feuchtigkeit +"% Luftfeuchtigkeit. Mit/Max/Min Temperatur = " );
    }

}
