package a5;

public class StrasseInnerorts extends Strasse {
    
    public int vmax;
    
    StrasseInnerorts(boolean reduziert, int l){
        super(l);
        if(reduziert){
            vmax = 30;
        } else {
            vmax = 50;
        }
    }
    
    public int vmax(){
        return vmax;
    }
    
    public int dauer(StrassenFahrzeug sf){
        return super.laenge()/(Math.min(sf.vmax(),vmax()));
    }
}
