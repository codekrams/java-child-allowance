
package kindergeld;
import java.util.Scanner;

public class Kindergeld {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Einkommen an:");
        int einkommen = eingabe.nextInt();

        System.out.println("Bitte geben Sie die Anzahl Ihrer Kinder an:");
        int kinder = eingabe.nextInt();
        
        System.out.println("Ihr Jahreseinkommen in Euro: " + einkommen);
        System.out.println("Anzahl der Kinder: " + kinder);
        
        if(einkommen<=45000) {
            switch(kinder) {
                case 1:
                    System.out.println("Höhe des Kindergelds: 70 Euro.");
                break;
                case 2:
                    System.out.println("Höhe des Kindergelds: 200 Euro.");
                break;
                case 3:
                    System.out.println("Höhe des Kindergelds: 420 Euro.");
                break;
                default: 
                    System.out.println("Höhe des Kindergelds: " + (420 + (kinder-3)*240));
            }
        }
        else {
            switch(kinder) {
                case 1:
                    System.out.println("Höhe des Kindergelds: 70 Euro.");
                break;
                case 2:
                    System.out.println("Höhe des Kindergelds: 140 Euro.");
                break;
                case 3:
                    System.out.println("Höhe des Kindergelds: 280 Euro.");
                break;
                default: 
                    System.out.println("Höhe des Kindergelds: " + (280 + (kinder-3)*140) + " Euro.");
            }
        
        }
    }
    
}
