package session2;

public class Song implements Comparable<Song>{

    String titel;
    String künstler;
    String bewertung;
    String bpm;

    public Song(String titel, String künstler, String bewertung, String bpm) {
        this.titel = titel;
        this.künstler = künstler;
        this.bewertung = bewertung;
        this.bpm = bpm;
    }
    // NEW for HashSet
    public boolean equals(Object einSong) {
        Song s = (Song) einSong;
        return getTitel().equals(s.getTitel());
    }

    public int hashCode() {
        return titel.hashCode();
    }
    // =========================================================>> HashSet-End <==========

    public String getTitel() {
        return titel;
    }

    public String getKünstler() {
        return künstler;
    }

    public String getBewertung() {
        return bewertung;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return titel;
    }

    @Override
    public int compareTo(Song song) {
        return titel.compareTo(song.getTitel());
    }
}
