package Repository;

import Entity.Product;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{

    private HikariDataSource dataSource;

    public ProductRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    private ProductRepository productRepository;

    @Override
    public Product[] getAll() {
        String sql = "SELECT * FROM product";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()){

            List<Product> list = new ArrayList<>();
            while (resultSet.next()){
                Product product = new Product();
                product.setId_product(resultSet.getInt("id_product"));
                product.setNama_product(resultSet.getString("nama_product"));
                product.setCategory(resultSet.getString("category"));
                product.setHarga(resultSet.getInt("harga"));
                product.setKeterangan_product(resultSet.getString("keterangan_product"));

                list.add(product);

            }
            return list.toArray(new Product[]{});

        }catch (SQLException exception){
            throw new RuntimeException("terjadi error : "+exception);
        }

    }

    @Override
    public Product[] getJoin() {
        String sql = "SELECT product.id_product, stock.nama_stock, product.nama_product, stock.quantity, product.category, product.harga, product.keterangan_product FROM product JOIN stock on(product.id_product = stock.id)";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet resultSet = statement.executeQuery();
            List<Product> list = new ArrayList<>();
            while (resultSet.next()){
                Product product = new Product();
                product.setId_product(resultSet.getInt("id_product"));
                product.setNama_stock(resultSet.getString("nama_stock"));
                product.setNama_product(resultSet.getString("nama_product"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setCategory(resultSet.getString("category"));
                product.setHarga(resultSet.getInt("harga"));
                product.setKeterangan_product(resultSet.getString("keterangan_product"));




                list.add(product);
            }
            return list.toArray(new Product[]{});

        }catch (SQLException exception){
            throw new RuntimeException("telah terjadi error : "+exception);
        }

    }

    @Override
    public void addProduct(Product product) {
        int id_stock = 14;
        String sql = "INSERT INTO product(id_product, nama_product, category, harga, keterangan_product) VALUES(?,?,?,?,?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            statement.setInt(1,product.getId_product());
            statement.setString(2, product.getNama_product());
            statement.setString(3,product.getCategory());
            statement.setInt(4, product.getHarga());
            statement.setString(5, product.getKeterangan_product());

            int effective = statement.executeUpdate();
            if (effective == 0){
                throw new RuntimeException("Gagal menambah data ke product");
            }

            ResultSet generateKeys = statement.getGeneratedKeys();
            if (generateKeys.next()){
                int generateId = generateKeys.getInt(1);
            }else {
                throw new RuntimeException("Gagal mengambil id_product yang digenerate");
            }


        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }

    public boolean isExist(Integer number){
        String sql = "SELECT *FROM product WHERE id_product = ?";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()){
            if (resultSet.next()){
                return true;
            }else {
                return false;
            }

        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }



    @Override
    public boolean removeProduct(Integer remove) {
        if (isExist(remove)){
            String sql = "DELETE FROM product WHERE id_product = ?";
            try (Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1,remove);
                statement.executeUpdate();
                return true;
            }catch (SQLException exception){
                throw new RuntimeException(exception);
            }
        }else {
            return false;
        }
    }



}
