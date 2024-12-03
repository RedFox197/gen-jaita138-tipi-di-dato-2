import java.util.Scanner;

public class Piatto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci la descrizione: ");
        String descrizione = scanner.nextLine();

        System.out.println("Inserisci il prezzo: ");
        double prezzo = scanner.nextDouble();

        System.out.println("Inserisci la disponibilità(true/false): ");
        boolean disponibile = scanner.nextBoolean();

        System.out.println("Inserire la tipologia da 1-5:\n" +
                "1 - Tipologia A\n" +
                "2 - Tipologia B\n" +
                "3 - Tipologia C\n" +
                "4 - Tipologia D\n" +
                "5 - Tipologia E"
        );
        byte tipologia = scanner.nextByte();
        scanner.nextLine();

        System.out.println("Inserisci gli allergeni: ");
        String allergeni = scanner.nextLine();

        System.out.println("Inserisci il percorso dell'immagine: ");
        String foto = scanner.nextLine();

        System.out.println("Inserisci le calorie: ");
        short calorie = scanner.nextShort();
        scanner.nextLine();

        System.out.println("Inserisci eventuali variazioni: ");
        String variazioni = scanner.nextLine();

        System.out.println("RIEPILOGO DATI INSERITI: ");
        System.out.printf(
                "Nome: %s\nDescrizione: %s\nPrezzo: %.2f\nDisponibile: %s\nTipologia: %s\nAllergeni: %s\nFoto: %s\nCalorie: %s\nVariazioni: %s\n",
                nome, descrizione, prezzo, disponibile, tipologia, allergeni, foto, calorie, variazioni
        );
        scanner.close();
    }
}
