import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il cognome: ");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci la data di nascita: (giorno/mese/anno) a numeri");
        LocalDate dataNascita = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Inserisci il numero di telefono: ");
        String nTelefono = scanner.nextLine();

        System.out.println("Inserire eventuali note: ");
        String note = scanner.nextLine();

        System.out.println("Inserisci l'email: ");
        String email = scanner.nextLine();

        System.out.println("Inserisci password: ");
        String password = scanner.nextLine();

        System.out.println("Inserisci username: ");
        String username = scanner.nextLine();

        System.out.println("Inserisci data di iscrizione (giorno/mese/anno) a numeri: ");
        LocalDate dataIscrizione = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("RIEPILOGO DATI INSERITI: ");
        System.out.printf(
                "Nome: %s\nCognome: %s\nData di Nascita: %s\nNumero di Telefono: %s\nNote: %s\nEmail: %s\nPassword: %s\nUsername: %s\nData di Iscrizione: %s\n",
                nome, cognome, dataNascita.format(dateTimeFormatter), nTelefono, note, email, password, username, dataIscrizione.format(dateTimeFormatter)
        );
        scanner.close();
    }
}
