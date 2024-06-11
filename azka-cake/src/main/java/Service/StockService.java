package Service;

import Entity.Stock;

public interface StockService {
    void addStock(String namaStock, Integer jumlahStock);

    boolean removeStock(Integer numStock);

    void showStock();




}
