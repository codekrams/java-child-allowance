package kindergeld_if;

import java.util.Scanner;

public class Kindergeld_If {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Einkommen an:");
        int einkommen = eingabe.nextInt();

        System.out.println("Bitte geben Sie die Anzahl Ihrer Kinder an:");
        int kinder = eingabe.nextInt();

        System.out.println("Ihr Jahreseinkommen in Euro: " + einkommen);
        System.out.println("Anzahl der Kinder: " + kinder);

        int kindergeld = 0;

        if (einkommen < 45000) {
            if (kinder >= 1) {
                kindergeld += 70;
            }
            if (kinder >= 2) {
                kindergeld += 130;
            }
            if (kinder >= 3) {
                kindergeld += 220;
            }
            if (kinder >= 4) {
                kindergeld = kindergeld + ((kinder - 3) * 240);
            }
        }
        if (einkommen >= 45000) {
            if (kinder >= 1) {
                kindergeld += 70;
            }
            if (kinder >= 2) {
                kindergeld += 70;
            }
            if (kinder >= 3) {
                kindergeld += 140;
            }
            if (kinder >= 4) {
                kindergeld = kindergeld + ((kinder - 3) * 140);
            }
            System.out.println("Höhe des Kindergelds: " + kindergeld);
        }
    }
}
