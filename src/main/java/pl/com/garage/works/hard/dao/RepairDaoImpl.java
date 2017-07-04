package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Repair;

import javax.persistence.EntityManager;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class RepairDaoImpl extends AbstractDaoImpl<Repair>  implements RepairDao {

    public RepairDaoImpl(EntityManager entityManager) {
        super(entityManager, Repair.class);
    }

}
