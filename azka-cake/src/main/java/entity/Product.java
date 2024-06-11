package Entity;

public class Product extends Stock{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id_product;

    private String nama_product;

    private String category;

    private int harga;

    private String keterangan_product;

    public Product(int id_product,String nama_product, String category, int harga, String keterangan_product) {
        this.id_product = id_product;
        this.nama_product = nama_product;
        this.category = category;
        this.harga = harga;
        this.keterangan_product = keterangan_product;
    }

    public Product() {
    }


    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getNama_product() {
        return nama_product;
    }

    public void setNama_product(String nama_product) {
        this.nama_product = nama_product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKeterangan_product() {
        return keterangan_product;
    }

    public void setKeterangan_product(String keterangan_product) {
        this.keterangan_product = keterangan_product;
    }




}
