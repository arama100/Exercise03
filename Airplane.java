/**
 * Created by s1220127 on 5/19/2017.
 */
public class Airplane implements Moveable{

    Airplane(){}

    public void move(){
        System.out.println(fly());
    }

    String fly() {
        return "[Airplane]: fly!";
    }
}
