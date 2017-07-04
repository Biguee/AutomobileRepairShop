package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Stock;

import javax.persistence.EntityManager;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class StockDaoImpl extends AbstractDaoImpl<Stock>  implements StockDao {

    public StockDaoImpl(EntityManager entityManager) {
        super(entityManager, Stock.class);
    }

}
