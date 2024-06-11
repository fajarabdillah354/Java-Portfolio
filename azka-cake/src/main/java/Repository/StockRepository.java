package Repository;

import Entity.Stock;

public interface StockRepository {

    Stock[] getaAll();

    void add(Stock stock);

    boolean remove(Integer select);






}
