import java.util.Date;

//Class Objekt
public class Hause {
    //Attribut
    private String hausOrt;
    private int anzahleZimmer;
    private int wohnKapazitaet;
    private int bauJahr;
    private String besitzer;
    private double mietkosten;
    private double grosse;
    private double m2Kosten;
    private double verkaufen;
    private Date  bisBeschaeftigt;
    private Date vonBeschaeftigt;


    //TODO:Hangi tarihler arasinda evlerimiz bos ve evin kapasitelerinin durumu. evlerin bulundugu semtler.



    //Constructor
    public Hause() {


    }

    public Hause(String hausOrt, int anzahleZimmer, int wohnKapazitaet, int bauJahr, String besitzer, double mietkosten, double grosse, double m2Kosten, double verkaufen, Date bisBeschaeftigt, Date vonBeschaeftigt) {
        this.hausOrt = hausOrt;
        this.anzahleZimmer = anzahleZimmer;
        this.wohnKapazitaet = wohnKapazitaet;
        this.bauJahr = bauJahr;
        this.besitzer = besitzer;
        this.mietkosten = mietkosten;
        this.grosse = grosse;
        this.m2Kosten = m2Kosten;
        this.verkaufen = verkaufen;
        this.bisBeschaeftigt = bisBeschaeftigt;
        this.vonBeschaeftigt = vonBeschaeftigt;
    }

    public String getHausOrt() {
        return hausOrt;
    }

    public void setHausOrt(String hausOrt) {
        this.hausOrt = hausOrt;
    }

    public int getAnzahleZimmer() {
        return anzahleZimmer;
    }

    public void setAnzahleZimmer(int anzahleZimmer) {
        this.anzahleZimmer = anzahleZimmer;
    }

    public int getWohnKapazitaet() {
        return wohnKapazitaet;
    }

    public void setWohnKapazitaet(int wohnKapazitaet) {
        this.wohnKapazitaet = wohnKapazitaet;
    }

    public int getBauJahr() {
        return bauJahr;
    }

    public void setBauJahr(int bauJahr) {
        this.bauJahr = bauJahr;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public double getMietkosten() {
        return mietkosten;
    }

    public void setMietkosten(double mietkosten) {
        this.mietkosten = mietkosten;
    }

    public double getGrosse() {
        return grosse;
    }

    public void setGrosse(double grosse) {
        this.grosse = grosse;
    }

    public double getM2Kosten() {
        return m2Kosten;
    }

    public void setM2Kosten(double m2Kosten) {
        this.m2Kosten = m2Kosten;
    }

    public double getVerkaufen() {
        return verkaufen;
    }

    public void setVerkaufen(double verkaufen) {
        this.verkaufen = verkaufen;
    }

    public Date getBisBeschaeftigt() {
        return bisBeschaeftigt;
    }

    public void setBisBeschaeftigt(Date bisBeschaeftigt) {
        this.bisBeschaeftigt = bisBeschaeftigt;
    }

    public Date getVonBeschaeftigt() {
        return vonBeschaeftigt;
    }

    public void setVonBeschaeftigt(Date vonBeschaeftigt) {
        this.vonBeschaeftigt = vonBeschaeftigt;
    }

    @Override
    public String toString() {
        return "Hause{" +
                "hausOrt='" + hausOrt + '\'' +
                ", anzahleZimmer=" + anzahleZimmer +
                ", wohnKapazitaet=" + wohnKapazitaet +
                ", bauJahr=" + bauJahr +
                ", besitzer='" + besitzer + '\'' +
                ", mietkosten=" + mietkosten +
                ", grosse=" + grosse +
                ", m2Kosten=" + m2Kosten +
                ", verkaufen=" + verkaufen +
                ", bisBeschaeftigt=" + bisBeschaeftigt +
                ", vonBeschaeftigt=" + vonBeschaeftigt +
                '}';
    }

    //Class Methtod

    public double verkaufen(Double m2kosten) {
        return (getGrosse()*m2kosten);

    }

    public double vermieten(Double anzahltages){

        return getMietkosten()*anzahltages;


    }
    public double anzahlesTage(Date eintritt, Date abreise){
        return abreise.getDate() - eintritt.getDate();

    }


    }


