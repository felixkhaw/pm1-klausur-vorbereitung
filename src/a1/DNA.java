package a1;

public class DNA {
    public String komplement(String s){
        String kompl = "";
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'C':
                    kompl = kompl.concat("G");
                    break;
                case 'G':
                    kompl = kompl.concat("C");
                    break;
                case 'A':
                    kompl = kompl.concat("T");
                    break;
                case 'T':
                    kompl = kompl.concat("A");
                    break;
            }
        }
        return kompl;
    }
}
