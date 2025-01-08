package AktienportfolioManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Portfolio portfolio = new Portfolio();

        while (true) {
            System.out.println("Aktienportfolio-Manager");
            System.out.println("1. Aktie hinzufügen");
            System.out.println("2. Portfolio anzeigen");
            System.out.println("3. Gesamtwert berechnen");
            System.out.println("4. Dividendenrendite anzeigen");
            System.out.println("5. Aktie verkaufen");
            System.out.println("6. Beenden");
            System.out.println("Wählen Sie eine Option");

            int auswahl = sc.nextInt();
            sc.nextLine();

            switch (auswahl) {
                case 1:
                    System.out.print("Name der Aktie: ");
                    String name = sc.nextLine();
                    System.out.print("Kaufpreis der Aktie: ");
                    double kaufpreis = sc.nextDouble();
                    System.out.print("Anzahl der Aktie: ");
                    int anzahl = sc.nextInt();
                    System.out.print("Dividendenrendite der Aktie: ");
                    double dividendenrendite = sc.nextDouble();
                    portfolio.aktieHinzufuegen(new Aktie(name, kaufpreis, anzahl, dividendenrendite));
                    break;
                case 2:
                    portfolio.portfolioAnzeigen();
                    break;
                case 3:
                    System.out.println("Der Gesamtwert des Portfolios ist: " + portfolio.gesamtWertberechnen() + "Euro");
                    break;
                case 4:
                    System.out.println("Die Dividendenrendite des Portfolios ist: " + portfolio.dividendenRenditeBerechnen() + "Euro");
                    break;
                case 5:
                    System.out.println("Name der Aktie, die verkauft werden soll: ");
                    String nameVerkauft = sc.nextLine();
                    portfolio.aktieVerkaufen(nameVerkauft);
                    break;
                case 6:
                    System.out.println("Programm beendet.");
                    sc.close();
                    return;
                default:
                    System.out.println("Das war eine ungültige Eingabe. Bitte erneut versuchen.");
            }
        }

    }
}
