import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TampilMahasiswa {

    public static void main(String[] args) {

        String sql = "SELECT * FROM mahasiswa";

        try (Connection conn = Koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println("NIM      : " + rs.getString("nim"));
                System.out.println("Nama     : " + rs.getString("nama"));
                System.out.println("Jurusan  : " + rs.getString("jurusan"));
                System.out.println("Semester : " + rs.getInt("semester"));
                System.out.println("--------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//executeQuery() menjalankan SELECT.
//ResultSet menampung hasil query.
//rs.next() berpindah ke baris data berikutnya.
//getString() mengambil data teks.
//getInt() mengambil data angka.