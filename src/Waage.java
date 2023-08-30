
/**
 * Waage
 *
 * @author Julia
 * @version neue, selbstgeschrieben
 */
public class Waage
{
    private int _letztesGewicht;
    private int _derzeitigesGewicht;
    private int _minGewicht;
    private int _maxGewicht;
    private int _trend;
    private int _zaehler;
    private int _durchschnittsGewicht;
    private int _summe;

    public Waage (int aktuellesGewicht)
    {
        _letztesGewicht = aktuellesGewicht;
        _derzeitigesGewicht = aktuellesGewicht;
        _minGewicht = aktuellesGewicht;
        _maxGewicht = aktuellesGewicht;
        _durchschnittsGewicht = aktuellesGewicht;
        _summe = aktuellesGewicht;
        _zaehler = 1;
    }

    /**
     * Reihenfolge der Anweisungen beachten!!!!!!!!
     * Das letzte Gewicht fliegt immer raus, das derzeitige Gewicht wird zu letzten Gewicht,
     * bevor das neue Gewicht zum derzeitigen Gewicht überschrieben wird.
     */
    public void registriere (int neuesGewicht)
    {
        _zaehler = _zaehler +1;

        _letztesGewicht = _derzeitigesGewicht;
        _derzeitigesGewicht = neuesGewicht;

        _trend = gibTrend();
        gibMinimalgewicht();
        gibMaximalgewicht();
        gibDurchschnittsgewicht();
    }

    public int gibTrend()
    {
        int ergebnis;

        if (_derzeitigesGewicht < _letztesGewicht)
        {
            ergebnis = -1;
        }
        else if (_derzeitigesGewicht > _letztesGewicht)
        {
            ergebnis = +1;
        }
        else
        {
            ergebnis = 0;
        }

        return ergebnis;
    }

    public int gibMinimalgewicht()
    {
        if(_derzeitigesGewicht < _minGewicht)
        {
            _minGewicht = _derzeitigesGewicht;
        }
        return _minGewicht;
    }

    public int gibMaximalgewicht()
    {
        if (_derzeitigesGewicht > _maxGewicht)
        {
            _maxGewicht = _derzeitigesGewicht;
        }
        return _maxGewicht;
    }

    public int gibDurchschnittsgewicht()
    {
        _summe = _summe + _derzeitigesGewicht;
        _durchschnittsGewicht = _summe / _zaehler;

        return _durchschnittsGewicht;
    }


}

