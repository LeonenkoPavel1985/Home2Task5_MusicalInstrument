package org.example;

public abstract class MusicalInstrument {
    String nameInstrument; // Наименование музыкального инструмента.
    String soundInstrument; // Звук музыкального инструмента.
    String descInstrument; // Описание музыкального инструмента.
    String historyInstrument; // История музыкального инструмента.

    public MusicalInstrument (String nameInstrument, String soundInstrument, String descInstrument, String historyInstrument) {
        this.nameInstrument = nameInstrument;
        this.soundInstrument = soundInstrument;
        this.descInstrument = descInstrument;
        this.historyInstrument = historyInstrument;
    }

    public abstract void Sound();

    public void Show() {
        System.out.println("Musical instrument name: " + nameInstrument);
    }

    public void Desc() {
        System.out.println("Description of the musical instrument: " + descInstrument);
    }

    public void History() {
        System.out.println("History of musical instrument: " + historyInstrument);
    }
}
