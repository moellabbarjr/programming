package v1oop.practicum.practicum2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double ln, double dp) {
        breedte = br;
        lengte = ln;
        diepte = dp;
    }

    public Zwembad() {}

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}
