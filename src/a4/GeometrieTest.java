package a4;

public class GeometrieTest {
    static void main(String[] args) {
        try {
            System.out.println(Geometrie.flaecheRechteck(-3, -3));
        } catch(NegLaengeException e){
            System.out.println(e.getMessage());
        }
    }
}
