import java.util.ArrayList;
import java.util.List;

public class RaceSimulator {
    public static void main(String... args) {
        /*
            [Caution!] Please implement methods for each classes.
            
            Dog#run
            Cat#run
            Bird#fly
            Car#run
            Airplane#fly
        */
        List<Moveable> racers = new ArrayList<>();
        racers.add(new Dog("Pochi"));
        racers.add(new Cat("Mike"));
        racers.add(new Bird("Pilot"));
        racers.add(new Car());
        racers.add(new Airplane());

        for (Moveable racer : racers) {
            racer.move();
        }
        /*
            [Dog]Pochi: run!
            [Cat]Mike: run!
            [Bird]Pilot: fly!
            [Car]: run!
            [Airplane]: fly!
        */
    }
}