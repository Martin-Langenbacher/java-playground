package session3.abstraction;

public class Main {

    public static void main(String[] args) {
        //CarReader carReader = new CarReaderCsv();
        CarReader carReader = new CarReaderJson();
        DataImporter importer = new DataImporter(carReader);
        importer.doImport();
    }
}
