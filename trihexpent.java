public class trihexpent {
    public static void main(String[] args) {
        long n = 286; // Start with the next number after 285
        long t = getTriangleNumber(n);
        long p = getPentagonalNumber(n);
        long h = getHexagonalNumber(n);

        while (t != p || t != h) {
            n++;
            t = getTriangleNumber(n);
            p = getPentagonalNumber(n);
            h = getHexagonalNumber(n);
        }

        System.out.println("The next triangle number that is also pentagonal and hexagonal is " + t);
    }

    public static long getTriangleNumber(long n) {
        return n * (n + 1) / 2;
    }

    public static long getPentagonalNumber(long n) {
        return n * (3 * n - 1) / 2;
    }

    public static long getHexagonalNumber(long n) {
        return n * (2 * n - 1);
    }
}
