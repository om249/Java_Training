package Introduction;

public class Operator {

    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("----- Arithmetic -----");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("\n----- Relational -----");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean x = true, y = false;

        System.out.println("\n----- Logical -----");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        System.out.println("\n----- Assignment -----");
        int c = 10;
        System.out.println(c);
        c += 5;
        System.out.println(c);
        c -= 2;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);
        c %= 3;
        System.out.println(c);

        System.out.println("\n----- Unary -----");
        int n = 5;
        System.out.println(+n);
        System.out.println(-n);
        System.out.println(++n);
        System.out.println(--n);

        System.out.println("\n----- Bitwise -----");
        int p = 5, q = 3;
        System.out.println(p & q);
        System.out.println(p | q);
        System.out.println(p ^ q);
        System.out.println(~p);

        System.out.println("\n----- Shift -----");
        System.out.println(p << 1);
        System.out.println(p >> 1);
        System.out.println(p >>> 1);

        System.out.println("\n----- Ternary -----");
        System.out.println((a > b) ? a : b);

        System.out.println("\n----- instanceof -----");
        String name = "Java";
        System.out.println(name instanceof String);
    }
}
