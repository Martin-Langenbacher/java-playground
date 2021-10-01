package session2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox3().los();
    }

    public void los() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
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
