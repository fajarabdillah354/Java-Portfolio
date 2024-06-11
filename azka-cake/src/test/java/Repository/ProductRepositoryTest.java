package Repository;

import Entity.Product;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    private HikariDataSource dataSource;
    private ProductRepository productRepository;

    @BeforeEach
    void beforeEach(){
        dataSource = DatabaseUtil.getHikariDataSource();
        productRepository = new ProductRepositoryImpl(dataSource);

    }

    @Test
    void testAddProduct() {
        Product product = new Product();
        product.setId_product(1);
        product.setNama_product("Nastar");
        product.setCategory("Kue Lebaran");
        product.setHarga(50000);
        product.setKeterangan_product("Nastar keju dengan lelehan selai nanas didalamnya");
        productRepository.addProduct(product);

    }

    @Test
    void testGetJoin() {
        Product[] join = productRepository.getJoin();
        for (var getProdutToStock : join) {
            System.out.println(getProdutToStock.getId_product() +","+getProdutToStock.getNama_stock()+","+getProdutToStock.getNama_product()+","+getProdutToStock.getQuantity()+","+getProdutToStock.getCategory()+","+getProdutToStock.getHarga()+","+getProdutToStock.getKeterangan_product());
        }
    }


    @Test
    void testGetAll() {
        Product[] all = productRepository.getAll();
        for (var getAll:all) {
            System.out.println(getAll.getId_product()+","+getAll.getNama_product()+","+getAll.getCategory()+","+getAll.getHarga()+","+getAll.getKeterangan_product());
        }

    }
}
