package Models;

import org.sql2o.Connection;

import java.util.List;

public class Safe extends general{
    private static final String STATUS = "safe";
   public Safe(String name){
        this.name=name;
        this.type= STATUS;
    }

    /*class-wide data*/
    public static Safe find(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Safe animal = con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Safe.class);
            return animal;

        }
    }

    /*list of all safe animals*/
    public static List<Safe> all() {
        String sql = "SELECT * FROM animals WHERE type = 'Not Endangered'";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Safe.class);
        }
    }

}
