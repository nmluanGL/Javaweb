package quanao.webmvc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
    private static final String URL = "jdbc:mysql://localhost:3307/qlns?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Thay YOUR_PASSWORD bằng mật khẩu của bạn.

    public connectDB() {
        super();
    }

    public static Connection getConnect() {
        Connection connection = null;
        try {
            // Đảm bảo bạn đã thêm JDBC driver của MySQL vào thư viện
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối thành công!");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver JDBC! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại! Lỗi SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection conn = getConnect();
        if (conn != null) {
            System.out.println("Kết nối thành công: " + conn);
        } else {
            System.out.println("Kết nối thất bại, vui lòng kiểm tra cấu hình.");
        }
    }
}
