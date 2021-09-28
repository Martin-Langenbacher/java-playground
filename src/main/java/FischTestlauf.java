public class FischTestlauf {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("===========>>>   Fisch   <<<==============");
        System.out.println("==========================================");
        System.out.println();


        Wal fisch1 = new Wal("Wal_eins", 30);
        System.out.println("Name: " + fisch1.getName() + "; Größe: " + fisch1.getGroesse());
        fisch1.schwimmen();
        fisch1.holeLuft();
        fisch1.ichSpringe();
        System.out.println();

        Delfin fisch2 = new Delfin(6);
        System.out.println("Name: " + fisch2.getName() + "; Größe: " + fisch2.getGroesse());
        fisch2.schwimmen();
        fisch2.holeLuft();
        fisch2.ichSpringe();
        System.out.println();

        Lachs fisch3 = new Lachs();
        System.out.println("Name: " + fisch3.getName() + "; Größe: " + fisch3.getGroesse());
        fisch3.schwimmen();
        fisch3.mitKiemenAtmen();
        System.out.println();

        Lachs fisch4 = new Lachs();
        System.out.println("Name: " + fisch3.getName() + "; Größe: " + fisch4.getGroesse());
        fisch3.schwimmen();
        fisch3.mitKiemenAtmen();
        System.out.println();

        System.out.print("Anzahl an Fischen: ");
        System.out.println(Fisch.anzahlFische());

        System.out.println();

        System.out.println("=====>>   Wal is 'instance of' Fisch:   <<=====");
        if (fisch1 instanceof Fisch) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("=====>>   Delfin (fisch2-Instanz) is 'instance of' Delfin:   <<=====");
        if (fisch2 instanceof Delfin) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Delfin ist Säugetier? " + (fisch2 instanceof Saeugetier));

    }
}
