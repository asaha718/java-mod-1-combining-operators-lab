public class Main {
    public static void main(String[] args) {

        System.out.println( "Truth table for && operator :");
        System.out.println( "truth && truth = " + (true && true)); // true
        System.out.println( "truth && false = " + (true && false)); // false
        System.out.println( "false && false = " + (false && false)); // false
        System.out.println( "false && truth = " + (false && true)); // false

        System.out.println( "Truth table for || operator :");
        System.out.println( "truth || truth = " + (true || true)); // true
        System.out.println( "truth || false = " + (true || false)); // true
        System.out.println( "false || false = " + (false || false)); // false
        System.out.println( "false || truth = " + (false || true)); // true

    }
}
