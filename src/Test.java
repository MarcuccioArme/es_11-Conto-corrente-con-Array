import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String...args) {

        String Nome = "";
        String Cognome = "";
        int Scelta;

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        Nome = in.next();
        System.out.print("Inserisci il tuo cognome: ");
        Cognome = in.next();

        Titolare tit1 = new Titolare(Nome, Cognome);
        Conto conto1 = new Conto(tit1);

        System.out.println("\nCiao, "+conto1.getTitolare());

        do {

            System.out.println("\n1 Per prelevare;");
            System.out.println("2 Per versare;");
            System.out.println("3 Per vedere lo storico;");
            System.out.println("4 Per vedere il saldo;");
            System.out.println("0 Per chiudere il menu;");

            System.out.print("Scelta: ");
            Scelta = in.nextInt();

            switch (Scelta) {
                case 1: conto1.Preleva();
                    break;

                case 2: conto1.Versa();
                    break;

                case 3: System.out.println("\nLo storico delle azioni: "+Arrays.toString(conto1.getStorico()));
                    break;

                case 4: System.out.println("\nIl tuo saldo: "+conto1.getSaldo() + " Euro");
            }

        } while(Scelta!=0);

    }
}
