import java.util.List;

public class ProblemFormat {
    private int rows, columns, fleet, totalRides, bonus, steps;

    private int step_actual;

    public ProblemFormat(int rows, int columns, int fleet, int totalRides, int bonus, int steps) {
        this.rows = rows;
        this.columns = columns;
        this.fleet = fleet;
        this.totalRides = totalRides;
        this.bonus = bonus;
        this.steps = steps;
        step_actual=0;
    }

    public int getVehicles(){
        return fleet;
    }

    public int modulDistancia(int x, int y){
        return StrictMath.abs(x-y);
    }

    public int distancia(int x, int y, int z, int k){
        return modulDistancia(x,y)+modulDistancia(z,k);
    }

    public int distanciaVehRide(Vehicles v, Ride r){
        return distancia(v.getA(),r.getA(),v.getB(),r.getB());
    }

    public void run(List<Vehicles> vehi, List<Ride> rides){
        boolean trobat;
        int count;
        while(step_actual<steps){
            for(Vehicles vehicle:vehi){
                trobat=false;
                count=0;
                if(!vehicle.isOccuped()){
                    while(!trobat){
                        if(distanciaVehRide(vehicle, rides.get(count))+step_actual+rides.get(count).getD()<rides.get(count).getT()){
                            vehicle.setAssignat(rides.get(count));
                            trobat=true;
                        }
                        else count++;
                        trobat=true;
                    }
                }
            }
            step_actual++;
        }
    }

    @Override
    public String toString() {
        return rows +" " + columns +" " + fleet +" " + totalRides +" " + bonus +" "+steps;
    }
}
