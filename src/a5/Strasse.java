package a5;

public abstract class Strasse {
    
    private int laenge;
    
    Strasse(int l){
        laenge = l;
    }
    
    public int laenge(){
        return laenge;
    }
    
    public abstract int vmax();
    
    public abstract int dauer(StrassenFahrzeug sf);
}
