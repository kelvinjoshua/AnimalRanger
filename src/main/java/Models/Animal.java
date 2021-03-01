package Models;
import java.util.List;

public class Animal extends Abstract {
    /*constant*/

    private static final String STATUS = "safe";
    public Animal(String name, String age,String health,String type){
        this.name=name;
        this.age = age;
        this.health = health;
        this.type= STATUS;

    }

}
