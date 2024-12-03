import java.util.Scanner;

public class Ingrediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci la descrizione: ");
        String descrizione = scanner.nextLine();

        System.out.println("Inserire la tipologia da 1-5:\n" +
                "1 - Tipologia A\n" +
                "2 - Tipologia B\n" +
                "3 - Tipologia C\n" +
                "4 - Tipologia D\n" +
                "5 - Tipologia E"
        );
        byte tipologia = scanner.nextByte();
        scanner.nextLine();

        System.out.println("Inserisci la disponibilità(true/false): ");
        boolean disponibilita = scanner.nextBoolean();

        System.out.println("Inserisci il costo: ");
        double costo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Inserisci gli allergeni: ");
        String allergeni = scanner.nextLine();

        System.out.println("Inserisci la modalita di conservazione: ");
        String modalitaConservazione = scanner.nextLine();

        System.out.println("Inserisci il percorso dell'immagine: ");
        String foto = scanner.nextLine();

        System.out.println("RIEPILOGO DATI INSERITI: ");
        System.out.printf(
                "Nome: %s\nDescrizione: %s\nTipologia: %s\nDisponibilita: %s\nCosto: %.2f\nAllergeni: %s\nModalita Conservazione: %s\nFoto: %s\n",
                nome, descrizione, tipologia, disponibilita, costo, allergeni, modalitaConservazione, foto
        );
        scanner.close();
    }
}
