import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMahasiswa {

    public static void main(String[] args) {

        String sql = "UPDATE mahasiswa SET semester = ? WHERE nim = ?";

        try (Connection conn = Koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, 4);
            ps.setString(2, "2310012345");

            int hasil = ps.executeUpdate();

            if (hasil > 0) {
                System.out.println("Data berhasil diperbarui!");
            } else {
                System.out.println("Data tidak ditemukan!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//UPDATE mahasiswa → tabel yang akan diubah.
//SET semester = ? → kolom yang ingin diubah.
//WHERE nim = ? → menentukan mahasiswa yang ingin diubah.