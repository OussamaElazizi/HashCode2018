import java.util.Comparator;

public class MainComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(((Ride)o1).getS()-((Ride)o2).getS()!=0){
            return ((Ride)o1).getS()-((Ride)o2).getS();
        }
        //else{
          //  if(((Ride)o1).getD()-((Ride)o2).getD()!=0){
                return ((Ride)o1).getD()-((Ride)o2).getD();
            //}
        //}
    }
}
