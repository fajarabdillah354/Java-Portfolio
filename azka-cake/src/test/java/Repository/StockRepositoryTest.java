package Repository;

import Entity.Stock;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.*;



public class StockRepositoryTest {

    private HikariDataSource dataSource;

    private StockRepository stockRepository;


    @BeforeEach
    void beforeEach(){
        dataSource = DatabaseUtil.getHikariDataSource();
        stockRepository = new StockRepositoryImpl(dataSource);
    }


    @Test
    void testAddStock() {
        Stock stock = new Stock();
        stock.setNama_stock("Nastar");
        stock.setQuantity(5);
        stockRepository.add(stock);
    }

    @Test
    void testRemoveStock() {
        System.out.println(stockRepository.remove(2));
        System.out.println(stockRepository.remove(3));
        System.out.println(stockRepository.remove(4));
        System.out.println(stockRepository.remove(6));

    }


    @Test
    void testGetAllStock() {
        stockRepository.add(new Stock("Donut Lumer", 12));
        stockRepository.add(new Stock("Tamprin Stoberi", 10));
        stockRepository.add(new Stock("Castangel", 15));

        Stock[] getALL = stockRepository.getaAll();
        for (var getCake : getALL){
            System.out.println(getCake.getId_stock()+ ". " +getCake.getNama_stock()+ ", " +getCake.getQuantity() );
        }
    }

    @AfterEach
    void afterEach() {
        dataSource.close();
    }



}