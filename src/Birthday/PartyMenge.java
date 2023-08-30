package Birthday;

import java.util.HashSet;
import java.util.Set;

public class PartyMenge implements Party {

    /**
     * Ein weiterer Gast hat seinen Geburtstag verraten :)
     *
     * @param geburtstag der Geburtstag des Gasts
     */

    private Set<Tag> _geburtstage;
    private int _zaehler;

    public PartyMenge(){
        this._geburtstage = new HashSet<Tag>();
        this._zaehler = 0;
    }

    public void fuegeGeburtstagHinzu(Tag geburtstag){

        ++_zaehler;

        if (!_geburtstage.contains(geburtstag)) {
            _geburtstage.add(geburtstag);
        }
        //else {
            //System.out.println("Dieser Geburtstag ist bereits enthalten!");
        //}
    }

    public Set<Tag> getGeburtstage(){return _geburtstage;}

    public int getZaehler() {return _zaehler;}

    /**
     * Gibt an, ob mehrere Gaeste am gleichen Tag Geburtstag haben.
     */
    public boolean mindestensEinGeburtstagMehrfach(){

        return _zaehler > _geburtstage.size();
    }
}
