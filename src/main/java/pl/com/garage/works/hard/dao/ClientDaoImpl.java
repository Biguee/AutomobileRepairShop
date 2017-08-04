package pl.com.garage.works.hard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.garage.works.hard.model.Client;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
@Transactional
    public class ClientDaoImpl implements ClientDao {

    @Autowired
    private SessionFactory sessionFactory;


    public ClientDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void saveClient(Client client) {
        sessionFactory.getCurrentSession().save(client);
    }

    @Override
    public Client findClientById(int id) {
        return sessionFactory.getCurrentSession().find(Client.class, id);
    }


    @Override
    public void updateClient(String clientName, Client client) {
        client.setClientName(clientName);
        sessionFactory.getCurrentSession().update(clientName, client);
    }

    @Override
    public void deleteClient(Client client) {
        client.getClientName();
        sessionFactory.getCurrentSession().delete(client);
    }

    @Override
    public List<Client> findAllClients() {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();

        CriteriaQuery<Client> criteriaQuery = criteriaBuilder.createQuery(Client.class);
        criteriaQuery.from(Client.class);

        return getCurrentSession().createQuery(criteriaQuery).list();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }


}
