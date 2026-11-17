import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TambahMahasiswa {

    public static void main(String[] args) {

        String sql = "INSERT INTO mahasiswa (nim, nama, jurusan, semester) VALUES (?, ?, ?, ?)";

        try (Connection conn = Koneksi.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "2310012345");
            ps.setString(2, "Nurfitria Ramadhani");
            ps.setString(3, "Teknologi Informasi");
            ps.setInt(4, 3);

            ps.executeUpdate();

            System.out.println("Data mahasiswa berhasil ditambahkan!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//INSERT INTO: perintah SQL untuk menambahkan data.
//?: tempat nilai yang akan dimasukkan.
//PreparedStatement: membantu mengirim query beserta nilainya dengan aman.
//setString(): mengisi parameter bertipe teks.
//setInt(): mengisi parameter bertipe bilangan bulat.
//executeUpdate(): menjalankan perintah INSERT