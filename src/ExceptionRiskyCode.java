public class ExceptionRiskyCode {

    private String name;

    // Konstruktor
    public ExceptionRiskyCode(String name) {
        this.name = name;
    }


    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void risikoEingehen() throws SchlimmeException {

        boolean alleHoffnungVerloren = true;

        if(alleHoffnungVerloren) {
            throw new SchlimmeException();
        }
    }



}
