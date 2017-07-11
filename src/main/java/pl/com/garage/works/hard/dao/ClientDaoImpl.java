package pl.com.garage.works.hard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Repair;

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
    public Client findClientbyId(int id) {
        return sessionFactory.getCurrentSession().find(Client.class, id);
    }


    @Override
    public void updateClient(String clientName, Client client) {
        client.setClientName(clientName);
        sessionFactory.getCurrentSession().update(clientName, client);
    }

    @Override
    public void deleteClient(Client client) {
        //todo
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

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//
//    private RowMapper<Client> clientRowMapper = (resultSet, rowNum) -> {
//
//        int id = resultSet.getInt("id");
//        String name = resultSet.getString("name");
//        String surname = resultSet.getString("surname");
//        String nip = resultSet.getString("nip");
//
//        return new Client(id, name, surname, nip); };
//
//    @Override
//    public void addClient(String name, String surname, String NIP) {
//        jdbcTemplate.update("insert into CLIENTS (name, surname, NIP) values (?,?,?)", name, surname, NIP);
//    }
//
//    @Override
//    public void saveClient(Client client) {
//        jdbcTemplate.update("insert into CLIENTS (name, surname, NIP) values (?,?,?)", client.getClientName(), client.getClientSurname(), client.getClientNIP());
//    }
//
//    @Override
//    public Client findClientbyId(int id) {
//        return jdbcTemplate.queryForObject("select * from clients where id=?", clientRowMapper, id);
//    }
//
//    @Override
//    public void updateClient(Client client, int id) {
//        jdbcTemplate.update("update from clients set name=?, surname=?, nip=? where id=?", client.getClientName(), client.getClientSurname(), client.getClientNIP(), id);
//        //jdbcTemplate.update("update clients set nip =? where surname=?", nip, surname);
//
//    }
//
//    @Override
//    public void deleteClientById(int id) {
//        jdbcTemplate.update("delete from clients where id=?", id);
//    }
//
//    @Override
//    public List<Client> findAllClients() {
//        return jdbcTemplate.query("select * from clients", clientRowMapper);
//    }








}
