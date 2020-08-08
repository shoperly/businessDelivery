package service;

import org.h2.jdbcx.JdbcConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME = "sa";
    private static final String PASSWORD = "sa";

    private static final Integer DB_PORT = 9092;
    private static final String DEFAULT_URI = "jdbc:h2:tcp://localhost:" + DB_PORT + "/310project";

    private static JdbcConnectionPool pool;

    public static Connection getConnection(String uri) {

        if (pool == null) {
            pool = JdbcConnectionPool.create(uri, USERNAME, PASSWORD);
        }

        try {
            return pool.getConnection();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static String getDefaultConnectionUri() {
        return DEFAULT_URI;
    }
}
