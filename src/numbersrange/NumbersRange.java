package numbersrange;

public class NumbersRange {
    public static void main(String[] args) {
        float n = 0;

        while (n <= 3) {
            System.out.printf("%.1f" + ", ", n);
            n = n + 0.1f;
        }

        n = 0;
        System.out.print("\n");

        do {
            System.out.printf("%.1f" + ", ", n);
            n = n + 0.1f;
        } while (n <= 3);

    }
}
