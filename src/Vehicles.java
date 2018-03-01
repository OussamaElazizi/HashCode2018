public class Vehicles {
    private int a,b, id;
    private boolean occuped;
    private Ride assignat;

    public Vehicles(int id) {
        this.id=id;
        this.a = 0;
        this.b = 0;
        this.occuped = false;
    }

    public int getA() {
        return a;
    }

    public Ride getAssignat() {
        return assignat;
    }

    public void setAssignat(Ride assignat) {
        this.assignat = assignat;
    }

    public void setA(int a) {
        this.a = a;

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOccuped() {
        return occuped;
    }

    public void setOccuped(boolean occuped) {
        this.occuped = occuped;
    }
}
