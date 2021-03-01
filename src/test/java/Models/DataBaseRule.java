package Models;
/*For multiple test classes*/
import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DataBaseRule extends ExternalResource {
    /*Setup data-base connection before every test*/
    @Override
    protected void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "bale", "kelvinjoshua");
    }
    /*Delete trailing data from previous tests before next test*/
    @Override
    protected  void after(){
        try (Connection con = DB.sql2o.open()) {
            String deleteAnimalQuery = "DELETE FROM animals *;";
            String deleteSightingQuery = "DELETE FROM sightings *;";
            con.createQuery(deleteAnimalQuery).executeUpdate();
            con.createQuery(deleteSightingQuery).executeUpdate();
        }

    }

}
