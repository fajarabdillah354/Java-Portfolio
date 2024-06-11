package View;

import Service.ProductService;
import Util.InputStockUtil;

public class ViewProduct {

    private ProductService productService;

    public ViewProduct(ProductService productService) {
        this.productService = productService;
    }

    void showProduct(){
        while (true){
            productService.showProduct();

            System.out.println("Menu yang Tersedia : ");
            System.out.println("1. Tambah Product");
            System.out.println("2. Hapus Product");
            System.out.println("3. Keluar");

            var input = InputStockUtil.util("Pilih");
            if (input.equals("1")){
                addProduct();
            } else if (input.equals("2")) {
                removeProduct();
            }else {
                System.out.println("PERINTAH TIDAK VALID");
            }

        }
    }


    public void addProduct(){
        System.out.print("Id_product ");
        int id_product = Integer.parseInt(InputStockUtil.util("PILIH (X atau 0) JIKA BATAL"));
        System.out.print("Nama_product ");
        String nama_product = InputStockUtil.util("PILIH (X) JIKA BATAL ");
        System.out.print("Category ");
        String category = InputStockUtil.util("PILIH (X) JIKA BATAL ");
        System.out.print("Harga ");
        int harga = Integer.parseInt(InputStockUtil.util("PILIH (X) JIKA BATAL "));
        System.out.print("Keterangan ");
        String keterangan = InputStockUtil.util("PILIH (X) JIKA BATAL ");

        if (id_product == 0 ){
            //batal
        }else {
            productService.addProduct(id_product,nama_product,category,harga,keterangan);
        }


    }

    public void removeProduct(){
        System.out.print("Menghapus Product ");
        var del =  InputStockUtil.util("PILIH (X) JIKA BATAL ");
        if (del.equals("x") || del.equals("X")){
            //BATAL
        }else {
            productService.removeProduct(Integer.valueOf(del));
        }
    }


}
