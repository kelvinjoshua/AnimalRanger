package Models;

public class Abstract {
    public String name;
    public String type;
    public int id;

    /*getters*/

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    /*to allow us to compare objects*/
    /*this is testAnimal object*/
    @Override
    public boolean equals(Object testAnimal) {
        if(!(testAnimal instanceof Animal)){
            return false;
        }
        Animal newAnimal = (Animal) testAnimal;
        return this.getName().equals(newAnimal.getName()) && this.getType().equals(newAnimal.getType());
    }
    /*save object to database*/
    public void save(){

    }

}
