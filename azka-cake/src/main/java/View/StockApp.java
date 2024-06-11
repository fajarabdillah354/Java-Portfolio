package View;

import Repository.StockRepository;
import Repository.StockRepositoryImpl;
import Service.StockService;
import Service.StockServiceImpl;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;

public class StockApp {
    public static void main(String[] args) {
        HikariDataSource dataSource = DatabaseUtil.getHikariDataSource();
        StockRepository stockRepository = new StockRepositoryImpl(dataSource);
        StockService stockService = new StockServiceImpl(stockRepository);
        ViewStock viewStock = new ViewStock(stockService);
        viewStock.showStock();

    }
}
