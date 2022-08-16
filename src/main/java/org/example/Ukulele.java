package org.example;

public class Ukulele extends MusicalInstrument {

    public Ukulele (String nameInstrument, String soundInstrument, String descInstrument, String historyInstrument) {
        super(nameInstrument, soundInstrument, descInstrument, historyInstrument);
    }
    @Override
    public void Sound() {
        System.out.println("Musical instrument sound: " + soundInstrument);
    }
}
