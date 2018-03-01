import static java.lang.StrictMath.abs;

public class Main {

    public int distance(Point p1, Point p2){
        return abs(p1.getX()-p2.getX())+abs(p1.getY()-p2.getY());
    }


}
