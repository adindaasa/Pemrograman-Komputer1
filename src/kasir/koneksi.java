package kasir;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {

    public static Connection Go() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("kasir1");
            m.setUser("root");
            m.setPassword("");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");

            Connection conn = m.getConnection();
            System.out.println("Koneksi sukses");
            return conn;
        } catch (SQLException e) {
            System.err.println("Koneksi gagal!\n" + e.getMessage());
        }
        return null;
    }
}