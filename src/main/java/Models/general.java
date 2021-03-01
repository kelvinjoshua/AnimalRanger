package Models;
import org.sql2o.Connection;

public abstract class general {
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
        if(!(testAnimal instanceof general)){
            return false;
        }
        general newAnimal = (general) testAnimal;
        return this.getName().equals(newAnimal.getName()) && this.getType().equals(newAnimal.getType());
    }
    /*save object to database, Crete sql2o object to use its methods*/
    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals (name, type) VALUES (:name, :type)";
            /*this- object being added,retrieve properties*/
            /*create obj,connect into database,execute query statement,update existing fields,retrieve primary key*/
            this.id = (int) con.createQuery(sql,true).addParameter("name",this.name).addParameter(type,this.type).executeUpdate().getKey();
        }

    }

}
