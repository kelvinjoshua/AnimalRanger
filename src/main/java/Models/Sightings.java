package Models;
import org.sql2o.Connection;
import java.util.List;

public class Sightings {
    private int animalId;
    private String location;
    private String ranger;
    private int id;

    /*Constructor*/
    public Sightings (String ranger, String location, int animalId ) {
        this.ranger = ranger;
        this.location = location;
        this.animalId = animalId;
    }
     /*getters*/
     public int getAnimalId() {
         return animalId;
     }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return ranger;
    }

    public int getId() {
        return id;
    }
    /*Class-wide data*/

    public static Sightings find(int id) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM sightings where id=:id";
            Sightings sighting= con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Sightings.class);
            return sighting;/*return object with specified id*/
        }
    }
    public static List<Sightings> getAll() {
        String sql = "SELECT * FROM sightings";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Sightings.class);/*all instances of Sightings*/

        }
    }

    /*save A sightings object*/
    public void save() {
        try(Connection con = DB.sql2o.open())  {
            String sql = "INSERT INTO sightings (ranger, location, animalId) VALUES (:ranger, :location, :animalId)";
            this.id = (int) con.createQuery(sql, true) .addParameter("ranger",this.ranger).addParameter("location", this.location).addParameter("animalId", this.animalId).executeUpdate().getKey();
        }
    }


}
