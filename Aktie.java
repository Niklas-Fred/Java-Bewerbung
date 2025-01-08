package AktienportfolioManager;

public class Aktie {
    private String name;
    private double kaufpreis;
    private int anzahl;
    private double dividendenrendite;

    public Aktie(String name, double kaufpreis, int anzahl, double dividendenrendite) {
        this.name = name;
        this.kaufpreis = kaufpreis;
        this.anzahl = anzahl;
        this.dividendenrendite = dividendenrendite;
    }
    public double berechneGesamtwert() {
        return kaufpreis * anzahl;
    }
    public double berechneDividende() {
        return berechneGesamtwert() * dividendenrendite / 100;
    }
    public String getName() {
        return name;
    }
    public String printInfo () {
        return name + ": " + anzahl + " Stück = " + berechneGesamtwert() + " Euro" + " Wert. Mit einer Dividendenrendite von " + dividendenrendite + " Prozent " + "ergibt das eine Dividendenausschüttung von " + berechneDividende() + "Euro.";
    }
}
//System.out.println(...) ruft automatisch die "toString" Methode des Objects auf
