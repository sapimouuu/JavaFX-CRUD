import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HapusMahasiswa {

    public static void main(String[] args) {

        String sql = "DELETE FROM mahasiswa WHERE nim = ?";

        try (Connection conn = Koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "2310012345");

            int hasil = ps.executeUpdate();

            if (hasil > 0) {
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data tidak ditemukan!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//DELETE FROM mahasiswa → menghapus data dari tabel.
//WHERE nim = ? → menentukan data yang akan dihapus.
//executeUpdate() → menjalankan perintah DELETE.
//hasil > 0 → berarti ada data yang berhasil dihapus.