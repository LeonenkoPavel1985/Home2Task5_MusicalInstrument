package org.example;

public class Cello extends MusicalInstrument {

    public Cello (String nameInstrument, String soundInstrument, String descInstrument, String historyInstrument) {
        super(nameInstrument, soundInstrument, descInstrument, historyInstrument);
    }
    @Override
    public void Sound() {
        System.out.println("Musical instrument sound: " + soundInstrument);
    }
}
