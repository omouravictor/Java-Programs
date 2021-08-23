package Level4_02;

public class Editor {

    public static void main(String[] args) {

        Melody melody = new Melody();
        Note don = new Note(NoteName.DÓ, Tone.BEMOL, 1);
        Note re = new Note(NoteName.RÉ, Tone.SUSTENIDO, 1);
        Note mi = new Note(NoteName.MI, Tone.BEMOL, 1);
        Note fa = new Note(NoteName.FÁ, Tone.SUSTENIDO, 1);
        Note sol = new Note(NoteName.SOL, Tone.BEMOL, 1);
        Note la = new Note(NoteName.LÁ, Tone.SUSTENIDO, 1);
        Note si = new Note(NoteName.SI, Tone.BEMOL, 1);
        melody.insertNote(don);
        melody.insertbeatInterval(1);
        melody.insertNote(re);
        melody.insertbeatInterval(2);
        melody.insertNote(mi);
        melody.insertbeatInterval(1);
        melody.insertNote(fa);
        melody.insertbeatInterval(2);
        melody.insertNote(sol);
        melody.insertbeatInterval(1);
        melody.insertNote(la);
        melody.insertbeatInterval(2);
        melody.insertNote(si);
        melody.insertbeatInterval(1);

        Lyric lyric = new Lyric();
        Phrase p1 = new Phrase();
        Phrase p2 = new Phrase();
        Phrase p3 = new Phrase();
        p1.insertWord("Eu");
        p1.insertbeatInterval(1);
        p1.insertWord("estou");
        p1.insertbeatInterval(2);
        p1.insertWord("aqui");
        p1.insertbeatInterval(1);
        p1.setBis(true);
        p2.insertWord("Nao");
        p2.insertbeatInterval(1);
        p2.insertWord("estou");
        p2.insertbeatInterval(2);
        p2.insertWord("aqui");
        p2.insertbeatInterval(1);
        p3.insertWord("Sempre");
        p3.insertbeatInterval(1);
        p3.insertWord("estarei");
        p3.insertbeatInterval(2);
        p3.insertWord("aqui");
        p3.insertbeatInterval(1);
        lyric.insertPhrase(p1);
        lyric.insertPhrase(p2);
        lyric.insertPhrase(p3);
        lyric.setChorus(2, 2);

        Musics m = new Musics();
        m.insertMusic(lyric, melody);
        m.play();
    }
}
