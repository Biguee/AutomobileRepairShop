package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Part;

import javax.persistence.EntityManager;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class PartDaoImpl extends AbstractDaoImpl<Part>  implements PartDao {

    public PartDaoImpl(EntityManager entityManager) {
        super(entityManager, Part.class);
    }

}
