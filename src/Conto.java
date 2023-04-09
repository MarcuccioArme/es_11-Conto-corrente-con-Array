import java.util.Scanner;

public class Conto {

    Scanner in = new Scanner(System.in);

    private float Saldo;
    private Titolare Titolare;
    private String[] Storico = new String[5];

    public Conto(Titolare Titolare) {
        this.Saldo = 0;
        this.Titolare = Titolare;
    }

    public Conto(Titolare Titolare, float SaldoIniziale) {
        this.Saldo = SaldoIniziale;
        this.Titolare = Titolare;
    }

    public float getSaldo() {
        return this.Saldo;
    }
    public String getTitolare() {
        return this.Titolare.toString();
    }
    public String[] getStorico() {
        return this.Storico;
    }

    public void Versa() {

        float Transazione;

        System.out.println("\nIl saldo: "+getSaldo()+" Euro");
        System.out.println("Quanto vuoi versare?");
        Transazione = in.nextInt();

        System.out.println("Hai versato: "+Transazione+" Euro");

        this.Saldo+=Transazione;
        AggiungiMovimento("+"+Transazione);
    }

    public void Preleva() {

        float Transazione;

        if (getSaldo() == 0) {
            System.out.println("\nNon puoi prelevare perchè non hai soldi sul conto!");
        } else {
            System.out.println("\nIl saldo: "+getSaldo()+" Euro");
            System.out.println("Quanto vuoi prelevare?");
            Transazione = in.nextInt();

            System.out.println("Hai prelevato: "+Transazione+" Euro");

            if (this.Saldo - Transazione < 0) {
                System.out.println("\nErrore, non puoi prelevare!");
            }
            else {
                this.Saldo-=Transazione;
                AggiungiMovimento("-"+Transazione);
            }
        }

    }

    private void AggiungiMovimento(String Storico) {
        shiftDx(this.Storico);
        this.Storico[0] = Storico;
    }

    private void shiftDx(String[] Array) {
        for (int i=Array.length-1; i>0; i--) {
            Array[i] = Array[i-1];
        }
    }

}
