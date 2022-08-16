package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("VIOLIN.");
        Violin violin = new Violin("violin.", "violin sound.",
                "bowed musical instrument with four strings tuned in fifths: Gm D1 A1 E2.",
                "The violin was the result of the further development of such instruments as " +
                        "fidel (viela), lira da braccio and rebec.");
        violin.Show();
        violin.Sound();
        violin.Desc();
        violin.History();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------");

        System.out.println("TROMBONE.");
        Trombone trombone = new Trombone("trombone.", "trombone sound.",
                "european woodwind instrument. Consists of a long thin rolled metal tube with a " +
                        "retractable crown (scene), bell, mouthpiece.", "The trombone has been known " +
                "in Europe since the 15th century. It differs from other brass instruments in the presence of wings.");
        trombone.Show();
        trombone.Sound();
        trombone.Desc();
        trombone.History();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------");

        System.out.println("UKULELE.");
        Ukulele ukulele = new Ukulele("ukulele.", "ukulele sound.",
                "hawaiian four-string guitar used for chordal accompaniment of songs and solo playing.",
                "the ukulele appeared in the Hawaiian Islands in the second half of the 19th century, " +
                        "where it, under the name masheti da braa (port. machete da braa), was brought by the " +
                        "Portuguese from the island of Madeira.");
        ukulele.Show();
        ukulele.Sound();
        ukulele.Desc();
        ukulele.History();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------");

        System.out.println("CELLO.");
        Cello cello = new Cello("cello.", "cello sound.", "bowed musical " +
                "instrument with 4 strings tuned in fifths: Cb Gb Dm Am. In terms of pitch, it occupies an " +
                "intermediate position between a higher alto and a lower double bass.", "the appearance " +
                "of the cello dates back to the beginning of the 16th century. Initially, it was used as a bass " +
                "instrument to accompany singing or playing an instrument of a higher register.");
        cello.Show();
        cello.Sound();
        cello.Desc();
        cello.History();
    }
}