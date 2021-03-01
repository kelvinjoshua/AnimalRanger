package Models;

public class Abstract {
    public String name;
    public String age;
    public String health;
    public String type;
    public int id;

    /*getters*/

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    /*to allow us to compare objects*/
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
