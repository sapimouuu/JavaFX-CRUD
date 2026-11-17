import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3306/latihan_javafx_jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getKoneksi() {
        try {
            Connection conn = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            System.out.println("Koneksi database berhasil!");
            return conn;

        } catch (SQLException e) {
            System.out.println("Koneksi database gagal!");
            e.printStackTrace();
            return null;
        }
    }
}

//localhost:3306 = alamat dan port MySQL XAMPP (asumsi port default).
//latihan_javafx_jdbc = nama database yang kamu buat.
//root = username default MySQL XAMPP.
//Password kosong = konfigurasi default XAMPP.