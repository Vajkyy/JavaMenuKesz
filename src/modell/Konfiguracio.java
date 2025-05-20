package modell;

public class Konfiguracio {

    private String nev;
    private int szakIndex;
    private boolean hirlevel;

    public Konfiguracio(String sor) {
        String[] adatok = sor.split(" ");
        nev = adatok[0];
        szakIndex = Integer.parseInt(adatok[1]);
        hirlevel = Boolean.parseBoolean(adatok[2]);
    }

    public Konfiguracio(String nev, int szakIndex, boolean hirlevel) {
        this.nev = nev;
        this.szakIndex = szakIndex;
        this.hirlevel = hirlevel;
    }

    public String getNev() {
        return nev;
    }

    public int getSzakIndex() {
        return szakIndex;
    }

    public boolean isHirlevel() {
        return hirlevel;
    }

    @Override
    public String toString() {
        return "Konfiguráció"
                + "név: " + nev
                + ", szakIndex" + szakIndex
                + ", hírlevél" + hirlevel;
    }

}
