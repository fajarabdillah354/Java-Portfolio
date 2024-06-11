package View;

import Service.StockService;
import Util.InputStockUtil;

import java.sql.SQLOutput;

public class ViewStock {

    private StockService stockService;

    public ViewStock(StockService stockService) {
        this.stockService = stockService;
    }


    public void showStock(){
        while (true){
            stockService.showStock();

            System.out.println("Menu : ");
            System.out.println("1. Tambah Stock");
            System.out.println("2. Hapus Stock");
            System.out.println("3. Keluar");

            var input = InputStockUtil.util("Pilih");
            if (input.equals("1")){
                addStock();
            } else if (input.equals("2")) {
                removeStock();
            } else if (input.equals("3")) {
                System.out.println("******** Program Selesai ********");
                System.out.println("******** TERIMAKASIH ********");
                System.exit(0);
            }else {
                System.out.println("Perintah tidak dikenali");
            }
        }
    }

    public void addStock(){
        System.out.print("Nama Stock ");
        String nama_stock;
        nama_stock = InputStockUtil.util("Pilih(X) jika batal ");
        System.out.print("Jumlah Stock ");
        Integer jumlah_stock;
        jumlah_stock = Integer.valueOf(InputStockUtil.util("Pilih(X) jika batal "));

        if (nama_stock.equals("x")){
            //batal
        }else {
            stockService.addStock(nama_stock,jumlah_stock);
        }
    }



    public void removeStock(){
        System.out.print("Menghapus Stock ");
        var hapus = InputStockUtil.util("Pilih(x) jika batal ");
        if (hapus.equals("x")){
            //batal
        }else{
            stockService.removeStock(Integer.valueOf(hapus));
        }
    }



}
