package Service;

import Entity.Product;
import Repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Integer id_product, String nama_product, String category, Integer harga, String keterangan) {
        Product product = new Product(id_product,nama_product,category,harga,keterangan);
        productRepository.addProduct(product);
    }

    @Override
    public boolean removeProduct(Integer product_id) {
        boolean berhasil = productRepository.removeProduct(product_id);
        if (berhasil){
            System.out.println("berhasil menambah product");
        }else{
            System.out.println("gagal menambah product");
        }
        return true;
    }

    @Override
    public void showProduct() {
        System.out.println("********* Data Product *******");
        Product[] products = productRepository.getJoin();
        for (var getProduct:products) {
            System.out.println(getProduct.getId_product()+","+getProduct.getNama_product()+","+getProduct.getCategory()+","+getProduct.getHarga()+","+getProduct.getKeterangan_product());
        }

        System.out.println("=========================================================================");

    }
}
