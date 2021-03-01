package Models;

import org.sql2o.Connection;

import java.util.List;

public class Endangered extends general {
    private static final String STATUS = "endangered";
    private String health;
    private String age;

    public Endangered(String name, String health, String age) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.type = STATUS;
    }

    /*class-wide data*/
    public static Endangered find(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Endangered animal = con.createQuery(sql).addParameter("id", id).executeAndFetchFirst(Endangered.class);
            return animal;

        }
    }

    /*list of all unsafe animals*/
    public static List<Endangered> all() {
        String sql = "SELECT * FROM animals WHERE type = 'Not Endangered'";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Endangered.class);

        }
    }

    /*save object to database*/
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name, type, health, age) VALUES (:name, :type, :health, :age)";
            this.id = (int) con.createQuery(sql, true).addParameter("name", this.name).addParameter("type", this.type).addParameter("health", this.health).addParameter("age", this.age).executeUpdate().getKey();
        }
    }

    /*getters for private properties*/
    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    /*getter for public id*/
    public int getId() {
        return id;
    }


}
