package Level4_02;

public class Melody {

    private Object[] notesAndbeatIntervals;
    private int maxElements;
    private int index;

    public Melody() {
        this.maxElements = 1000;
        notesAndbeatIntervals = new Object[maxElements];
        index = 0;
    }

    public boolean insertNote(Note note) {
        if (index < maxElements) {
            notesAndbeatIntervals[index] = note;
            index++;
            return true;
        }
        return false;
    }

    public boolean insertbeatInterval(int beatIntervalValue) {
        if (index < maxElements) {
            notesAndbeatIntervals[index] = beatIntervalValue;
            index++;
            return true;
        }
        return false;
    }

    public void play() {
        for (int i = 0; i < index; i++) {
            if (notesAndbeatIntervals[i] instanceof Note) {
                Note note = (Note) notesAndbeatIntervals[i];
                System.out.println(note.toString());
            } else if (notesAndbeatIntervals[i] != null) {
                System.out.println("INTERVALO DE TEMPO de " + notesAndbeatIntervals[i] + " tempo(s)");
            }
        }
    }

    public int addFullMelody(Melody melody) {
        if (maxElements - index >= melody.index) {
            System.arraycopy(melody.notesAndbeatIntervals, 0,
                    this.notesAndbeatIntervals, index, melody.index);
            index += melody.index;
            return 0;
        }
        return -1;
    }

    public int addMelodyPiece(Melody melody, int firstElementIndex, int lastElementIndex) {
        if (firstElementIndex >= 0 && lastElementIndex >= 0) {
            if (maxElements - index >= (lastElementIndex - firstElementIndex) + 1) {
                System.arraycopy(melody.notesAndbeatIntervals, firstElementIndex,
                        this.notesAndbeatIntervals, index, (lastElementIndex - firstElementIndex) + 1);
                index += (lastElementIndex - firstElementIndex) + 1;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    public Object[] getNotesAndbeatIntervals() {
        return notesAndbeatIntervals;
    }

    public int getMaxElements() {
        return maxElements;
    }

    public int getIndex() {
        return index;
    }

}
