
/**
 * Eine Klasse, die Bankkonten modelliert.
 *
 * @author Julia
 * @version neue Version, alleine
 */
public class Konto
{
    //Exsemplarkonstante immer an 1. Stelle ganz oben! Sowohl bei der Variablendeklaration als auch im Konstruktor!
    private final int _kontonummer;

    //Exemplarvariablen immer mit Sichtbarkeit (private), Typ und Namen!
    private int _saldo;

    private int _dispo;

    //Konstruktor auf public setzen, damit man Exemplare erstellen kann!
    //Bei sowas wie "dispo darf nur postitiv sein, gibt es nur die Möglichkeit,
    //entweder einen Mathodenaufruf zu machen oder eine IF-Anweisung zu implementieren.
    public Konto(int kontonummer, int dispo)
    {
        _kontonummer = kontonummer;
        _saldo = 10;
        setzeNeuenDispo(dispo);
    }

    /**
     * verändernde Methode
     */
    public void einzahlen(int betrag)
    {
        if (betrag >= 0)
        {
            _saldo = _saldo + betrag;
        }
    }

    /**
     * verändernde Methode
     */
    public void abheben(int betrag)
    {
        if (betrag >= 0  && _saldo + _dispo >= betrag)
        {
            _saldo = _saldo - betrag;
        }
    }

    /**
     * sodierende Methode
     * egal was da steht außer void, es muss was zurückgegeben werden! durch return!
     */
    public int gibSaldo()
    {
        return _saldo;
    }

    /**
     * sodierende Methode
     */
    public int gibKontonummer()
    {
        return _kontonummer;
    }

    public void setzeNeuenDispo(int neuerDispo)
    {
        int aktuellerSaldo;
        aktuellerSaldo = _saldo;

        if (aktuellerSaldo > 0 && neuerDispo >= 0)
        {
            _dispo = neuerDispo;
        }
        if (aktuellerSaldo < 0)
        {
            aktuellerSaldo = aktuellerSaldo * -1;
            if (neuerDispo > aktuellerSaldo)
            {
                _dispo = neuerDispo;
            }
        }
    }

    public int gibDispo()
    {
        return _dispo;
    }


    public static void main(String[] args) {
        Konto k = new Konto(123456789, 10000);

        System.out.println("Kontonummer: " + k.gibKontonummer() + " \nDispo: " + k.gibDispo() + "\nSaldo:" + k.gibSaldo());

        k.einzahlen(500);
        k.abheben(300);

        System.out.println("Kontonummer: " + k.gibKontonummer() + " \nDispo: " + k.gibDispo() + "\nSaldo:" + k.gibSaldo());

        k.setzeNeuenDispo(1000);

        System.out.println("Kontonummer: " + k.gibKontonummer() + " \nDispo: " + k.gibDispo() + "\nSaldo:" + k.gibSaldo());
    }}