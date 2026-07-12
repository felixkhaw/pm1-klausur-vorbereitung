package a2;

public class Matrix {
    public static int[][] spiegele(int[][] m1){
        int[][] res = new int[m1.length][m1[0].length];
        for(int a = 0; a < m1.length; a++){
            for(int i = 0; i < m1[0].length; i++){
                res[m1.length-1-i][m1[0].length-1-a] = m1[a][i];
            }
        }
        return res;
    }
    
    public static String toString(int[][] m) {
        String s = "";

        for (int a = 0; a < m.length; a++) {
            for (int i = 0; i < m[a].length; i++) {
                s += m[a][i] + " ";
            }
            s += "\n";
        }

        return s;
    }
}
