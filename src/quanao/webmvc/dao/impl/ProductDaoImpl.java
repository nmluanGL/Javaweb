package quanao.webmvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

import quanao.webmvc.dao.ProductDao;
import quanao.webmvc.jdbc.connectDB;
import quanao.webmvc.model.Product;

public class ProductDaoImpl implements ProductDao {
    private static final Logger logger = Logger.getLogger(ProductDaoImpl.class.getName());

    @Override
    public void insert(Product product) {
        String sql = "INSERT INTO product(catalog_id, name, price, status, description, content, discount, image_link, created) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getCatalog_id());
            ps.setString(2, product.getName());
            ps.setString(3, product.getPrice());
            ps.setString(4, product.getStatus());
            ps.setString(5, product.getDescription());
            ps.setString(6, product.getContent());
            ps.setString(7, product.getDiscount());
            ps.setString(8, product.getImage_link());
            ps.setString(9, product.getCreated());
            ps.executeUpdate();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error inserting product: {0}", e.getMessage());
        }
    }

    @Override
    public void edit(Product product) {
        String sql = "UPDATE product SET name = ?, catalog_id = ?, price = ?, status = ?, description = ?, content = ?, discount = ?, image_link = ?, created = ? WHERE id = ?";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getName());
            ps.setString(2, product.getCatalog_id());
            ps.setString(3, product.getPrice());
            ps.setString(4, product.getStatus());
            ps.setString(5, product.getDescription());
            ps.setString(6, product.getContent());
            ps.setString(7, product.getDiscount());
            ps.setString(8, product.getImage_link());
            ps.setString(9, product.getCreated());
            ps.setString(10, product.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error editing product: {0}", e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM product WHERE id = ?";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error deleting product: {0}", e.getMessage());
        }
    }

    @Override
    public Product get(int id) {
        String sql = "SELECT * FROM product WHERE id = ?";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapProduct(rs);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error getting product: {0}", e.getMessage());
        }
        return null;
    }

    @Override
    public Product get(String name) {
        String sql = "SELECT * FROM product WHERE name = ?";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapProduct(rs);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error getting product by name: {0}", e.getMessage());
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product";
        try (Connection conn = connectDB.getConnect(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                products.add(mapProduct(rs));
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error getting all products: {0}", e.getMessage());
        }
        return products;
    }

    @Override
    public List<Product> getProductById(int id) {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE catalog_id = ?";  // giả sử id là catalog_id
        try (Connection conn = connectDB.getConnect();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    products.add(mapProduct(rs));
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error getting products by catalog id: {0}", e.getMessage());
        }
        return products;
    }

    @Override
    public List<Product> searchByName(String productName) {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE name LIKE ?";
        try (Connection conn = connectDB.getConnect();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + productName + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    products.add(mapProduct(rs));
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error searching products by name: {0}", e.getMessage());
        }
        return products;
    }

    private Product mapProduct(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId(rs.getString("id"));
        product.setCatalog_id(rs.getString("catalog_id"));
        product.setName(rs.getString("name"));
        product.setPrice(rs.getString("price"));
        product.setStatus(rs.getString("status"));
        product.setDescription(rs.getString("description"));
        product.setContent(rs.getString("content"));
        product.setDiscount(rs.getString("discount"));
        product.setImage_link(rs.getString("image_link"));
        product.setCreated(rs.getString("created"));
        return product;
    }
}
