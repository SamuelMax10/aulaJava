package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection con = null;

    public static Connection getConexao() {
        if (con == null) {
            try {
                Properties props = carregarProperties();
                String url = props.getProperty("dburl");
                con = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbExeption(e.getMessage());
            }
        }
        return con;
    }

    public static void fechaConexao() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new DbExeption(e.getMessage());
            }
        }
    }

    private static Properties carregarProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbExeption(e.getMessage());
        }

    }
}

