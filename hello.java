public class Main {
    public static void main(String[] args) {
        int zahl = 4;
        if (istGerade(zahl)) {
            System.out.println(zahl + " ist gerade.");
        } else {
            System.out.println(zahl + " ist ungerade.");
        }
    }

    public static boolean istGerade(int n) {
        return n % 2 == 0;
    }
}

