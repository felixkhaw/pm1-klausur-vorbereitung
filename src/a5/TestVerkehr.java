package a5;

public class TestVerkehr {
    public static boolean vmaxStrasseInnerortsCheck(boolean reduziert, int l,int erw) {
        StrasseInnerorts s = new StrasseInnerorts(reduziert, l);
        int erg = s.vmax();
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: (StrasseInnerorts) vmx() ==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean vmaxStrasseInnerortsTest() {
        return (
                vmaxStrasseInnerortsCheck(true, 500, 30 )
        );

    }

    public static boolean dauerStrasseInnerortsCheck(boolean reduziert, int l,int erw) {
        StrasseInnerorts s = new StrasseInnerorts(reduziert, l);
        Prolsche p = new Prolsche();
        int erg = s.dauer(p);
        boolean istKorrekt = (erg == erw);
        if (!istKorrekt) {
            System.out.println("FEHLER: (StrasseInnerorts) dauer("+p.toString()+") ==" + erg + " statt " + erw);
        }
        return istKorrekt;
    }

    public static boolean dauerStrasseInnerortsTest() {
        return (
                dauerStrasseInnerortsCheck(true, 500, 16 )
        );

    }

    public static boolean test() {
        return (
                vmaxStrasseInnerortsTest() &
                dauerStrasseInnerortsTest()
        );
    }
    public static void main() {
        if (test()) {
            System.out.println("OK");
        }
    }
}
