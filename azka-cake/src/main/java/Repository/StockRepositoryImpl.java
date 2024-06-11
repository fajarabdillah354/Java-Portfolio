package Repository;

import Entity.Stock;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockRepositoryImpl implements StockRepository{

    private HikariDataSource dataSource;

    public StockRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Stock[] getaAll() {
        String sql = "SELECT *FROM stock";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()){

            List<Stock> list = new ArrayList<>();
            while (resultSet.next()){
                Stock stock = new Stock();
                stock.setId_stock(resultSet.getInt("id"));
                stock.setNama_stock(resultSet.getString("nama_stock"));
                stock.setQuantity(resultSet.getInt("quantity"));

                list.add(stock);

            }
            return list.toArray(new Stock[]{});
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }

    }

    @Override
    public void add(Stock stock) {
        String sql = "INSERT INTO stock(nama_stock, quantity) VALUES(?,?)";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1,stock.getNama_stock());
            statement.setInt(2,stock.getQuantity());
            statement.executeUpdate();
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }

    // checking isExist stock

    public boolean isExist(Integer number){
        String sql = "SELECT *FROM stock WHERE id_stock = ?";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,number);
            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    return true;
                }else {
                    return false;
                }
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean remove(Integer select) {
        if (isExist(select)){
            String sql = "DELETE FROM stock WHERE id_stock = ?";
            try (Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1,select);
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
