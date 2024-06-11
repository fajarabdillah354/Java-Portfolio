package Repository;

import Entity.Product;
import Entity.Stock;

public interface ProductRepository {
    Product[] getAll();

    Product[] getJoin();

    void addProduct(Product product);

    boolean removeProduct(Integer remove);


}
