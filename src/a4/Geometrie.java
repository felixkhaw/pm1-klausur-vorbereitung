package a4;

public class Geometrie {
    public static double flaecheQuadrat(double a) {
        return flaecheRechteck(a, a);
    }
    public static double flaecheRechteck(double b, double h) throws NegLaengeException {
        if (b < 0.0 || h < 0.0 ) throw new NegLaengeException("Fehler: negative Laenge!!!");
        return b * h;
    }
}
