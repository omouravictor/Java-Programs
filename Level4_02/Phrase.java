package Level4_02;

public class Phrase {

    private Object[] wordsAndbeatIntervals;
    private boolean bis;
    private int maxElements;
    private int index;

    public Phrase() {
        this.maxElements = 1000;
        wordsAndbeatIntervals = new Object[maxElements];
        bis = false;
        index = 0;
    }

    public boolean insertWord(String word) {
        if (index < maxElements) {
            wordsAndbeatIntervals[index] = word;
            index++;
            return true;
        }
        return false;
    }

    public boolean insertbeatInterval(int beatIntervalValue) {
        if (index < maxElements) {
            wordsAndbeatIntervals[index] = beatIntervalValue;
            index++;
            return true;
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            if (wordsAndbeatIntervals[i] instanceof Number) {
                System.out.printf("(" + wordsAndbeatIntervals[i] + ") ");
            } else {
                System.out.printf(wordsAndbeatIntervals[i] + " ");
            }
        }
        System.out.printf("\n");
    }

    public Object[] getwordsAndbeatIntervals() {
        return wordsAndbeatIntervals;
    }

    public int getMaxElements() {
        return maxElements;
    }

    public int getIndex() {
        return index;
    }

    public boolean isBis() {
        return bis;
    }

    public void setBis(boolean bis) {
        this.bis = bis;
    }

}
