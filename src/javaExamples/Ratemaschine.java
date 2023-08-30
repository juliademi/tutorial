package javaExamples;

/**
     * Bei Exemplaren dieser Klasse soll der Klient eine ganze Zahl raten können.
     *
     * @author Julia
     * @version neue, selbstgeschrieben
     */
    public class Ratemaschine {
        private int _gesuchteZahl;

        private int _anzahlVersuche;

        public Ratemaschine(int zuRatendeZahl) {
            _gesuchteZahl = zuRatendeZahl;
            _anzahlVersuche = 0;
        }

        /**
         * wenn z.b. public String istEsDieseZahl, dann return am Ende (dann wird aus der Methode rausgegangen!, wenn System.out.println,
         * dann muss es void sein und das Ergebnis wird auf der Konsole ausgegeben.
         * Reihenfolge immer beachten! Sequenzen werden von oben nach unten ausgeführt!
         */
        public void istEsDieseZahl(int gerateneZahl) {
            String wieGeraten;

            _anzahlVersuche = _anzahlVersuche + 1;

            if (gerateneZahl < _gesuchteZahl)
                wieGeraten = "Zu niedrig geraten!";

            else if (gerateneZahl > _gesuchteZahl)
                wieGeraten = "Zu hoch getippt!";

            else
                wieGeraten = "Stimmt! Du hast " + _anzahlVersuche + " Versuch(e) benötigt!";

            System.out.println(wieGeraten);
        }

        /**
         * mehrere returns oder System.out.println vermeiden! Lokale Variablen deklarieren!
         * wenn lokale variablen bei switch, dann muss ein break stehen! damit er aus der Methode rausgeht.
         * oder eben mehrere returns, d.h. dass er dann aus der Methode rausgeht.
         * default ist, wenn gar nichts weiteres zutrifft!
         */
        public void bewerteRateleistung() {
            String ergebnis;

            switch (_anzahlVersuche) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    ergebnis = "Das war doch nur Glück!";
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    ergebnis = "Gar nicht mal so gut!";
                    break;

                default:
                    ergebnis = "Such dir ein neues Hobby!";
            }
            System.out.println(ergebnis);
        }


        public static void main(String[] args) {
            Ratemaschine r = new Ratemaschine(23);

            r.istEsDieseZahl(23);

           r.bewerteRateleistung();


        }

    }