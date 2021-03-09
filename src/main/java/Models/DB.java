package Models;

import org.sql2o.Sql2o;

public class DB {

  public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "bale","kelvin23");

    //public static Sql2o sql2o =new Sql2o("jdbc:postgresql://ec2-3-232-163-23.compute-1.amazonaws.com:5432/d5v2041urlm5gq","szitmvwhvwojvp","7de581677cc302a99344b0261b2b8fbe05f5c4fb341336d7c4ded0ab6e1eaf07");
    //postgres://szitmvwhvwojvp:7de581677cc302a99344b0261b2b8fbe05f5c4fb341336d7c4ded0ab6e1eaf07@ec2-3-232-163-23.compute-1.amazonaws.com:5432/d5v2041urlm5gq

    //   String connectionString = "jdbc:postgresql://ec2-204-236-228-169.compute-1.amazonaws.com:5432/d2gbuioks1j7sv"; //!
//        Sql2o sql2o = new Sql2o(connectionString, "hjfgyjguaxciit", "ab84930a6217bbb75e971a6c1639efc2bff76d985dac6a24aefd16920d82155c"); //!
}

/*can be used by multiple classes setup connection before & after every test*/