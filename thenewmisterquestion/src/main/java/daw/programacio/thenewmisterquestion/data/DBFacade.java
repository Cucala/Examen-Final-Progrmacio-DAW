package daw.programacio.thenewmisterquestion.data;
import java.sql.*;

public final class DBFacade {
    private static final String pathToDb = "jdbc:sqlite:thenewmisterquestion/src/main/resources/daw/programacio/thenewmisterquestion/data/";
    private static final String db = "sqlite.db";
    private static Connection conn;


    public static boolean logOn() {
        String url = pathToDb + db;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return conn != null;
    }

    public static void logOff() {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void select() {
        String sql = "SELECT * FROM question;";
        if(conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
