import static java.lang.StrictMath.abs;

public class Ride {
    private int a, b, x, y, s, t, d;

    public Ride(int a, int b, int x, int y, int s, int t) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.s = s;
        this.t = t;
        this.d = StrictMath.abs(a-x)+StrictMath.abs(b-y);
    }


}
