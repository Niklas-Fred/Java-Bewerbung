package AktienportfolioManager;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Aktie> aktienListe = new ArrayList<Aktie>();

    public void aktieHinzufuegen(Aktie aktie) {
        aktienListe.add(aktie);
        System.out.println(aktie.getName() + "wurde hinzugefuegt");
    }

    public void portfolioAnzeigen() {
        if (aktienListe.isEmpty()) {
            System.out.println("Es ist keine Aktie im Portfolio enthalten");
        } else {
            for (Aktie aktie : aktienListe) {
                System.out.println(aktie.printInfo());
            }
        }
    }

    public double gesamtWertberechnen() {
        double gesamtWert = 0;
        for (Aktie aktie : aktienListe) {
            gesamtWert += aktie.berechneGesamtwert();
        }
        return gesamtWert;
    }

    public double dividendenRenditeBerechnen() {
        double dividendenrenditeGesamt = 0;
        for (Aktie aktie : aktienListe) {
            dividendenrenditeGesamt += aktie.berechneDividende();
        }
        return dividendenrenditeGesamt;
    }

    public void aktieVerkaufen(String name) {
        aktienListe.removeIf(aktie -> aktie.getName().equalsIgnoreCase(name));
        System.out.println("Die Aktie" + name + "wurde aus dem Portfolio entfernt");
    }
}
