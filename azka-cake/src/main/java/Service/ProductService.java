package Service;

public interface ProductService {

    void addProduct(Integer id_product, String nama_product, String category, Integer harga, String keterangan);

    boolean removeProduct(Integer product_id);

    void showProduct();



}
