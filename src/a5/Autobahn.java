package a5;

public class Autobahn extends Strasse {
    
    private static int zaehler = 1;
    private final int nummer;
    private int vmax;
    
    public Autobahn(int l, int vmax){
        super(l);
        vmax = vmax;
        nummer = zaehler++;
    }
    
    public Autobahn(int l){
        this(l, 360);
    }
    
    public int vmax(){
        return vmax;
    }

    public int dauer(StrassenFahrzeug sf){
        return super.laenge()/(Math.min(sf.vmax(),vmax()));
    }
}
