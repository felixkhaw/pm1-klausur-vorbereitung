package a2;

public class MatrixTest {
    static void main() {
        int[][] test = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Matrix.toString(Matrix.spiegele(test))); 
    }
}
