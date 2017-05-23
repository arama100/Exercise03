/**
 * Created by s1220127 on 5/19/2017.
 */
public class Bird implements Moveable {

    String name;

    Bird(String name){
        this.name = name;
    }

    public String fly(){
        return '['+this.getClass().getSimpleName()+"]:"+name+" fly!";

    }

    @Override
    public void move() {
        System.out.println(fly());
    }
}
