package v1oop.practicum.practicum2b;

/*public class voetbal met de private attributen*/
public class Voetbalclub {
    private String club;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    /*public voetbalclu string*/
    public Voetbalclub(String cl) {
        club = cl;
    }
    /*public int aantalPunten met return*/
    public int aantalPunten() {
        return aantalGewonnen * 3 + aantalGelijk;
    }
    /*public int aantalGespeeld met return*/
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    /*public void verwerkresultaat*/
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    /*public string met return, door deze functie krijg je return club te zien met de gespeelde wedstrijden etc*/
    public String toString() {
        return club + "\t" + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}