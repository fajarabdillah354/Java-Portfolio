package View;

import Repository.ProductRepository;
import Repository.ProductRepositoryImpl;
import Service.ProductService;
import Service.ProductServiceImpl;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;

public class ProductApp {

    public static void main(String[] args) {
        HikariDataSource hikariDataSource = DatabaseUtil.getHikariDataSource();
        ProductRepository productRepository = new ProductRepositoryImpl(hikariDataSource);
        ProductService productService = new ProductServiceImpl(productRepository);
        ViewProduct viewProduct = new ViewProduct(productService);
        viewProduct.showProduct();
    }
}
