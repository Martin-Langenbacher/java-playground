package session2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox5().los();
    }

    class KünstlerVergleich implements Comparator<Song> {
        public int compare(Song eins, Song zwei) {
            return eins.getKünstler().compareTo(zwei.getKünstler());
        }
    }

    public void los() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        KünstlerVergleich künstlerVergleich = new KünstlerVergleich();
        Collections.sort(songList, künstlerVergleich);
    }

    void getSongs() {
        try {
            File datei = new File("/Users/martin/Lernen/Markus/java-playground/src/main/java/session2/SongListPlus.txt");
            BufferedReader reader = new BufferedReader(new FileReader(datei));
            String zeile = null;
            while ((zeile = reader.readLine()) != null) {
                addSong(zeile);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    void addSong(String zuParsendeZeile) {
        String[] tokens = zuParsendeZeile.split("/");

        Song nächsterSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nächsterSong);
    }


}
