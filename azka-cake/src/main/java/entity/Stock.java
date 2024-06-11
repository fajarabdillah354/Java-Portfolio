package Entity;

public class Stock {
    private int id_stock;

    private String nama_stock;

    private int quantity;

    public Stock() {
    }

    public Stock(String nama_stock, Integer quantity) {
        this.nama_stock = nama_stock;
        this.quantity = quantity;
    }

    public String getNama_stock() {
        return nama_stock;
    }

    public void setNama_stock(String nama_stock) {
        this.nama_stock = nama_stock;
    }


    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
