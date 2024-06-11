package Service;

import Entity.Stock;
import Repository.StockRepository;

public class StockServiceImpl implements StockService{

    private StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public void addStock(String namaStock, Integer jumlahStock) {
        Stock stock = new Stock(namaStock,jumlahStock);
        stockRepository.add(stock);
        System.out.println("Berhasil menambah stock");
    }

    @Override
    public boolean removeStock(Integer numStock) {
        boolean sukses = stockRepository.remove(numStock);
        if (sukses){
            System.out.println("Berhasil menghapus Stock");
        }else {
            System.out.println("Gagal menghapus stock");
        }
        return true;
    }

    @Override
    public void showStock() {
        System.out.println("******** ADMIN AZKACAKE ********");
        Stock[] getStock = stockRepository.getaAll();
        for (var showStock:getStock){
            System.out.println(showStock.getId_stock()+". "+showStock.getNama_stock()+", "+showStock.getQuantity());
        }
    }
}
