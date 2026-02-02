package librarySeatReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_seat_db",
                "root",
                "Gokul@19@69!"   // change password
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
