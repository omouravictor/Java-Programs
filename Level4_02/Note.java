package Level4_02;

public class Note {

    private NoteName name;
    private Tone tone;
    private int duration;

    public Note() {
        name = NoteName.DÓ;
        tone = Tone.NATURAL;
        duration = 1;
    }

    public Note(NoteName name, Tone tone, int duration) {
        this.name = name;
        this.tone = tone;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " " + tone + " de " + duration + " tempo(s).";
    }

    public NoteName getName() {
        return name;
    }

    public void setName(NoteName name) {
        this.name = name;
    }

    public Tone getTone() {
        return tone;
    }

    public void setTone(Tone tone) {
        this.tone = tone;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
