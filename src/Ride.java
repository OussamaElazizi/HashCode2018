import static java.lang.StrictMath.abs;

public class Ride {
    private int a, b, x, y, s, t, d, id;

    public Ride(int a, int b, int x, int y, int s, int t, int id) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.s = s;
        this.t = t;
        this.d = StrictMath.abs(a-x)+StrictMath.abs(b-y);
        this.id=id;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getS() {
        return s;
    }

    public int getT() {
        return t;
    }

    public int getD() {
        return d;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id_" +id+ ": \t"+a+" \t"+b+" \t"+x+" \t"+y+" \t"+s+" \t"+t+" \tDIST:"+d;
    }
}
