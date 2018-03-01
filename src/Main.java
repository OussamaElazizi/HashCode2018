import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.StrictMath.abs;

public class Main {
    public static void main(String[] args) {
        List<Ride> rides = new ArrayList<>();
        ProblemFormat format;
        String file="a_example.in";

        format = readFromFile(rides, file);




    }

    public static ProblemFormat readFromFile(List<Ride> rides, String file){
        try {
            int rows, columns, fleet, totalRides, bonus, steps;
            int a, b, x, y, s, t;
            FileReader fitxer = new FileReader(file);
            BufferedReader dis = new BufferedReader(fitxer);
            StringTokenizer tokens;
            String line;
            try {
                line = dis.readLine();
                tokens = new StringTokenizer(line, " ");
                rows=Integer.parseInt(tokens.nextToken());
                columns=Integer.parseInt(tokens.nextToken());
                fleet=Integer.parseInt(tokens.nextToken());
                totalRides=Integer.parseInt(tokens.nextToken());
                bonus=Integer.parseInt(tokens.nextToken());
                steps=Integer.parseInt(tokens.nextToken());
                ProblemFormat format =new ProblemFormat(rows,columns,fleet,totalRides,bonus,steps);
                while ((line = dis.readLine()) != null) {
                    tokens = new StringTokenizer(line, " ");
                    while (tokens.hasMoreTokens()) {
                        a=Integer.parseInt(tokens.nextToken());
                        b=Integer.parseInt(tokens.nextToken());
                        x=Integer.parseInt(tokens.nextToken());
                        y=Integer.parseInt(tokens.nextToken());
                        s=Integer.parseInt(tokens.nextToken());
                        t=Integer.parseInt(tokens.nextToken());
                        rides.add(new Ride(a,b,x,y,s,t));
                    }
                }

                return format;
            } catch (IOException e) {
                System.out.println("Error al llegir del fitxe.");
            }
            fitxer.close();
        } catch (IOException e) {
            System.out.println("No s'ha pogut obrir el fitxer.");
        }
        return null;
    }

}
