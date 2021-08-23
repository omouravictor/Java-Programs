package Level4_02;

public class Musics {

    private Lyric[] lyrics;
    private Melody[] melodies;
    private int maxMusics;
    private int index;

    public Musics() {
        this.maxMusics = 1000;
        lyrics = new Lyric[maxMusics];
        melodies = new Melody[maxMusics];
        index = 0;
    }

    public boolean insertMusic(Lyric lyric, Melody melody) {
        if (index < maxMusics) {
            lyrics[index] = lyric;
            melodies[index] = melody;
            index++;
            return true;
        }
        return false;
    }

    public void play() {
        for (int i = 0; i < index; i++) {
            System.out.println("*** MELODIA DA MUSICA " + (i + 1) + " ***");
            melodies[i].play();
            System.out.printf("\n");
            System.out.println("*** LETRA DA MUSICA " + (i + 1) + " ***");
            lyrics[i].play();
        }
    }

    public Lyric[] getLyrics() {
        return lyrics;
    }

    public Melody[] getMelodies() {
        return melodies;
    }

    public int getMaxMusics() {
        return maxMusics;
    }

    public int getIndex() {
        return index;
    }

}
