package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {

        try {

            String url =
                    "jdbc:mysql://localhost:3307/student_management";

            String username = "root";

            String password = "narsi@_*123A";

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            return con;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}


