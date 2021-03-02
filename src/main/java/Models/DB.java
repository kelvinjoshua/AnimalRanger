package Models;

import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", null, null);
}
/*can be used by multiple classes setup connection before & after every test*/