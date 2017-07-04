package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Client;

import javax.persistence.EntityManager;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class ClientDaoImpl extends AbstractDaoImpl<Client> implements ClientDao {

    public ClientDaoImpl(EntityManager entityManager) {
        super(entityManager, Client.class);
    }

}
