package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Order;

import javax.persistence.EntityManager;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class OrderDaoImpl extends AbstractDaoImpl<Order> implements OrderDao {

    public OrderDaoImpl(EntityManager entityManager) {
        super(entityManager, Order.class);
    }

}
