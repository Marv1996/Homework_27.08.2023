import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        int a = 5, b = 8, c = 6, d = 2;

        double ad = 27.0, bd = 9.0, cd = 3.0, dd = 81.0;

        // 23
        if (a == 1 || b == 1 || c == 1) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 24
        if (a == 2 && b == 2 || b == 2 && c == 2 || c == 2 && a == 2) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 25
        if (a + b > c && b + c > a && a + c > b) {
            out.println("y = 1");
        } else {
            out.println("y = 2");
        }

        // 26
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            out.println(1);
        } else {
            out.println(2);
        }

        // 27
        if (a - b == b - c || a - c == c - b
                || b - a == a - c || b - c == c - a
                || c - a == a - b || c - b == b - a) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 28
        if (ad / bd == bd / cd || ad / cd == cd / bd
                || bd / ad == ad / cd || bd / cd == cd / ad
                || cd / ad == ad / bd || cd / bd == bd / ad) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 29
        if (a > b && b > c) {
            out.println(c + "," + b + "," + a);
        } else if (a > c && c > b) {
            out.println(b + "," + c + "," + a);
        } else if (b > a && a > c) {
            out.println(c + "," + a + "," + b);
        } else if (b > c && c > a) {
            out.println(a + "," + c + "," + b);
        } else if (c > a && a > b) {
            out.println(b + "," + a + "," + c);
        } else if (c > b && b > a) {
            out.println(a + "," + b + "," + c);
        }

        // 30
        if (a < b && b < c) {
            out.println(c + "," + b + "," + a);
        } else if (a < c && c < b) {
            out.println(b + "," + c + "," + a);
        } else if (b < a && a < c) {
            out.println(c + "," + a + "," + b);
        } else if (b < c && c < a) {
            out.println(a + "," + c + "," + b);
        } else if (c < a && a < b) {
            out.println(b + "," + a + "," + c);
        } else if (c < b && b < a) {
            out.println(a + "," + b + "," + c);
        }

        // 31
        if (a > b && a > c && a > d) {
            out.println(a);
        } else if (b > a && b > c && b > d) {
            out.println(b);
        } else if (c > a && c > b && c > d) {
            out.println(c);
        } else {
            out.println(d);
        }

        // 32
        if (a < b && a < c && a < d) {
            out.println(a);
        } else if (b < a && b < c && b < d) {
            out.println(b);
        } else if (c < a && c < b && c < d) {
            out.println(c);
        } else {
            out.println(d);
        }

        // 33
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            out.println("true");
        } else {
            out.println(false);
        }

        // 34
        if (a + b == c + d || a + c == b + d
                || a + d == b + c) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 35
        if (a == b + c + d || b == a + c + d
                || c == a + b + d || d == a + b + c) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 36
        if (a % 2 != 0 && b % 2 != 0 || c % 2 != 0 && d % 2 != 0
                || a % 2 != 0 && c % 2 != 0 || b % 2 != 0 && d % 2 != 0
                || a % 2 != 0 && d % 2 != 0 || c % 2 != 0 && b % 2 != 0) {
            out.println(1);
        } else {
            out.println(2);
        }

        // 37
        if (a - b == b - c && b - c == c - d
                || a - c == c - b && c - b == b - d
                || a - d == d - b && d - b == b - c
                || b - a == a - c && a - c == c - d
                || b - c == c - a && c - a == a - d
                || b - d == d - a && d - a == a - c
                || c - a == a - b && a - b == b - d
                || c - b == b - a && b - a == a - d
                || c - d == d - a && d - a == a - b
                || d - a == a - b && a - b == b - c
                || d - b == b - a && b - a == a - c
                || d - c == c - a && c - a == a - b) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 38
        if (ad / bd == bd / cd && bd / cd == cd / dd
                || ad / cd == cd / bd && cd / bd == bd / dd
                || ad / dd == dd / bd && dd / bd == bd / cd
                || bd / ad == ad / cd && ad / cd == cd / dd
                || bd / cd == cd / ad && cd / ad == ad / dd
                || bd / dd == dd / ad && dd / ad == ad / cd
                || cd / ad == ad / bd && ad / bd == bd / dd
                || cd / bd == bd / ad && bd / ad == ad / dd
                || cd / dd == dd / ad && dd / ad == ad / bd
                || dd / ad == ad / bd && ad / bd == bd / cd
                || dd / bd == bd / ad && bd / ad == ad / cd
                || dd / cd == cd / ad && cd / ad == ad / bd) {
            out.println("true");
        } else {
            out.println("false");
        }

        // 39
        if (a > b && b > c && c > d) {
            out.println(d + "," + c + "," + b + "," + a);
        } else if (a > b && b > d && d > c) {
            out.println(c + "," + d + "," + b + "," + a);
        } else if (a > c && c > b && b > d) {
            out.println(d + "," + b + "," + c + "," + a);
        } else if (a > c && c > d && d > b) {
            out.println(b + "," + d + "," + c + "," + a);
        } else if (a > d && d > b && b > c) {
            out.println(c + "," + b + "," + d + "," + a);
        } else if (a > d && d > c && c > b) {
            out.println(b + "," + c + "," + d + "," + a);
        } else if (b > a && a > c && c > d) {
            out.println(d + "," + c + "," + a + "," + b);
        } else if (b > a && a > d && d > c) {
            out.println(c + "," + d + "," + a + "," + b);
        } else if (b > c && c > a && a > d) {
            out.println(d + "," + a + "," + c + "," + b);
        } else if (b > c && c > d && d > a) {
            out.println(a + "," + d + "," + c + "," + b);
        } else if (b > d && d > a && a > c) {
            out.println(c + "," + a + "," + d + "," + b);
        } else if (b > d && d > c && c > a) {
            out.println(a + "," + c + "," + d + "," + b);
        } else if (c > a && a > b && b > d) {
            out.println(d + "," + b + "," + a + "," + c);
        } else if (c > a && a > d && d > b) {
            out.println(b + "," + d + "," + a + "," + c);
        } else if (c > b && b > a && a > d) {
            out.println(d + "," + a + "," + b + "," + c);
        } else if (c > b && b > d && d > a) {
            out.println(a + "," + d + "," + b + "," + c);
        } else if (c > d && d > a && a > b) {
            out.println(b + "," + a + "," + d + "," + c);
        } else if (c > d && d > b && b > a) {
            out.println(a + "," + b + "," + d + "," + c);
        } else if (d > a && a > b && b > c) {
            out.println(c + "," + b + "," + a + "," + d);
        } else if (d > a && a > c && c > b) {
            out.println(b + "," + c + "," + a + "," + d);
        } else if (d > b && b > a && a > c) {
            out.println(c + "," + a + "," + b + "," + d);
        } else if (d > b && b > c && c > a) {
            out.println(a + "," + c + "," + b + "," + d);
        } else if (d > c && c > a && a > b) {
            out.println(b + "," + a + "," + c + "," + d);
        } else if (d > c && c > b && b > a) {
            out.println(a + "," + b + "," + c + "," + d);
        }

        // 40
        if (a < b && b < c && c < d) {
            out.println(d + "," + c + "," + b + "," + a);
        } else if (a < b && b < d && d < c) {
            out.println(c + "," + d + "," + b + "," + a);
        } else if (a < c && c < b && b < d) {
            out.println(d + "," + b + "," + c + "," + a);
        } else if (a < c && c < d && d < b) {
            out.println(b + "," + d + "," + c + "," + a);
        } else if (a < d && d < b && b < c) {
            out.println(c + "," + b + "," + d + "," + a);
        } else if (a < d && d < c && c < b) {
            out.println(b + "," + c + "," + d + "," + a);
        } else if (b < a && a < c && c < d) {
            out.println(d + "," + c + "," + a + "," + b);
        } else if (b < a && a < d && d < c) {
            out.println(c + "," + d + "," + a + "," + b);
        } else if (b < c && c < a && a < d) {
            out.println(d + "," + a + "," + c + "," + b);
        } else if (b < c && c < d && d < a) {
            out.println(a + "," + d + "," + c + "," + b);
        } else if (b < d && d < a && a < c) {
            out.println(c + "," + a + "," + d + "," + b);
        } else if (b < d && d < c && c < a) {
            out.println(a + "," + c + "," + d + "," + b);
        } else if (c < a && a < b && b < d) {
            out.println(d + "," + b + "," + a + "," + c);
        } else if (c < a && a < d && d < b) {
            out.println(b + "," + d + "," + a + "," + c);
        } else if (c < b && b < a && a < d) {
            out.println(d + "," + a + "," + b + "," + c);
        } else if (c < b && b < d && d < a) {
            out.println(a + "," + d + "," + b + "," + c);
        } else if (c < d && d < a && a < b) {
            out.println(b + "," + a + "," + d + "," + c);
        } else if (c < d && d < b && b < a) {
            out.println(a + "," + b + "," + d + "," + c);
        } else if (d < a && a < b && b < c) {
            out.println(c + "," + b + "," + a + "," + d);
        } else if (d < a && a < c && c < b) {
            out.println(b + "," + c + "," + a + "," + d);
        } else if (d < b && b < a && a < c) {
            out.println(c + "," + a + "," + b + "," + d);
        } else if (d < b && b < c && c < a) {
            out.println(a + "," + c + "," + b + "," + d);
        } else if (d < c && c < a && a < b) {
            out.println(b + "," + a + "," + c + "," + d);
        } else if (d < c && c < b && b < a) {
            out.println(a + "," + b + "," + c + "," + d);
        }

        //-------------------------------------------------------

        boolean t;
        int n = 215;
        int x = n % 10;
        int y = (n / 10) % 10;
        int z = n / 100;
        int k = 254;
        double sum;

        // 51
        if (x == y + z) {
            t = true;
        } else {
            t = false;
        }
        out.println(t);

        // 52
        if (x == y || x == z || y == z) {
            t = true;
        } else {
            t = false;
        }
        out.println(t);

        // 53
        if (n > k) {
            sum = n / ((double) x + y + z);
        } else {
            sum = (double) x / n;
        }
        out.println(sum);
    }
}