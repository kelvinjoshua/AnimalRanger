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

}
