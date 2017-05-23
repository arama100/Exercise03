/**
 * Created by s1220127 on 5/19/2017.
 */
public class Car implements Moveable {
    Car(){}

    public void move(){
        System.out.println(run());
    }

    String run(){
        return "[Car]: run!";
    }
}
