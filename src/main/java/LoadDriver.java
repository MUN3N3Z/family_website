import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoadDriver {
    public static void main(String[] args) {

        // Create variables for mysql connection
        String url="jdbc:mysql://localhost:3306/family_website";
        String user="root";
        String password="0706105912";
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to database is successful" + " "+ url);

        } catch(ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}