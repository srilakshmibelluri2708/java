




import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    Dbconfig.url,
                    Dbconfig.user,
                    Dbconfig.password
            );

            System.out.println("✅ Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
