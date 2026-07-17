package a5;

public class Autobahn extends Strasse {
    
    private int vmax;
    
    public Autobahn(int l, int vmax){
        super(l);
        vmax = vmax;
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
