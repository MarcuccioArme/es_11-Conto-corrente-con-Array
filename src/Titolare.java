public class Titolare {

    private String Nome;
    private String Cognome;

    public Titolare(String Nome, String Cognome) {
        this.Nome = Nome;
        this.Cognome = Cognome;
    }

    public String getNome() {
        return Nome;
    }
    public String getCognome() {
        return Cognome;
    }

    public String toString() {
        return (Cognome+" "+Nome);
    }

}
