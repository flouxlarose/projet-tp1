package packagetp1;

public class Employe {
    // données
    private String nom;
    private String numero;
    private double salaireHoraire;
    private double nbreHeuresSemaine;
    private int anciennete;

    static double assuranceEmploi = 0.111;
    static double fondsPension = 0.0136;
    static double cotisationSyndicale = 20.00;
    static double impotFederal = 0.19;
    static double impotProvincial = 0.20;

    // constante(s): static final UPPER_SNAKE_CASE
    // EX: public static final int UNE_CONSTANTE = 3;

    // méthode constructeur
    public Employe(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        this.nom = nom;
        this.numero = numero;
        this.salaireHoraire = salaireHoraire;
        this.nbreHeuresSemaine = nbreHeuresSemaine;
        this.anciennete = anciennete;
    }

    public double salaireBrut() {
        return salaireHoraire * nbreHeuresSemaine;
    }

    public double salaireNetAvantImpot() {
        double salaireBrut = salaireBrut();
        double salaireNet = salaireBrut() - (assuranceEmploi * salaireBrut + fondsPension * salaireBrut + cotisationSyndicale);
        return (salaireNet > 0 ? salaireNet : 0);
    }

    public double impotFederal() {
        double salaireNet = salaireNetAvantImpot();
        double impot = salaireNet * impotFederal;
        return impot;
    }

}