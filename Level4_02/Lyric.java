package Level4_02;

public class Lyric {

    private Phrase[] phrases;
    private int maxElements;
    private int index;
    private int chorusBeginningIndex;
    private int chorusEndIndex;

    public Lyric() {
        this.maxElements = 1000;
        phrases = new Phrase[maxElements];
        index = 0;
        chorusBeginningIndex = -1;
        chorusEndIndex = -1;
    }

    public boolean insertPhrase(Phrase phrase) {
        if (index < maxElements) {
            phrases[index] = phrase;
            index++;
            return true;
        }
        return false;
    }

    public void play() {
        for (int i = 0; i < index; i++) {
            showPhrases(i);
        }
        showChorus();
    }

    public void showChorus() {
        if (chorusBeginningIndex >= 0 && chorusEndIndex >= 0) {
            System.out.printf("\n");
            System.out.println("****** CHORUS ******");
            for (int i = chorusBeginningIndex; i <= chorusEndIndex; i++) {
                showPhrases(i);
            }
        }
    }

    public void showPhrases(int i) {
        if (!phrases[i].isBis()) {
            System.out.printf("Índice " + i + " - ");
            phrases[i].show();
        } else {
            System.out.printf("Índice " + i + " (bis) - ");
            phrases[i].show();
            System.out.printf("Índice " + i + " - ");
            phrases[i].show();
        }
    }

    public Phrase[] getPhrases() {
        return phrases;
    }

    public int getMaxElements() {
        return maxElements;
    }

    public int getIndex() {
        return index;
    }

    public int getChorusBeginningIndex() {
        return chorusBeginningIndex;
    }

    public int getChorusEndIndex() {
        return chorusEndIndex;
    }

    public void setChorus(int chorusBeginningIndex, int chorusEndIndex) {
        this.chorusBeginningIndex = chorusBeginningIndex;
        this.chorusEndIndex = chorusEndIndex;
    }
}
