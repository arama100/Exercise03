public class Animal implements Moveable{
    String name;
    Animal(String name){
        this.name = name;
    }

    String callName(){
        return '['+this.getClass().getSimpleName()+"]:"+"Hey!"+getName()+"!\n";
    }

    String getName(){
        return name;
    }

    String run(){
        return '['+this.getClass().getSimpleName()+"]:"+getName()+" run!";
    }

    public void move(){
        System.out.println(run());
    }
}
class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    String callName(){
        return super.callName()+"bowbow!";
    }


}

class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    String callName(){
        return super.callName()+"meow";
    }
}